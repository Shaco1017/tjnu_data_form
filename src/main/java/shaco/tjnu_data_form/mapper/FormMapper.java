package shaco.tjnu_data_form.mapper;

import com.mybatisflex.core.BaseMapper;
import org.apache.ibatis.annotations.*;
import shaco.tjnu_data_form.entity.Form;
import shaco.tjnu_data_form.entity.User;

/**
 * 报表表 映射层。
 *
 * @author shaco
 * @since 1.0.0
 */
public interface FormMapper extends BaseMapper<Form> {
    User findUser(@Param("username")String username);
}
