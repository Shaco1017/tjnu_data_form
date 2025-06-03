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
 * 普通本科、高职本科招生类型来源情况 实体类。
 *
 * @author shaco
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("jj3339_dx")
public class Jj3339Dx implements Serializable {

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
     * 招生数
     */
    private Integer enrollment;

    /**
     * #恢复入学资格
     */
    private Integer reinstatementEnrolment;

    /**
     * #专项计划_国家专项
     */
    private Integer specialProgramsNational;

    /**
     * #专项计划_地方专项
     */
    private Integer specialProgramsLocal;

    /**
     * #专项计划_高校专项
     */
    private Integer specialProgramsCollege;

    /**
     * 生源类别_普通高中_应届
     */
    private Integer sourceCategoryGeneralHighSchoolCurrentYear;

    /**
     * 生源类别_普通高中_往届
     */
    private Integer sourceCategoryGeneralHighSchoolFormerYear;

    /**
     * 生源类别_中等职业教育_应届
     */
    private Integer sourceCategorySecondaryVocationalEducationCurrentYear;

    /**
     * 生源类别_中等职业教育_往届
     */
    private Integer sourceCategorySecondaryVocationalEducationFormerYear;

    /**
     * 生源类别_中等职业教育_往届
     */
    private Integer sourceCategorySpecialtyFromCollege;

    /**
     * 生源类别_中等职业教育_往届
     */
    private Integer sourceCategorySecondBachelorDegree;

    /**
     * 生源类别_预科生转入
     */
    private Integer sourceCategoryMatriculantTransfer;

    /**
     * 生源类别_其他
     */
    private Integer sourceCategoryOther;

    /**
     * 预科生
     */
    private Integer matriculant;

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
