package shaco.tjnu_data_form;

import cn.hutool.extra.pinyin.PinyinUtil;

public class ChineseTransformTest {
    public static String convert(String input) {
        int underscoreIndex = input.indexOf('_');
        if (underscoreIndex == -1) {
            return input;
        }
        String frontPart = input.substring(0, underscoreIndex);
        String backPart = input.substring(underscoreIndex + 1);

        String convertedFront = capitalizeFirstLetter(frontPart);
        String convertedBack = capitalizeFirstLetter(backPart);

        return convertedFront + convertedBack;
    }

    private static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static void main(String[] args) {


        System.out.println(convert(PinyinUtil.getFirstLetter("教基3324_大学", "")));      // Output: Jj3324Dx
        System.out.println(convert(PinyinUtil.getFirstLetter("教基3324校区_大学", "")));    // Output: Jj3324xqDx

    }
}
