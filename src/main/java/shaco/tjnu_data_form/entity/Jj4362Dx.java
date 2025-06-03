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
 * 高等教育学校教师授课分类情况 实体类。
 *
 * @author shaco
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("jj4362_dx")
public class Jj4362Dx implements Serializable {

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
     * 本学年授课专任教师
     */
    private Integer teachingSpecializeTeacher;

    /**
     * 本学年授课专任教师_公共基础课
     */
    private Integer teachingSpecializeTeacherPublicBasic;

    /**
     * 本学年授课专任教师_公共基础课_#思政课
     */
    private Integer teachingSpecializeTeacherPublicBasicCivics;

    /**
     * 本学年授课专任教师_专业课程
     */
    private Integer teachingSpecializeTeacherSpecializedCourses;

    /**
     * 本学年授课校外教师
     */
    private Integer teachingExternalTeacher;

    /**
     * 本学年授课校外教师_公共基础课
     */
    private Integer teachingExternalTeacherPublicBasic;

    /**
     * 本学年授课校外教师_公共基础课_#思政课
     */
    private Integer teachingExternalTeacherPublicBasicCivics;

    /**
     * 本学年授课校外教师_专业课程
     */
    private Integer teachingExternalTeacherSpecializedCourses;

    /**
     * 本学年授课行业导师
     */
    private Integer teachingIndustryTeacher;

    /**
     * 本学年授课行业导师_公共基础课
     */
    private Integer teachingIndustryTeacherPublicBasic;

    /**
     * 本学年授课行业导师_专业课程
     */
    private Integer teachingIndustryTeacherSpecializedCourses;

    /**
     * 本学年不授课专任教师
     */
    private Integer nonTeachingTeacher;

    /**
     * 本学年不授课专任教师_进修
     */
    private Integer nonTeachingTeacherFurtherStudies;

    /**
     * 本学年不授课专任教师_科研
     */
    private Integer nonTeachingTeacherResearch;

    /**
     * 本学年不授课专任教师_病休
     */
    private Integer nonTeachingTeacherIllness;

    /**
     * 本学年不授课专任教师_其他
     */
    private Integer nonTeachingTeacherOther;

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
