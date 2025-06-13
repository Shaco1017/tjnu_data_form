package shaco.tjnu_data_form.controller;

import com.mybatisflex.core.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;
import shaco.tjnu_data_form.entity.FormStructure;
import shaco.tjnu_data_form.entity.FormDTO;
import shaco.tjnu_data_form.util.CnTransformUtil;
import shaco.tjnu_data_form.util.MyInvocationHandler;
import shaco.tjnu_data_form.mapper.FormStructureMapper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/form_dto")
public class FormDTOController {
    @Autowired
    private FormStructureMapper formStructureMapper;
    private Class<?> clazz;

    /**
     * 根据表Id 表类型 表年份 查询报表的 结构和数据
     *
     * @param formId              表Id
     * @param formStatisticalTime 统计时点
     * @return 所有数据
     */
    @GetMapping("getFormDTO")
    public FormDTO getFormDTO(@RequestParam("formId") String formId, @RequestParam("formStatisticalTime") int formStatisticalTime) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        FormDTO formDTO = new FormDTO();
        /*查询表结构*/
        QueryWrapper formStructureQueryWrapper = new QueryWrapper();
        formStructureQueryWrapper.select().from("form_structure").where("form_id=?", formId);
        FormStructure formStructure = formStructureMapper.selectOneByQuery(formStructureQueryWrapper);

        formDTO.setFormId(formStructure.getFormId());
        formDTO.setFormName(formStructure.getFormName());
        formDTO.setFormColumnName(Arrays.asList(formStructure.getFormColumn().split(",")));

        /*查询表数据*/
        QueryWrapper formDataQueryWrapper = new QueryWrapper();
        formDataQueryWrapper.select().from(formId);

        /**
         * 通过反射调用mapper查数据
         */
        String mapperStr = "shaco.tjnu_data_form.mapper." + CnTransformUtil.convert(formId) + "DxMapper";
        clazz = Class.forName(mapperStr);

        /**
         * 创建动态代理并使用反射
         */
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        myInvocationHandler.setTarget(clazz);
        Object object = Proxy.newProxyInstance(clazz.getClassLoader(),
                new Class[]{clazz},
                myInvocationHandler);

        Method selectListByQuery = object.getClass().getDeclaredMethod("selectListByQuery", QueryWrapper.class);

        List<?> result = (List<?>) selectListByQuery.invoke(object, formDataQueryWrapper);

        formDTO.setFormRows(result);

        formDTO.setFormStatisticalTime(2024);
        return formDTO;
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
        String serviceStr = "shaco.tjnu_data_form.service." + CnTransformUtil.convert(formId) + "DxService";
//        WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
        clazz = Class.forName(serviceStr);
        String entityStr = "shaco.tjnu_data_form.entity." + CnTransformUtil.convert(formId) + "DX";
        Class<?> entityClz = Class.forName(entityStr);
        Object serviceBean = applicationContext.getBean(clazz);

        Method saveOrUpdate = clazz.getDeclaredMethod("saveOrUpdate", Class.forName("T"));
//        saveOrUpdate.setAccessible(true);
//        assert wac != null;

        return (boolean) saveOrUpdate.invoke(serviceBean, objIn);
    }

    // /form/getForm?formId=教基3324校区_大学

}

