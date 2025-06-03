package shaco.tjnu_data_form.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import shaco.tjnu_data_form.entity.OperationLog;
import shaco.tjnu_data_form.mapper.OperationLogMapper;
import shaco.tjnu_data_form.service.OperationLogService;
import org.springframework.stereotype.Service;

/**
 * 操作日志表 服务层实现。
 *
 * @author shaco
 * @since 1.0.0
 */
@Service
public class OperationLogServiceImpl extends ServiceImpl<OperationLogMapper, OperationLog>  implements OperationLogService{

}
