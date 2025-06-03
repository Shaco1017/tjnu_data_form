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
 * 教育事业综合统计调查表 实体类。
 *
 * @author shaco
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("jjfm_dx")
public class JjfmDx implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id(keyType = KeyType.Auto)
    private Integer id;

    /**
     * 学 校（机 构）_名称
     */
    private String schoolName;

    /**
     * 专业代码
     */
    private String majorCode;

    /**
     * 自主专业名称
     */
    private String autonomousMajorName;

    /**
     * 年制
     */
    private Integer majorPeriod;

    /**
     * 毕业生数
     */
    private Integer graduates;

    /**
     * #职业类证书
     */
    private Integer vocationalCertificates;

    /**
     * #职业技能等级证书
     */
    private Integer skillsCertificates;

    /**
     * 招生数
     */
    private Integer enrollment;

    /**
     * 在校生数
     */
    private Integer currentStudents;

    /**
     * 在校生数_#现代学徒制
     */
    private Integer modernApprenticeship;

    /**
     * 在校生数_一年级
     */
    @Column("grade_1")
    private Integer grade1;

    /**
     * 在校生数_二年级
     */
    @Column("grade_2")
    private Integer grade2;

    /**
     * 在校生数_三年级
     */
    @Column("grade_3")
    private Integer grade3;

    /**
     * 在校生数_四年级以上
     */
    @Column("grade_over_4")
    private Integer gradeOver4;

    /**
     * 预计毕业生数
     */
    private Integer predictGraduates;

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
