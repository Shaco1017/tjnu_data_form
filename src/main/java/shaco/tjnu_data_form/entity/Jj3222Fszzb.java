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
 * 中等职业教育分年龄学生数 实体类。
 *
 * @author shaco
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("jj3222_fszzb")
public class Jj3222Fszzb implements Serializable {

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
     * 招生数
     */
    private Integer enrollment;

    /**
     * 在校生数
     */
    private Integer currentStudents;

    /**
     * 在校生数_全日制学生
     */
    private Integer currentStudentsFullTime;

    /**
     * 在校生数_全日制学生_#女
     */
    private Integer currentStudentsFullTimeFemale;

    /**
     * 在校生数_非全日制学生
     */
    private Integer currentStudentsNotFullTime;

    /**
     * 在校生数_非全日制学生_#女
     */
    @Column("current_students__not_full_time_female")
    private Integer currentStudents_notFullTimeFemale;

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
