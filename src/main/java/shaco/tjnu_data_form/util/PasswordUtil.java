package shaco.tjnu_data_form.util;

import cn.hutool.crypto.digest.DigestUtil;

public class PasswordUtil {
    /**
     * 密码加密
     *
     * @param rawPassword 登录时传入的密码
     */
    public static String encode(CharSequence rawPassword) {
        return DigestUtil.md5Hex(rawPassword.toString().getBytes());
    }

    /**
     * 密码对比
     *
     * @param rawPassword     登录时传入的密码
     * @param encodedPassword 数据库保存的加密过的密码
     */
    public static boolean matches(CharSequence rawPassword, String encodedPassword) {
//        return true;
        return encodedPassword.equals(DigestUtil.md5Hex(rawPassword.toString().getBytes()));
    }

}
