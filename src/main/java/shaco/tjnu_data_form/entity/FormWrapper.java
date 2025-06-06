package shaco.tjnu_data_form.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.Year;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FormWrapper {
    /*
    报表名称
     */
    String formName;

    /*

     */
    String formId;

    /*
    报表统计时点
     */
    int formStatisticalTime;


    List<String> formColumnName;

//    List<String> formColumnType;

    List<?> formRows;

}
