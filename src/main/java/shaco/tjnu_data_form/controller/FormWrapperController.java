package shaco.tjnu_data_form.controller;

import com.mybatisflex.core.query.QueryWrapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import shaco.tjnu_data_form.entity.FormStructure;
import shaco.tjnu_data_form.entity.FormWrapper;
import shaco.tjnu_data_form.Util.MyInvocationHandler;
import shaco.tjnu_data_form.mapper.FormStructureMapper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;

import static shaco.tjnu_data_form.Util.ChineseToPinyinInitials.convertChineseToPinyinInitials;
import static shaco.tjnu_data_form.Util.ChineseToPinyinInitials.getPinyinInitial;

@CrossOrigin
@RestController
@RequestMapping("/form_wrapper")
public class FormWrapperController {
    @Autowired
    private FormStructureMapper formStructureMapper;

    /**
     * 查询该用户有权限编辑的所有报表。
     *
     * @param userToken 用户token
     * @return List<FormStructure>
     */
    @GetMapping("getFormList")
    public List<FormStructure> getFormList(@RequestParam("userToken") String userToken) {
        // todo 解析usertoken 校验用户权限

        QueryWrapper queryWrapper = new QueryWrapper();
        // todo 传入用户权限参数
        queryWrapper.select("form_id,form_name").from("form_structure").where("form_permissions=?", "");

        return formStructureMapper.selectListByQuery(queryWrapper);
    }


    private Class<?> clazz;

    /**
     * 根据表Id 表类型 表年份 查询报表的 结构和数据
     *
     * @param formId              表Id
     * @param formType            表类型
     * @param formStatisticalTime 统计时点
     * @return 所有数据
     */
    @GetMapping("getForm")
    public FormWrapper getForm(@RequestParam("formId") String formId, @RequestParam("formType") String formType, @RequestParam("formStatisticalTime") int formStatisticalTime) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        FormWrapper formWrapper = new FormWrapper();
        /*
        获取表信息：
        表名 表id 表统计时间 表列头 表数据
         */
        QueryWrapper formStructureQueryWrapper = new QueryWrapper();
        formStructureQueryWrapper.select().from("form_structure").where("form_id=?", formId);

        List<FormStructure> formdata = formStructureMapper.selectListByQuery(formStructureQueryWrapper);
        /*
        id
         */
        formWrapper.setFormId(formdata.get(0).getFormId());
        /*
        name
         */
        formWrapper.setFormName(formdata.get(0).getFormName());
        /*
        col
         */
        formWrapper.setFormColumnName(Arrays.asList(formdata.get(0).getFormColumn().split(",")));

        QueryWrapper formDataQueryWrapper = new QueryWrapper();
        formDataQueryWrapper.select().from(getPinyinInitial(formId + "_dx"));

        /** 通过反射调用mapper查数据 **/
        String mapperStr = "shaco.tjnu_data_form.mapper." + convertChineseToPinyinInitials(formId) + "DxMapper";
        clazz = Class.forName(mapperStr);

        /**创建动态代理并使用反射**/
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        myInvocationHandler.setTarget(clazz);
        Object object = Proxy.newProxyInstance(clazz.getClassLoader(),
                new Class[]{clazz},
                myInvocationHandler);

        Method selectListByQuery = object.getClass().getDeclaredMethod("selectListByQuery", QueryWrapper.class);

        List<?> result = (List<?>) selectListByQuery.invoke(object, formDataQueryWrapper);

        formWrapper.setFormRows(result);

        formWrapper.setFormStatisticalTime(2024);
        return formWrapper;
    }

    @Autowired
    private ApplicationContext applicationContext;

    /**
     * 根据表Id 表类型 表年份 查询报表的 结构和数据
     *
     * @param formId              表Id
     * @param formType            表类型
     * @param formStatisticalTime 统计时点
     * @return 所有数据
     */
    @PutMapping("saveOrUpdate")
    public boolean saveOrUpdate(@RequestParam("formId") String formId, @RequestParam("formType") String formType, @RequestParam("formStatisticalTime") int formStatisticalTime, @RequestBody Object objIn) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        /** 通过反射调用mapper查数据 **/
        String serviceStr = "shaco.tjnu_data_form.service." + convertChineseToPinyinInitials(formId) + "DxService";
//        WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
        clazz = Class.forName(serviceStr);
        String entityStr = "shaco.tjnu_data_form.entity." + convertChineseToPinyinInitials(formId) + "DX";
        Class<?> entityClz = Class.forName(entityStr);
        Object serviceBean = applicationContext.getBean(clazz);

        Method saveOrUpdate = clazz.getDeclaredMethod("saveOrUpdate", entityClz);
//        saveOrUpdate.setAccessible(true);
//        assert wac != null;

        return (boolean) saveOrUpdate.invoke(serviceBean, objIn);
    }
}

