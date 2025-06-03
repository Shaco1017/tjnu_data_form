package shaco.tjnu_data_form.entity;

import com.mybatisflex.annotation.Column;
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
 * 专职辅导员分年龄、专业技术职务、学历情况 实体类。
 *
 * @author shaco
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("jj4366_dx")
public class Jj4366Dx implements Serializable {

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
     * 合计
     */
    private Integer totalCount;

    /**
     * #女
     */
    private Integer femaleCount;

    /**
     * 本专科生专职辅导员
     */
    private Integer counselorUndergraduate;

    /**
     * 19岁以下
     */
    @Column("counselor_undergraduate_age_under_19")
    private Integer counselorUndergraduateAgeUnder19;

    /**
     * 20-29岁
     */
    @Column("counselor_undergraduate_age_between_30_34")
    private Integer counselorUndergraduateAgeBetween3034;

    /**
     * 30-39岁
     */
    @Column("counselor_undergraduate_age_between_35_39")
    private Integer counselorUndergraduateAgeBetween3539;

    /**
     * 40-49岁
     */
    @Column("counselor_undergraduate_age_between_40_44")
    private Integer counselorUndergraduateAgeBetween4044;

    /**
     * 50岁以上
     */
    @Column("counselor_undergraduate_age_over_50")
    private Integer counselorUndergraduateAgeOver50;

    /**
     * 研究生专职辅导员
     */
    private Integer counselorGraduate;

    /**
     * 19岁以下
     */
    @Column("counselor_graduate_age_under_19")
    private Integer counselorGraduateAgeUnder19;

    /**
     * 20-29岁
     */
    @Column("counselor_graduate_age_between_30_34")
    private Integer counselorGraduateAgeBetween3034;

    /**
     * 30-39岁
     */
    @Column("counselor_graduate_age_between_35_39")
    private Integer counselorGraduateAgeBetween3539;

    /**
     * 40-49岁
     */
    @Column("counselor_graduate_age_between_40_44")
    private Integer counselorGraduateAgeBetween4044;

    /**
     * 50岁以上
     */
    @Column("counselor_graduate_age_over_50")
    private Integer counselorGraduateAgeOver50;

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
