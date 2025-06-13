package shaco.tjnu_data_form.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import shaco.tjnu_data_form.interceptor.FormUpdateInterceptor;
import shaco.tjnu_data_form.interceptor.TokenInterceptor;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    //自动装配拦截器
    @Autowired
    private TokenInterceptor tokenInterceptor;


    //注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(tokenInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/user/login");
    }

}
