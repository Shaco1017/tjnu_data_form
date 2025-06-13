package shaco.tjnu_data_form.controller;

import com.mybatisflex.core.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shaco.tjnu_data_form.entity.OperationLog;
import shaco.tjnu_data_form.mapper.OperationLogMapper;
import shaco.tjnu_data_form.service.OperationLogService;
import shaco.tjnu_data_form.util.CnTransformUtil;
import shaco.tjnu_data_form.util.JwtUtil;
import shaco.tjnu_data_form.util.MyInvocationHandler;
import shaco.tjnu_data_form.common.Result;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Timestamp;
import java.time.LocalDateTime;


@RestController
@RequestMapping("/form")
public class FormController {
    @Autowired
    private OperationLogService operationLogService;

    @GetMapping("/getFormData")
    public Result getFormData(@RequestParam("formStatisticalTime") Integer formStatisticalTime, @RequestParam("formId") String formId) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.select().from(formId).where("statistical_time=?", formStatisticalTime);
        /*通过反射调用mapper查数据*/
        String mapperStr = "shaco.tjnu_data_form.mapper." + CnTransformUtil.convert(formId) + "Mapper";
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

    @GetMapping("/getPreviousFormData")
    public Result getPreviousFormData(@RequestParam("formStatisticalTime") Integer formStatisticalTime, @RequestParam("formId") String formId) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.select().from(formId).where("statistical_time=?", formStatisticalTime - 1);

        /*通过反射调用mapper查数据*/
        String mapperStr = "shaco.tjnu_data_form.mapper." + CnTransformUtil.convert(formId) + "Mapper";
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
     * @param formId 表Id
     * @return 所有数据
     */
    @PutMapping("/saveOrUpdate")
    public Result saveOrUpdate(@RequestHeader("token") String token, @RequestParam("formId") String formId, @RequestBody Object objIn) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        /*通过反射调用mapper查数据*/
        String mapperStr = "shaco.tjnu_data_form.mapper." + CnTransformUtil.convert(formId) + "Mapper";
        System.out.println(objIn);
        Class<?> clazz = Class.forName(mapperStr);
        System.out.println(clazz);

        /*创建动态代理并使用反射*/
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        myInvocationHandler.setTarget(clazz);
        Object mapper = Proxy.newProxyInstance(clazz.getClassLoader(),
                new Class[]{clazz},
                myInvocationHandler);
        //Method insertOrUpdate = mapper.getClass().getDeclaredMethod("insertOrUpdate", Class.forName("shaco.tjnu_data_form.entity."+CnTransformUtil.convert(formId)));
        Method insertOrUpdate = mapper.getClass().getDeclaredMethod("insertOrUpdate", Object.class);
        System.out.println(insertOrUpdate);
        insertOrUpdate.invoke(mapper, objIn);

//        operationLogService.save(OperationLog.builder().
//                operationId("1234").
//                type("Update").
//                targetFormId(formId).
//                userId(JwtUtil.verifyAndGetUser(token).getUserId()).
//                content("更新表单" + formId + "数据").
//                build());


        return Result.success();
    }

}
