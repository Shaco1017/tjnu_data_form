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
 * 心理咨询工作人员（心理健康教育教师）情况 实体类。
 *
 * @author shaco
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("jj4064_dx")
public class Jj4064Dx implements Serializable {

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
     * #接受过专业教育
     */
    private Integer hasProfessionalEdu;

    /**
     * 按工作年限分_4年以下
     */
    @Column("work_experience_under_4")
    private Integer workExperienceUnder4;

    /**
     * 按工作年限分_5-10年
     */
    @Column("work_experience_between_5_10")
    private Integer workExperienceBetween510;

    /**
     * 按工作年限分_11-20年
     */
    @Column("work_experience_between_11_20")
    private Integer workExperienceBetween1120;

    /**
     * 按工作年限分_21年以上
     */
    @Column("work_experience_over_21")
    private Integer workExperienceOver21;

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
