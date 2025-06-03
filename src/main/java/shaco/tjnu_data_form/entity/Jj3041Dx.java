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
 * 在校生中死亡的主要原因 实体类。
 *
 * @author shaco
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("jj3041_dx")
public class Jj3041Dx implements Serializable {

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
     * 合计
     */
    private Integer total;

    /**
     * 交通事故
     */
    private Integer trafficAccident;

    /**
     * 拥挤踩踏
     */
    private Integer stampede;

    /**
     * 房屋倒塌
     */
    private Integer buildingCollapse;

    /**
     * 坠楼坠崖
     */
    private Integer falling;

    /**
     * 中毒
     */
    private Integer poisoning;

    /**
     * 爆炸
     */
    private Integer explosion;

    /**
     * 火灾
     */
    private Integer fire;

    /**
     * 打架斗殴
     */
    private Integer fight;

    /**
     * 校园伤害
     */
    private Integer campusHarm;

    /**
     * 刑事案件
     */
    private Integer criminalCase;

    /**
     * 山体滑坡
     */
    private Integer landslide;

    /**
     * 泥石流
     */
    private Integer debrisFlow;

    /**
     * 洪水
     */
    private Integer flood;

    /**
     * 地震
     */
    private Integer earthquake;

    /**
     * 暴雨
     */
    private Integer rainstorm;

    /**
     * 冰雹
     */
    private Integer hail;

    /**
     * 雪灾
     */
    private Integer snowDisaster;

    /**
     * 龙卷风
     */
    private Integer tornado;

    /**
     * 自杀
     */
    private Integer suicide;

    /**
     * 猝死
     */
    private Integer suddenDeath;

    /**
     * 传染病
     */
    private Integer infectiousDisease;

    /**
     * 其他原因
     */
    private Integer otherCauses;

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
