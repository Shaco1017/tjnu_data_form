package shaco.tjnu_data_form.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FormDTO {
    /**
     * 报表编号
     */
    String formId;

    /**
     * 报表名称
     */
    String formName;

    /**
     * 报表字段
     */
    List<String> formColumnName;

    /**
     * 报表类型
     */
    String formType;

    /**
     * 报表统计时点
     */
    int formStatisticalTime;


    /**
     * 报表数据
     */
    List<?> formRows;

}
