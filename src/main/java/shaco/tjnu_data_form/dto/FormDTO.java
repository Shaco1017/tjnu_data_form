package shaco.tjnu_data_form.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Field;
import java.time.Year;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FormDTO {
    /**
     * 报表编号
     */
    private String FormID;

    /**
     * 报表名称
     */
    private String formName;

    /**
     * 统计时点
     */
    private Year formYear;

    /**
     * 表头
     */
    private List<String> formHead;

    /**
     * 表数据
     */
    private List<String> FormBody;

    private String FormType;

    /**
     * 得到属性值
     *
     * @param form
     */
    public void readAttributeValue(Object form) {
        StringBuilder nameValues = new StringBuilder();
        //得到class
        Class<?> cls = form.getClass();

//        formHead = cls.getDeclaredFields();
        //得到所有属性
        Field[] fields = cls.getDeclaredFields();
        for (Field item : fields) {//遍历
            try {
                //得到属性
                //打开私有访问
                item.setAccessible(true);
                //获取属性
                String name = item.getName();
                //获取属性值
                Object value = item.get(form);
                //一个个赋值
                nameValues.append(item.getName()).append(":").append(value).append(",");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        //获取最后一个逗号的位置
        int lastIndex = nameValues.lastIndexOf(",");

        //不要最后一个逗号","
        String result = nameValues.substring(0, lastIndex);
        System.out.println(result);
    }
}
