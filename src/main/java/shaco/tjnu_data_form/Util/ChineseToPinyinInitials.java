package shaco.tjnu_data_form.Util;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

public class ChineseToPinyinInitials {

    public static String convertChineseToPinyinInitials(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder result = new StringBuilder();
        StringBuilder hanziBuffer = new StringBuilder();
        HanyuPinyinOutputFormat format = new HanyuPinyinOutputFormat();
        format.setToneType(HanyuPinyinToneType.WITHOUT_TONE);

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isChineseCharacter(c)) {
                hanziBuffer.append(c);
            } else {
                if (hanziBuffer.length() > 0) {
                    appendInitials(result, hanziBuffer.toString(), format);
                    hanziBuffer.setLength(0);
                }
                result.append(c);
            }
        }

        if (hanziBuffer.length() > 0) {
            appendInitials(result, hanziBuffer.toString(), format);
        }

        return result.toString();
    }

    private static boolean isChineseCharacter(char c) {
        Character.UnicodeBlock block = Character.UnicodeBlock.of(c);
        return block == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
                || block == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
                || block == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A;
    }

    private static void appendInitials(StringBuilder result, String hanziSequence,
                                       HanyuPinyinOutputFormat format) {
        StringBuilder initials = new StringBuilder();

        for (char c : hanziSequence.toCharArray()) {
            try {
                String[] pinyinArray = PinyinHelper.toHanyuPinyinStringArray(c, format);
                if (pinyinArray != null && pinyinArray.length > 0) {
                    char initial = pinyinArray[0].charAt(0);
                    initials.append(initial);
                }
            } catch (Exception e) {
                // 忽略转换异常，继续处理后续字符
            }
        }

        if (initials.length() > 0) {
            // 转换为首字母大写，其余小写
            char first = Character.toUpperCase(initials.charAt(0));
            String rest = initials.substring(1).toLowerCase();
            result.append(first).append(rest);
        }
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
}
