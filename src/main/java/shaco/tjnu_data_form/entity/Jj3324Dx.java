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
 * 高等职业教育专科分专业学生数 实体类。
 *
 * @author shaco
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("jj3324_dx")
public class Jj3324Dx implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id(keyType = KeyType.Auto)
    private Integer id;

    /**
     * 专业名称
     */
    private String majorName;

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
     * 毕业生数_#职业类证书
     */
    private Integer vocationalCertificates;

    /**
     * 毕业生数_#职业类证书_#职业技能等级证书
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
    private Integer gradeFirst;

    /**
     * 在校生数_二年级
     */
    private Integer gradeFirstSecond;

    /**
     * 在校生数_三年级
     */
    private Integer gradeFirstThird;

    /**
     * 在校生数_四年级以上
     */
    private Integer gradeFirstFourthAbove;

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
