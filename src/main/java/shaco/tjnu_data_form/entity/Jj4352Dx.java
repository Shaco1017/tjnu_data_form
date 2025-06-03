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
 * 高等教育学校教职工情况 实体类。
 *
 * @author shaco
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("jj4352_dx")
public class Jj4352Dx implements Serializable {

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
    private String code;

    /**
     * 教职工数
     */
    private Integer staffNumber;

    /**
     * 专任教师
     */
    private Integer fullTimeTeachers;

    /**
     * 行政人员
     */
    private Integer administrativeStaff;

    /**
     * 教辅人员
     */
    private Integer teachingSupport;

    /**
     * 工勤人员
     */
    private Integer logisticsWorkers;

    /**
     * 专职科研人员
     */
    private Integer fullTimeResearchers;

    /**
     * 其他附设机构人员
     */
    private Integer affiliatedInstitutionStaff;

    /**
     * 校外教师
     */
    private Integer offCampusTeachers;

    /**
     * 行业导师
     */
    private Integer industryTutors;

    /**
     * 外籍教师
     */
    private Integer foreignTeachers;

    /**
     * 离退休人员
     */
    private Integer retiredPersonnel;

    /**
     * 附属中小学幼儿园教职工
     */
    private Integer affiliatedSchoolStaff;

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
