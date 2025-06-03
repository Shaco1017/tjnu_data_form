package shaco.tjnu_data_form.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shaco.tjnu_data_form.entity.Jj1001Dx;

@RestController
@RequestMapping("/form_wrapper")
public class FormWrapperController {

    Jj1001Dx jj1001Dx = new Jj1001Dx();
    Class<Jj1001Dx> jj1001DxClass = Jj1001Dx.class;


    public FormWrapperController() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("shaco.tjnu_data_form.entity.Jj1001Dx");

        //获取类名
        String name = clazz.getName();
        String simpleName = clazz.getSimpleName();
        System.out.println("类名（带包名称）：" + name);
        System.out.println("类名（不带包名称）：" + simpleName);

    }
}

