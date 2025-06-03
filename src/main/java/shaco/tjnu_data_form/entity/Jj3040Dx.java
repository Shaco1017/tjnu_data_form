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
 * 学生变动情况 实体类。
 *
 * @author shaco
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("jj3040_dx")
public class Jj3040Dx implements Serializable {

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
     * 上学年初在校生数
     */
    private Integer previousYearStudents;

    /**
     * 增加学生总数
     */
    private Integer totalIncrease;

    /**
     * 招生数
     */
    private Integer newEnrollment;

    /**
     * 复学数
     */
    private Integer returnFromLeave;

    /**
     * 转入数
     */
    private Integer transferIn;

    /**
     * 退役复学数
     */
    private Integer militaryReturn;

    /**
     * 其他增加数
     */
    private Integer otherIncrease;

    /**
     * 减少学生总数
     */
    private Integer totalDecrease;

    /**
     * 毕业数
     */
    private Integer graduates;

    /**
     * 结业数
     */
    private Integer completions;

    /**
     * 休学数
     */
    private Integer suspensions;

    /**
     * 退学数
     */
    private Integer dropouts;

    /**
     * 死亡数
     */
    private Integer deaths;

    /**
     * 转出数
     */
    private Integer transferOut;

    /**
     * 应征入伍数
     */
    private Integer enlistments;

    /**
     * 其他减少数
     */
    private Integer otherDecrease;

    /**
     * 本学年初在校生数
     */
    private Integer currentYearStudents;

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
