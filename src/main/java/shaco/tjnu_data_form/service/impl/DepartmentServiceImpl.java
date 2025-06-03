package shaco.tjnu_data_form.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import shaco.tjnu_data_form.entity.Department;
import shaco.tjnu_data_form.mapper.DepartmentMapper;
import shaco.tjnu_data_form.service.DepartmentService;
import org.springframework.stereotype.Service;

/**
 * 部门表 服务层实现。
 *
 * @author shaco
 * @since 1.0.0
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department>  implements DepartmentService{

}
