package shaco.tjnu_data_form.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    /**
     * 用户编号
     */
    private String userId;

    /**
     * 用户账号
     */
    private String userAccount;

    /**
     * 用户姓名
     */
    private String userName;


    /**
     * 部门编号
     */
    private String departmentId;

    /**
     * 用户状态(1启用，0停用）
     */
    private Integer status;

}
