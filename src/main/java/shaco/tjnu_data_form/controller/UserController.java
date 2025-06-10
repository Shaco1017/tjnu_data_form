package shaco.tjnu_data_form.controller;

import com.mybatisflex.core.paginate.Page;
import com.mybatisflex.core.query.QueryWrapper;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import shaco.tjnu_data_form.Util.JwtUtil;
import shaco.tjnu_data_form.Util.PasswordUtil;
import shaco.tjnu_data_form.common.Result;
import shaco.tjnu_data_form.entity.User;
import shaco.tjnu_data_form.service.UserService;

import java.util.HashMap;
import java.util.List;

/**
 * 用户表 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 添加用户表。
     *
     * @param user 用户表
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody User user) {
        return userService.save(user);
    }

    /**
     * 根据主键删除用户表。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return userService.removeById(id);
    }

    /**
     * 根据主键更新用户表。
     *
     * @param user 用户表
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody User user) {
        return userService.updateById(user);
    }

    /**
     * 查询所有用户表。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<User> list() {
        return userService.list();
    }

    /**
     * 根据用户表主键获取详细信息。
     *
     * @param id 用户表主键
     * @return 用户表详情
     */
    @GetMapping("getInfo/{id}")
    public User getInfo(@PathVariable Integer id) {
        return userService.getById(id);
    }

    /**
     * 分页查询用户表。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<User> page(Page<User> page) {
        return userService.page(page);
    }


    /**
     * 模拟数据库数据 账号 admin  密码 123456
     */
    private final static HashMap<String, String> test_user = new HashMap<>() {
        {
            put("admin", "e10adc3949ba59abbe56e057f20f883e");
        }
    };

    /**
     * 登录校验接口。
     *
     * @param userAccount 用户账号
     * @param password    用户密码
     * @return String token 或 报错信息
     */
    @PostMapping("/login")
    public Result login(@RequestParam("user_account") String userAccount, @RequestParam("password") String password) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.select().from("user").where("user_account=?", userAccount);
        // 根据用户名查询用户
        User LoginUser = userService.getOne(wrapper);
        // 判断用户是否存在
        if (LoginUser == null) {
            System.out.println("没有该账户" + userAccount);
            return Result.error("没有该账户" + userAccount);
        } else {
            // 判断密码是否正确  loginUser 对象中的password是密文
            if (PasswordUtil.matches(password, LoginUser.getPassword())) {
                // 生成token
                return Result.success(JwtUtil.generateTokenForUser(LoginUser));
            } else {
                System.out.println(userAccount + "密码错误");
                return Result.error(userAccount + "密码错误");
            }
        }
    }

    //token验证
    @GetMapping("/token/validate")
    public Result tokenValidate(@RequestParam("token") String token) {
        return Result.success(JwtUtil.verifyAndGetUser(token));
    }

}
