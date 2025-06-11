package shaco.tjnu_data_form.controller;

import com.mybatisflex.core.query.QueryWrapper;
import org.springframework.web.bind.annotation.*;
import shaco.tjnu_data_form.Util.MyInvocationHandler;
import shaco.tjnu_data_form.common.Result;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import static shaco.tjnu_data_form.Util.ChineseToPinyinInitials.convertChineseToPinyinInitials;

@RestController
@RequestMapping("/form")
public class FormController {

    @GetMapping("/getFormData")
    public Result getFormData(@RequestParam("formStatisticalTime") Integer formStatisticalTime, @RequestParam("formId") String formId) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.select().from(formId).where("statistical_time=?", formStatisticalTime);

        /*通过反射调用mapper查数据*/
        String mapperStr = "shaco.tjnu_data_form.mapper." + convertChineseToPinyinInitials(formId) + "Mapper";
        Class<?> clazz = Class.forName(mapperStr);

        /*创建动态代理并使用反射*/
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        myInvocationHandler.setTarget(clazz);
        Object mapper = Proxy.newProxyInstance(clazz.getClassLoader(),
                new Class[]{clazz},
                myInvocationHandler);
        Method selectListByQuery = mapper.getClass().getDeclaredMethod("selectListByQuery", QueryWrapper.class);
        return Result.success(selectListByQuery.invoke(mapper, queryWrapper));
    }

    @GetMapping("/getFormData")
    public Result getPreviousFormData(@RequestParam("formStatisticalTime") Integer formStatisticalTime, @RequestParam("formId") String formId) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.select().from(formId).where("statistical_time=?", formStatisticalTime - 1);

        /*通过反射调用mapper查数据*/
        String mapperStr = "shaco.tjnu_data_form.mapper." + convertChineseToPinyinInitials(formId) + "Mapper";
        Class<?> clazz = Class.forName(mapperStr);

        /*创建动态代理并使用反射*/
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        myInvocationHandler.setTarget(clazz);
        Object mapper = Proxy.newProxyInstance(clazz.getClassLoader(),
                new Class[]{clazz},
                myInvocationHandler);
        Method selectListByQuery = mapper.getClass().getDeclaredMethod("selectListByQuery", QueryWrapper.class);
        return Result.success(selectListByQuery.invoke(mapper, queryWrapper));
    }


    /**
     * 根据表Id 表类型 表年份 查询报表的 结构和数据
     *
     * @param formId              表Id
     * @param formStatisticalTime 统计时点
     * @return 所有数据
     */
    @PutMapping("saveOrUpdate")
    public Result saveOrUpdate(@RequestParam("formId") String formId, @RequestParam("formStatisticalTime") int formStatisticalTime, @RequestBody Object objIn) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.select().from(formId).where("statistical_time=?", formStatisticalTime);

        /*通过反射调用mapper查数据*/
        String mapperStr = "shaco.tjnu_data_form.mapper." + convertChineseToPinyinInitials(formId) + "Mapper";
        Class<?> clazz = Class.forName(mapperStr);

        /*创建动态代理并使用反射*/
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        myInvocationHandler.setTarget(clazz);
        Object mapper = Proxy.newProxyInstance(clazz.getClassLoader(),
                new Class[]{clazz},
                myInvocationHandler);
        Method insertOrUpdate = mapper.getClass().getDeclaredMethod("insertOrUpdate", Class.forName("T"));

        return Result.success(insertOrUpdate.invoke(mapper, objIn));
    }

}
