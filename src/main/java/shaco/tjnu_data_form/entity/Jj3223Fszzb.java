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
 * 中等职业教育招生、在校生来源情况 实体类。
 *
 * @author shaco
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("jj3223_fszzb")
public class Jj3223Fszzb implements Serializable {

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
     * 招生数_全日制学生
     */
    private Integer enrollmentFullTime;

    /**
     * 招生数_非全日制学生
     */
    private Integer enrollmentNotFullTime;

    /**
     * 招生数_#应届毕业生
     */
    private Integer enrollmentRecentGraduate;

    /**
     * 招生数_#应届毕业生_#初中毕业生
     */
    private Integer enrollmentRecentGraduateJunior;

    /**
     * 在校生数
     */
    private Integer currentStudents;

    /**
     * 在校生数_全日制学生
     */
    private Integer currentStudentsFullTime;

    /**
     * 在校生数_非全日制学生
     */
    private Integer currentStudentsNotFullTime;

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
