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
 * 高等教育招生、在校生来源情况 实体类。
 *
 * @author shaco
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("jj3335_dx")
public class Jj3335Dx implements Serializable {

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
     * 招生数_高职专科生
     */
    private Integer enrollmentSeniorProfessionalSpecialty;

    /**
     * 招生数_高职本科生
     */
    private Integer enrollmentSeniorProfessionalUndergraduate;

    /**
     * 招生数_普通本科生
     */
    private Integer enrollmentGeneralUndergraduate;

    /**
     * 在校生数
     */
    private Integer enrolled;

    /**
     * 在校生数_高职专科生
     */
    private Integer enrolledSeniorProfessionalSpecialty;

    /**
     * 在校生数_高职本科生
     */
    private Integer enrolledSeniorProfessionalUndergraduate;

    /**
     * 在校生数_普通本科生
     */
    private Integer enrolledGeneralUndergraduate;

    /**
     * 在校生数_成人专科
     */
    private Integer enrolledAdultSpecialty;

    /**
     * 在校生数_成人本科
     */
    private Integer enrolledAdultUndergraduate;

    /**
     * 在校生数_网络（开放）专科
     */
    private Integer enrolledOnlineSpecialization;

    /**
     * 在校生数_网络（开放）本科
     */
    private Integer enrolledOnlineUndergraduate;

    /**
     * 在校生数_硕士研究生
     */
    private Integer enrolledMasterDegree;

    /**
     * 在校生数_博士研究生
     */
    private Integer enrolledPhd;

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
