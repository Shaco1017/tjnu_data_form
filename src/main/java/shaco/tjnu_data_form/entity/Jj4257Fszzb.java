package shaco.tjnu_data_form.entity;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import java.io.Serial;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 职业教育学校专任教师教学领域所属大类情况 实体类。
 *
 * @author shaco
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("jj4257_fszzb")
public class Jj4257Fszzb implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id(keyType = KeyType.Auto)
    private Integer id;

    /**
     * 指标名称
     */
    private String indicatorName;

    /**
     * 代码
     */
    private Integer code;

    /**
     * 合计人数
     */
    private Integer totalCount;

    /**
     * #女
     */
    private Integer femaleCount;

    /**
     * 正高级人数
     */
    private Integer seniorTitle;

    /**
     * 副高级人数
     */
    private Integer associateTitle;

    /**
     * 中级人数
     */
    private Integer lecturerTitle;

    /**
     * 初级人数
     */
    private Integer assistantTitle;

    /**
     * 未定职级人数
     */
    private Integer undeterminedTitle;

    /**
     * 统计时点
     */
    private Date statisticalTime;

    /**
     * 报表类型(校区，续，续1，续2)
     */
    private String tableType;

    private Timestamp createTime;

    private String createId;

    private Timestamp updateTime;

    private String updateId;

    private Timestamp removeTime;

    private String removeId;

    private Boolean removed;

}
