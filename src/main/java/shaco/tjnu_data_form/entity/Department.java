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
 * 部门表 实体类。
 *
 * @author shaco
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("department")
public class Department implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id(keyType = KeyType.Auto)
    private Integer id;

    /**
     * 部门编号
     */
    private String departmentId;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 部门创建时间
     */
    private Timestamp createTime;

    /**
     * 部门更新时间
     */
    private Timestamp updateTime;

    /**
     * 部门是否删除
     */
    private Boolean deleted;

}
