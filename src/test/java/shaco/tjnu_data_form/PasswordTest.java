package shaco.tjnu_data_form;

import cn.hutool.crypto.digest.DigestUtil;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class PasswordTest {
    /**
     * 密码加密
     *
     * @param rawPassword 登录时传入的密码
     */
    public static String encode(CharSequence rawPassword) {
        return DigestUtil.md5Hex(rawPassword.toString().getBytes());
    }

    /**
     * 密码匹配
     *
     * @param rawPassword 登录时传入的密码
     * @param encodedPassword 数据库存储的加密后的密码
     */
    public static boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encodedPassword.equals(DigestUtil.md5Hex(rawPassword.toString().getBytes()));
    }

    public static void main(String[] args) {
        System.out.println(encode("abc123"));
        System.out.println(matches("FNb112358*", "71483fa1efd48ad4b6d5683cdd26af3b"));
    }
}
