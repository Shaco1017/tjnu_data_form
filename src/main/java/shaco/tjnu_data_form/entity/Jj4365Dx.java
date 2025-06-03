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
 * 研究生指导教师情况 实体类。
 *
 * @author shaco
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("jj4365_dx")
public class Jj4365Dx implements Serializable {

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
     * #人事关系在本校
     */
    private Integer localRelation;

    /**
     * 29岁以下
     */
    @Column("age_under_29")
    private Integer ageUnder29;

    /**
     * 30-34岁
     */
    @Column("age_between_30_34")
    private Integer ageBetween3034;

    /**
     * 35-39岁
     */
    @Column("age_between_35_39")
    private Integer ageBetween3539;

    /**
     * 40-44岁
     */
    @Column("age_between_40_44")
    private Integer ageBetween4044;

    /**
     * 45-49岁
     */
    @Column("age_between_45_49")
    private Integer ageBetween4549;

    /**
     * 50-54岁
     */
    @Column("age_between_50_54")
    private Integer ageBetween5054;

    /**
     * 55-59岁
     */
    @Column("age_between_55_59")
    private Integer ageBetween5559;

    /**
     * 60-64岁
     */
    @Column("age_between_60_64")
    private Integer ageBetween6064;

    /**
     * 65岁以上
     */
    @Column("age_over_65")
    private Integer ageOver65;

    /**
     * 按工作年限分_21年以上
     */
    @Column("age_over_21")
    private Integer ageOver21;

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
