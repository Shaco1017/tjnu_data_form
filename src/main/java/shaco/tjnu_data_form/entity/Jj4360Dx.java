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
 * 职业教育学校、高等学校教师分学历（位）情况 实体类。
 *
 * @author shaco
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("jj4360_dx")
public class Jj4360Dx implements Serializable {

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
     * 合计人数
     */
    private Integer totalCount;

    /**
     * 博士研究生
     */
    private Integer phdCandidates;

    /**
     * 博士研究生_获博士学位人数
     */
    private Integer phdCandidatesPhdDegreeHolders;

    /**
     * 博士研究生_获硕士学位人数
     */
    private Integer phdCandidatesMasterDegreeHolders;

    /**
     * 硕士研究生人数
     */
    private Integer masterCandidates;

    /**
     * 硕士研究生人数_获博士学位人数
     */
    private Integer masterCandidatesPhdDegreeHolders;

    /**
     * 硕士研究生人数_获硕士学位人数
     */
    private Integer masterCandidatesMasterDegreeHolders;

    /**
     * 本科学历人数
     */
    private Integer bachelorDegree;

    /**
     * 本科学历人数_获博士学位人数
     */
    private Integer bachelorDegreePhdDegreeHolders;

    /**
     * 本科学历人数_获硕士学位人数
     */
    private Integer bachelorDegreeMasterDegreeHolders;

    /**
     * 专科学历人数
     */
    private Integer collegeDegree;

    /**
     * 专科学历人数_获博士学位人数
     */
    private Integer collegeDegreePhdDegreeHolders;

    /**
     * 专科学历人数_获硕士学位人数
     */
    private Integer collegeDegreeMasterDegreeHolders;

    /**
     * 高中阶段以下人数
     */
    private Integer belowHighSchool;

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
