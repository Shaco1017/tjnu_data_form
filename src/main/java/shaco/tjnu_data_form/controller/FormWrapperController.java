package shaco.tjnu_data_form.controller;

import com.mybatisflex.core.query.QueryWrapper;
import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shaco.tjnu_data_form.entity.FormStructure;
import shaco.tjnu_data_form.entity.FormWrapper;
import shaco.tjnu_data_form.Util.MyInvocationHandler;
import shaco.tjnu_data_form.mapper.FormMapper;
import shaco.tjnu_data_form.mapper.FormStructureMapper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static shaco.tjnu_data_form.Util.ChineseToPinyinInitials.convertChineseToPinyinInitials;

@CrossOrigin
@RestController
@RequestMapping("/form_wrapper")
public class FormWrapperController {
    @Autowired
    FormMapper formMapper;

    private FormWrapper formWrapper;

    private QueryWrapper queryWrapper;

    /**
     * 查询所有报表表。
     *
     * @return 所有数据
     */
    @GetMapping("formdata")
    public FormWrapper list(@RequestParam int formId, @RequestParam int formYear) {
        queryWrapper = new QueryWrapper();
        queryWrapper.select().from("Form").where("Form.formId=?", formId);

        formMapper.selectListByQuery(queryWrapper);

        formWrapper = new FormWrapper();
        List<String> formColumnName = new ArrayList<>();
        formColumnName.add("abc");
        List formRow = new ArrayList();
        formRow.add(1);
        List<List<?>> formRows = new ArrayList<>();
        formRows.add(formRow);
        formWrapper.setFormName("form");
        formWrapper.setFormStatisticalTime(2025);
        formWrapper.setFormId("formId");
        formWrapper.setFormColumnName(formColumnName);
        formWrapper.setFormRows(formRows);
        return formWrapper;
    }


    @Autowired
    private FormStructureMapper formStructureMapper;

    /**
     * 查询所有报表表。
     *
     * @return 所有数据
     */
    @GetMapping("test")
    public List test() {
        queryWrapper = new QueryWrapper();
        queryWrapper.select("form_id,form_name").from("form_structure");

        return formStructureMapper.selectListByQuery(queryWrapper);
    }

    /**
     * 获取中文首字母
     *
     * @param name 需要转换的中文
     * @return 首字母结果
     **/
    public static String getPinyinInitial(String name) {
        // 创建格式化对象
        HanyuPinyinOutputFormat outputFormat = new HanyuPinyinOutputFormat();
        //设置大小写格式
        outputFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        //设置声调格式
        outputFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        // 放置输入结果
        StringBuilder result = new StringBuilder();
        // 字符数组
        char[] charArray = name.toCharArray();
        // 遍历字符
        for (char c : charArray) {
            // 中文会被变成拼音首字母，非中文会被直接拼接在结果字符串中
            if (Character.toString(c).matches("[\\u4E00-\\u9FA5]+")) {
                String[] pinyinArray = new String[0];
                try {
                    pinyinArray = PinyinHelper.toHanyuPinyinStringArray(c, outputFormat);
                } catch (BadHanyuPinyinOutputFormatCombination badHanyuPinyinOutputFormatCombination) {
                    badHanyuPinyinOutputFormatCombination.printStackTrace();
                }
                if (pinyinArray != null) {
                    result.append(pinyinArray[0].charAt(0));
                }
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }


    @GetMapping("getForm")
    public FormWrapper getForm(@RequestParam("formId") String formId) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        FormWrapper formWrapper = new FormWrapper();
        /*
        获取表信息：
        表名 表id 表统计时间 表列头 表数据
         */
        QueryWrapper formStructureQueryWrapper = new QueryWrapper();
        formStructureQueryWrapper.select().from("form_structure").where("form_id=?", formId);

        List<FormStructure> formdata = formStructureMapper.selectListByQuery(formStructureQueryWrapper);
        /*
        id
         */
        formWrapper.setFormId(formdata.get(0).getFormId());
        /*
        name
         */
        formWrapper.setFormName(formdata.get(0).getFormName());
        /*
        col
         */
        formWrapper.setFormColumnName(Arrays.asList(formdata.get(0).getFormColumn().split(",")));

        QueryWrapper formDataQueryWrapper = new QueryWrapper();
        formDataQueryWrapper.select().from(getPinyinInitial(formId + "_dx"));


        /** 通过反射调用mapper查数据 **/
        String mapperStr = "shaco.tjnu_data_form.mapper." + convertChineseToPinyinInitials(formId) + "DxMapper";
        Class<?> clazz = Class.forName(mapperStr);

        /**创建动态代理并使用反射**/
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        myInvocationHandler.setTarget(clazz);
        Object object = Proxy.newProxyInstance(clazz.getClassLoader(),
                new Class[]{clazz},
                myInvocationHandler);

        Method selectListByQuery = object.getClass().getDeclaredMethod("selectListByQuery", QueryWrapper.class);

        List<?> result = (List<?>) selectListByQuery.invoke(object, formDataQueryWrapper);

        formWrapper.setFormRows(result);

        formWrapper.setFormStatisticalTime(2024);
        return formWrapper;
    }
}

