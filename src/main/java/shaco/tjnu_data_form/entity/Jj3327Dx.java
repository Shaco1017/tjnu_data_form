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
 * 成人本科分专业学生数 实体类。
 *
 * @author shaco
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("jj3327_dx")
public class Jj3327Dx implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id(keyType = KeyType.Auto)
    private Integer id;

    /**
     * 分类
     */
    private String majorType;

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
     * 招生数
     */
    private Integer enrollment;

    /**
     * 在校生数
     */
    private Integer currentStudents;

    /**
     * 在校生数_一年级
     */
    private Integer gradeFirst;

    /**
     * 在校生数_二年级
     */
    private Integer gradeSecond;

    /**
     * 在校生数_三年级
     */
    private Integer gradeThird;

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
