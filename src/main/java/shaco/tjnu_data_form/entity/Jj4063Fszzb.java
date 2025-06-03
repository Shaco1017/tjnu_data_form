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
 * 专任教师变动情况 实体类。
 *
 * @author shaco
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("jj4063_fszzb")
public class Jj4063Fszzb implements Serializable {

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
     * 上学年初专任教师数
     */
    private Integer previousYearCount;

    /**
     * 增加教师数
     */
    private Integer increase;

    /**
     * 增加教师总数_招聘
     */
    private Integer increaseRecruitment;

    /**
     * 增加教师总数_招聘_#应届毕业生
     */
    private Integer increaseRecruitmentFreshGraduates;

    /**
     * 增加教师总数_招聘_#应届毕业生_#师范生
     */
    private Integer increaseRecruitmentFreshGraduatesNormal;

    /**
     * 调入
     */
    private Integer increaseTransferredIn;

    /**
     * 调入_#外校
     */
    private Integer increaseTransferredInAnotherSchool;

    /**
     * 校内变动
     */
    private Integer increaseInSchoolTransfer;

    /**
     * 校内变动_#学段调整
     */
    private Integer increaseInSchoolTransferSegmentsRestructure;

    /**
     * 其他增加人数
     */
    private Integer increaseOther;

    /**
     * 减少教师总数
     */
    private Integer decrease;

    /**
     * 退休人数
     */
    private Integer decreaseRetired;

    /**
     * 死亡人数
     */
    private Integer decreaseDeceased;

    /**
     * 调出人数
     */
    private Integer decreaseTransferredOut;

    /**
     * 辞职人数
     */
    private Integer decreaseResigned;

    /**
     * 校内变动
     */
    private Integer decreaseInSchoolTransfer;

    /**
     * 校内变动_#学段调整
     */
    private Integer decreaseInSchoolTransferSegmentsRestructure;

    /**
     * 其他减少人数
     */
    private Integer otherDecrease;

    /**
     * 本学年初专任教师数
     */
    private Integer currentYearCount;

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
