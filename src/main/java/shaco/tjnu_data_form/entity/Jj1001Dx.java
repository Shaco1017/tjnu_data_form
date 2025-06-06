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
 * 学校基本情况 实体类。
 *
 * @author shaco
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("jj1001_dx")
public class Jj1001Dx implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id(keyType = KeyType.Auto)
    private Integer id;

    /**
     * 学校（机构）标识码
     */
    private String schoolId;

    /**
     * 学校（机构）名称（章）
     */
    private String schoolName;

    /**
     * 学校（机构）英文名称
     */
    private String schoolNameEn;

    /**
     * 学校（机构）地址_省(自治区、直辖市)
     */
    private String schoolAddressProvince;

    /**
     * 学校（机构）地址_地(区、市、州、盟)
     */
    private String schoolAddressPrefecture;

    /**
     * 学校（机构）地址_县(市、区、旗)
     */
    private String schoolAddressCounty;

    /**
     * 学校（机构）地址_乡(镇、街道)
     */
    private String schoolAddressTownship;

    /**
     * 学校（机构）地址_村委会(居委会)
     */
    private String schoolAddressVillageCommittee;

    /**
     * 学校（机构）驻地城乡类型
     */
    private String schoolLocationUrbanClassification;

    /**
     * 学校（机构）所在地_经度
     */
    private String schoolLocationLongitude;

    /**
     * 学校（机构）所在地_纬度
     */
    private String schoolLocationLatitude;

    /**
     * 学校官网网址
     */
    private String schoolOfficialWebsiteUrl;

    /**
     * 校(园)长姓名
     */
    private String headmasterName;

    /**
     * 校(园)长（签章）
     */
    private String headmasterSign;

    /**
     * 统计负责人姓名
     */
    private String statisticianName;

    /**
     * 统计负责人部门
     */
    private String statisticianDepartment;

    /**
     * 统计负责人职务
     */
    private String statisticianDuties;

    /**
     * 统计负责人联系电话
     */
    private String statisticianTelephone;

    /**
     * 填表人姓名
     */
    private String formFillerName;

    /**
     * 填表人部门
     */
    private String formFillerDepartment;

    /**
     * 填表人职务
     */
    private String formFillerDuties;

    /**
     * 填表人联系电话
     */
    private String formFillerTelephone;

    /**
     * 联系方式_移动电话
     */
    private String contactDetailsMobileTelephone;

    /**
     * 联系方式_长途区号
     */
    private String contactDetailsLongDistanceCode;

    /**
     * 联系方式_办公电话
     */
    private String contactDetailsOfficeTelephone;

    /**
     * 联系方式_单位电子信箱
     */
    private String contactDetailsOfficeEmail;

    /**
     * 联系方式_邮政编码
     */
    private String contactDetailsZipCode;

    /**
     * 学校（机构）属地管理教育行政部门 
     */
    private String schoolLocationManagementEducationAdministration;

    /**
     * 学校（机构）办学类型
     */
    private String schoolType;

    /**
     * 高等教育学校性质类别
     */
    private String schoolNatureCategory;

    /**
     * 学校（机构）举办者
     */
    private String schoolOrganizer;

    /**
     * 附设教学班类型
     */
    private String attachedClassType;

    /**
     * 通电
     */
    private String electrify;

    /**
     * 接入互联网
     */
    private String internetAccess;

    /**
     * 无线网全覆盖
     */
    private String fullWifiCoverage;

    /**
     * 学校供水方式
     */
    private String waterSupplyMethod;

    /**
     * 学校厕所情况
     */
    private String latrinesSituation;

    /**
     * 洗手设施
     */
    private String handWashingFacility;

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
