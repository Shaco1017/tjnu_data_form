package shaco.tjnu_data_form;

import shaco.tjnu_data_form.entity.Jj1001Dx;

import javax.xml.stream.events.Comment;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class dataStructure {
    Jj1001Dx jj1001Dx = new Jj1001Dx();
    Class<Jj1001Dx> jj1001DxClass = Jj1001Dx.class;

    /**
     * @param string
     * @return
     * @Title: unicodeDecode
     * @Description: unicode解码
     */
    public static String unicodeDecode(String string) {
        Pattern pattern = Pattern.compile("(\\\\u(\\p{XDigit}{4}))");
        Matcher matcher = pattern.matcher(string);
        char ch;
        while (matcher.find()) {
            ch = (char) Integer.parseInt(matcher.group(2), 16);
            string = string.replace(matcher.group(1), ch + "");
        }
        return string;
    }


    public static String getKuoHaoContent(String str) {
        //校验输入参数
        if (str == null || "".equals(str)) {
            throw new RuntimeException("字符串不能为空");
        }
        String targetStr = str.substring(str.indexOf("(") + 1, str.indexOf(")"));
        return targetStr;
    }

    public static String getYinHaoContent(String str) {
        //校验输入参数
        if (str == null || "".equals(str)) {
            throw new RuntimeException("字符串不能为空");
        }
        String targetStr = str.substring(str.indexOf("\"") + 1, str.indexOf("\""));
        return targetStr;
    }


    public static void test() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class<?> clazz = Class.forName("shaco.tjnu_data_form.entity.Jj1001Dx");

        //获取类名
        String name = clazz.getName();
        String simpleName = clazz.getSimpleName();
        System.out.println("类名（带包名称）：" + name);
        System.out.println("类名（不带包名称）：" + simpleName);

        //获取成员变量,通过get，set方法获属性取值和赋值
        Field[] fields = clazz.getDeclaredFields();

        System.out.print("getDeclaredFields：");
        for (Field field : fields) {
            //调用私有属性需要调用setAccessible方法设置为true
            field.setAccessible(true);
            String fieldName = field.getName();
            Annotation[] fieldComment = field.getAnnotations();

            System.out.println(fieldName);
            for (Annotation annotation : fieldComment) {
                System.out.println(unicodeDecode(getKuoHaoContent(annotation.toString())));
            }
        }
        System.out.println();
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        test();
    }
}
