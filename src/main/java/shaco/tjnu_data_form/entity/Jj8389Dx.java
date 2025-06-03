package shaco.tjnu_data_form.entity;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import java.io.Serial;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 职业教育学校、高等教育学校资产等办学条件 实体类。
 *
 * @author shaco
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("jj8389_dx")
public class Jj8389Dx implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id(keyType = KeyType.Auto)
    private Integer id;

    /**
     * 指标名称
     */
    private String indicatorName;

    /**
     * 培训项目名称
     */
    private String projectName;

    /**
     * 主要资金来源类型
     */
    private String fundingSourceType;

    /**
     * 到账经费(万元)_财政资金支付
     */
    private Float fundingAmountFinancialDisbursements;

    /**
     * 到账经费(万元)_非财政资金支付
     */
    private Float fundingAmountNotFinancialDisbursements;

    /**
     * 到账经费(万元)_免费公益项目
     */
    private Float fundingAmountFreePublicService;

    /**
     * 培训时间(学时)
     */
    private BigDecimal trainingDuration;

    /**
     * 培训形式
     */
    private String trainingForm;

    /**
     * 企业职工
     */
    private Integer enterpriseEmployees;

    /**
     * 党政领导干部
     */
    private Integer partyGovernmentLeadership;

    /**
     * 教师
     */
    private Integer teacher;

    /**
     * 农村劳动者
     */
    private Integer ruralLaborers;

    /**
     * 在校学生
     */
    private Integer schoolStudents;

    /**
     * 老年人数
     */
    private Integer elderly;

    /**
     * 退役军人
     */
    private Integer veterans;

    /**
     * 残疾人
     */
    private Integer disabledPersons;

    /**
     * 教师姓名
     */
    private String internalTeachers;

    /**
     * 外聘人员姓名
     */
    private String externalTeachers;

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
