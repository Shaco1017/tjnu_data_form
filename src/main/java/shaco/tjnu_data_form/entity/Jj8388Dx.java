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
 * 高等教育学校（普通）校舍功能明细统计调查表（台账） 实体类。
 *
 * @author shaco
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("jj8388_dx")
public class Jj8388Dx implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id(keyType = KeyType.Auto)
    private Integer id;

    /**
     * 建筑物分类
     */
    private String buildingType;

    /**
     * 建筑物名称
     */
    private String buildingName;

    /**
     * 建成年份
     */
    private Date constructionYear;

    /**
     * 证书号
     */
    private Integer certificateNumber;

    /**
     * 校舍建筑面积
     */
    private Float buildingArea;

    /**
     * 校舍建筑面积_其中地上面积
     */
    private Float buildAreaAboveGround;

    /**
     * 校舍建筑面积_其中地下面积
     */
    private Float buildAreaUnderGround;

    /**
     * 建筑层数_地上层数
     */
    private Integer floorsAboveGround;

    /**
     * 建筑层数_地下层数
     */
    private Integer floorsUnderground;

    /**
     * 使用面积系数(K)
     */
    private Float usableAreaCoefficient;

    /**
     * 教学及辅助用房
     */
    private Float teachingAuxiliaryBuilding;

    /**
     * 教学及辅助用房_教室
     */
    private Float classroom;

    /**
     * 教学及辅助用房_教室_#艺术院校专业课教室
     */
    private Float classroomArt;

    /**
     * 教学及辅助用房_实验实习用房
     */
    private Float lab;

    /**
     * 教学及辅助用房_专职科研机构办公及研究用房
     */
    private Float researcherOffices;

    /**
     * 教学及辅助用房_图书馆
     */
    private Float library;

    /**
     * 教学及辅助用房_室内体育用房
     */
    private Float indoorSportsBuilding;

    /**
     * 教学及辅助用房_师生活动用房
     */
    private Float activityBuilding;

    /**
     * 教学及辅助用房_会堂
     */
    private Float hall;

    /**
     * 教学及辅助用房_继续教育用房
     */
    private Float continuousLearningBuilding;

    /**
     * 行政办公用房
     */
    private Float administratingOffices;

    /**
     * 行政办公用房_校行政办公用房
     */
    private Float administratingOfficesCollege;

    /**
     * 行政办公用房_院系及教师办公用房
     */
    private Float administratingOfficesDepartment;

    /**
     * 生活用房
     */
    private Float livingBuilding;

    /**
     * 生活用房_学生宿舍（公寓）
     */
    private Float studentDormitory;

    /**
     * 生活用房_食堂
     */
    private Float canteen;

    /**
     * 生活用房_单身教师宿舍（公寓）
     */
    private Float singleTeacherDormitory;

    /**
     * 生活用房_后勤及辅助用房
     */
    private Float auxiliaryBuilding;

    /**
     * 其他用房
     */
    private Float otherBuilding;

    /**
     * #其他用房主要功能类别
     */
    private String otherBuildingType;

    /**
     * #本建筑物被外单位租（借）面积
     */
    private Float otherBuildingLoanArea;

    /**
     * 教工住宅
     */
    private Float staffDormitory;

    /**
     * 危房等级（C级/D级）
     */
    private String buildingGrade;

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
