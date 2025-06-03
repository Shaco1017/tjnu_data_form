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
 * 高等教育分年龄在校学生数 实体类。
 *
 * @author shaco
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("jj3334_dx")
public class Jj3334Dx implements Serializable {

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
     * 高职专科
     */
    private Integer seniorProfessionalSpecialtyTotal;

    /**
     * 高职专科_#女
     */
    private Integer seniorProfessionalSpecialtyFemale;

    /**
     * 高职本科
     */
    private Integer seniorProfessionalUndergraduateTotal;

    /**
     * 高职本科_#女
     */
    private Integer seniorProfessionalUndergraduateFemale;

    /**
     * 普通本科
     */
    private Integer generalUndergraduateTotal;

    /**
     * 普通本科_#女
     */
    private Integer generalUndergraduateFemale;

    /**
     * 成人专科
     */
    private Integer adultSpecialtyTotal;

    /**
     * 成人专科_#女
     */
    private Integer adultSpecialtyFemale;

    /**
     * 成人本科
     */
    private Integer adultUndergraduateTotal;

    /**
     * 成人本科_#女
     */
    private Integer adultUndergraduateFemale;

    /**
     * 网络（开放）专科
     */
    private Integer onlineSpecializationTotal;

    /**
     * 网络（开放）专科_#女
     */
    private Integer onlineSpecializationFemale;

    /**
     * 网络（开放）本科
     */
    private Integer onlineUndergraduateTotal;

    /**
     * 网络（开放）本科_#女
     */
    private Integer onlineUndergraduateFemale;

    /**
     * 硕士研究生
     */
    private Integer masterDegreeTotal;

    /**
     * 硕士研究生_#女
     */
    private Integer masterDegreeFemale;

    /**
     * 博士研究生
     */
    private Integer phdTotal;

    /**
     * 博士研究生_#女
     */
    private Integer phdFemale;

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
