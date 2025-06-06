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
 * 报表结构表 实体类。
 *
 * @author shaco
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("form_structure")
public class FormStructure implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id(keyType = KeyType.Auto)
    private Integer id;

    /**
     * 报表编号
     */
    private String formId;

    /**
     * 报表名称
     */
    private String formName;

    private String formColumn;

    private String formRow;

    /**
     * 报表创建时间
     */
    private Timestamp createTime;

    /**
     * 报表更新时间
     */
    private Timestamp updateTime;

}
