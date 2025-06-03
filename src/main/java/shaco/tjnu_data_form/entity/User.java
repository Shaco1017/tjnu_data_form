package shaco.tjnu_data_form.entity;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import java.io.Serializable;
import java.sql.Timestamp;

import java.io.Serial;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户表 实体类。
 *
 * @author shaco
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("user")
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id(keyType = KeyType.Auto)
    private Integer id;

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
     * 用户密码
     */
    private String password;

    /**
     * 部门编号
     */
    private String departmentId;

    /**
     * 用户状态(1启用，0停用）
     */
    private Integer status;

    /**
     * 用户创建时间
     */
    private Timestamp createTime;

}
