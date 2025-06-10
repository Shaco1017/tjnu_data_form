package shaco.tjnu_data_form.Util;

import cn.hutool.jwt.JWT;
import shaco.tjnu_data_form.entity.User;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/*
    JWT工具类
    createToken 生成token
    verifyToken 解析并校验token
 */
public class JwtUtil {
    /**
     * 密钥
     */
    private static final byte[] KEY = "tjnu".getBytes();

    /**
     * 过期时间（秒）：7 天
     */
    public static final long EXPIRE = 7 * 24 * 60 * 60;

    /**
     * 根据 userDto 生成 token
     *
     * @param user 用户信息
     * @return token
     */
    public static String generateTokenForUser(User user) {
        Map<String, Object> map = new HashMap<>();
        map.put("user_id", user.getUserId());
        map.put("user_account", user.getUserAccount());
        map.put("user_name", user.getUserName());
        map.put("department_id", user.getDepartmentId());
        map.put("status", user.getStatus());
        return generateToken(map);
    }

    /**
     * 根据 map 生成 token 默认：HS265(HmacSHA256)算法
     *
     * @param map 携带数据
     * @return token
     */
    public static String generateToken(Map<String, Object> map) {
        JWT jwt = JWT.create();
        // 设置携带数据
        map.forEach(jwt::setPayload);
        // 设置密钥
        jwt.setKey(KEY);
        // 设置过期时间
        jwt.setExpiresAt(new Date(System.currentTimeMillis() + EXPIRE * 1000));
        return jwt.sign();
    }

    /**
     * token 校验
     *
     * @param token token
     * @return 是否通过校验
     */
    public static boolean verify(String token) {
        if (token.isBlank()) return false;
        return JWT.of(token).setKey(KEY).verify();
    }

    /**
     * token 校验，并获取 userDto
     *
     * @param token token
     * @return userDto
     */
    public static User verifyAndGetUser(String token) {
        if (!verify(token)) return null;
        // 解析数据
        JWT jwt = JWT.of(token);
        String userId = jwt.getPayload("user_id").toString();
        String userAccount = jwt.getPayload("user_account").toString();
        String userName = jwt.getPayload("user_name").toString();
        String departmentId = jwt.getPayload("department_id").toString();
        Integer status = Integer.valueOf(jwt.getPayload("status").toString());
        // 返回用户信息
        return new User(userId, userAccount, userName, departmentId, status);
    }

}