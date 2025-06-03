package shaco.tjnu_data_form.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import shaco.tjnu_data_form.entity.User;
import shaco.tjnu_data_form.mapper.UserMapper;
import shaco.tjnu_data_form.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 用户表 服务层实现。
 *
 * @author shaco
 * @since 1.0.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>  implements UserService{

}
