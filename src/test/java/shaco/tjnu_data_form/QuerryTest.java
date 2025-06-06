package shaco.tjnu_data_form;

import com.mybatisflex.core.query.QueryWrapper;
import shaco.tjnu_data_form.Util.MyInvocationHandler;
import shaco.tjnu_data_form.mapper.FormStructureMapper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

import static shaco.tjnu_data_form.controller.FormWrapperController.getPinyinInitial;
import static shaco.tjnu_data_form.Util.ChineseToPinyinInitials.convertChineseToPinyinInitials;

public class QuerryTest {
    private static FormStructureMapper formMapper;

    static QueryWrapper queryWrapper;

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String formId = "教基3324";
        QueryWrapper formDataQueryWrapper = new QueryWrapper();
        formDataQueryWrapper.select().from(getPinyinInitial(formId));

        /**通过反射调用mapper查数据**/
        String mapperStr = "shaco.tjnu_data_form.mapper." + convertChineseToPinyinInitials(formId) + "DxMapper";
        Class clazz = Class.forName(mapperStr);

/**创建动态代理并使用反射**/
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        myInvocationHandler.setTarget(clazz);
        Object object = Proxy.newProxyInstance(clazz.getClassLoader(),
                new Class[]{clazz},
                myInvocationHandler);

        Method selectById = object.getClass().getDeclaredMethod("selectAll");

/**调用方法查询数据库**/
        selectById.setAccessible(true);
        List<?> result = (List<?>) selectById.invoke(object);
        List<List<?>> results = new ArrayList<>();
        results.add(result);

    }
}
