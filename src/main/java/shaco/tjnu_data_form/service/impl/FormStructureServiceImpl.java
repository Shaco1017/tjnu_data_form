package shaco.tjnu_data_form.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import shaco.tjnu_data_form.entity.FormStructure;
import shaco.tjnu_data_form.mapper.FormStructureMapper;
import shaco.tjnu_data_form.service.FormStructureService;
import org.springframework.stereotype.Service;

/**
 * 报表结构表 服务层实现。
 *
 * @author shaco
 * @since 1.0.0
 */
@Service
public class FormStructureServiceImpl extends ServiceImpl<FormStructureMapper, FormStructure>  implements FormStructureService{

}
