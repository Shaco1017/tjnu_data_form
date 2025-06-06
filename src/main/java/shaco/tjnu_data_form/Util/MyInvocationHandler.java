package shaco.tjnu_data_form.Util;

import jakarta.annotation.PostConstruct;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

@Component
public class MyInvocationHandler implements InvocationHandler {
    @Autowired
    private SqlSession sqlSession;
    private static Object target;

    private static SqlSession session;

    @PostConstruct
    public void init() {
        session = sqlSession;
    }


    public void setTarget(Class clazz) {
        target = session.getMapper(clazz);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target, args);
    }

}
