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
 * 操作日志表 实体类。
 *
 * @author shaco
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("operation_log")
public class OperationLog implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id(keyType = KeyType.Auto)
    private Integer id;

    /**
     * 操作编号
     */
    private String operationId;

    /**
     * 操作报表编号
     */
    private String targetFormId;

    /**
     * 操作类型
     */
    private String type;

    /**
     * 操作内容
     */
    private String content;

    /**
     * 操作用户编号
     */
    private String userId;

    /**
     * 操作创建时间
     */
    private Timestamp createTime;

    /**
     * 操作更新时间
     */
    private Timestamp updateTime;

}
