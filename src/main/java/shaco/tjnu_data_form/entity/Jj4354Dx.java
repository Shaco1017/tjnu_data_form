package shaco.tjnu_data_form.entity;

import com.mybatisflex.annotation.Column;
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
 * 职业教育学校、高等教育学校专任教师分年龄情况 实体类。
 *
 * @author shaco
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("jj4354_dx")
public class Jj4354Dx implements Serializable {

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
     * 29岁以下
     */
    @Column("under_29")
    private Integer under29;

    /**
     * 30-34岁
     */
    @Column("between_30_34")
    private Integer between3034;

    /**
     * 35-39岁
     */
    @Column("between_35_39")
    private Integer between3539;

    /**
     * 40-44岁
     */
    @Column("between_40_44")
    private Integer between4044;

    /**
     * 45-49岁
     */
    @Column("between_45_49")
    private Integer between4549;

    /**
     * 50-54岁
     */
    @Column("between_50_54")
    private Integer between5054;

    /**
     * 55-59岁
     */
    @Column("between_55_59")
    private Integer between5559;

    /**
     * 60-64岁
     */
    @Column("between_60_64")
    private Integer between6064;

    /**
     * 65岁以上
     */
    @Column("over_65")
    private Integer over65;

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
