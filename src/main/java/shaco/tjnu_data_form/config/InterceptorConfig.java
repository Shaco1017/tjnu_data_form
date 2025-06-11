package shaco.tjnu_data_form.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import shaco.tjnu_data_form.interceptor.FormDataInterceptor;
import shaco.tjnu_data_form.interceptor.FormUpdateInterceptor;
import shaco.tjnu_data_form.interceptor.TokenInterceptor;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    //自动装配拦截器
    @Autowired
    private TokenInterceptor tokenInterceptor;
    @Autowired
    private FormUpdateInterceptor formUpdateInterceptor;
    @Autowired
    private FormDataInterceptor formDataInterceptor;


    //注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(tokenInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/user/login");
//        registry.addInterceptor(formUpdateInterceptor)
//                .addPathPatterns("/common/getFormData");
        registry.addInterceptor(formDataInterceptor)
                .addPathPatterns("/common/getFormData");
    }

}
