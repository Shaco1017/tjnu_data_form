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
 * 教职工其他情况 实体类。
 *
 * @author shaco
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("jj4067_dx")
public class Jj4067Dx implements Serializable {

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
     * 中共党员
     */
    private Integer communistParty;

    /**
     * 共青团员
     */
    private Integer communistYouthLeague;

    /**
     * 民主党派
     */
    private Integer democraticParties;

    /**
     * 香港
     */
    private Integer hongkongResident;

    /**
     * 澳门
     */
    private Integer macauResident;

    /**
     * 台湾
     */
    private Integer taiwanResident;

    /**
     * 华侨
     */
    private Integer overseasChinese;

    /**
     * 少数民族
     */
    private Integer ethnicMinority;

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
