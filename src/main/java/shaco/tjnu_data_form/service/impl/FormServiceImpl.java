package shaco.tjnu_data_form.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import shaco.tjnu_data_form.entity.Form;
import shaco.tjnu_data_form.mapper.FormMapper;
import shaco.tjnu_data_form.service.FormService;
import org.springframework.stereotype.Service;

/**
 * 报表表 服务层实现。
 *
 * @author shaco
 * @since 1.0.0
 */
@Service
public class FormServiceImpl extends ServiceImpl<FormMapper, Form>  implements FormService{

}
