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
 * 高等教育学校（普通）校舍情况 实体类。
 *
 * @author shaco
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("jj5374_dx")
public class Jj5374Dx implements Serializable {

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
     * 上学年校舍建筑面积
     */
    private Float schoolOwnedLastYearBuildArea;

    /**
     * 增加面积
     */
    private Float schoolOwnedIncreaseArea;

    /**
     * 减少面积
     */
    private Float schoolOwnedDecreaseArea;

    /**
     * 本学年校舍建筑面积
     */
    private Float schoolOwnedThisYearBuildArea;

    /**
     * 正在施工校舍建筑面积
     */
    private Float buildingArea;

    /**
     * 非学校产权_校舍建筑面积
     */
    private Float notSchoolOwnedBuildArea;

    /**
     * 非学校产权_独立使用
     */
    private Float notSchoolOwnedExclusiveUsageArea;

    /**
     * 非学校产权_共同使用
     */
    private Float notSchoolOwnedSharedUsageArea;

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
