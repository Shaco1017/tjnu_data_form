package shaco.tjnu_data_form.controller;

import com.mybatisflex.core.paginate.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import shaco.tjnu_data_form.entity.Jj3222Fszzb;
import shaco.tjnu_data_form.service.Jj3222FszzbService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 中等职业教育分年龄学生数 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj3222Fszzb")
public class Jj3222FszzbController {

    @Autowired
    private Jj3222FszzbService jj3222FszzbService;

    /**
     * 添加中等职业教育分年龄学生数。
     *
     * @param jj3222Fszzb 中等职业教育分年龄学生数
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj3222Fszzb jj3222Fszzb) {
        return jj3222FszzbService.save(jj3222Fszzb);
    }

    /**
     * 根据主键删除中等职业教育分年龄学生数。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj3222FszzbService.removeById(id);
    }

    /**
     * 根据主键更新中等职业教育分年龄学生数。
     *
     * @param jj3222Fszzb 中等职业教育分年龄学生数
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj3222Fszzb jj3222Fszzb) {
        return jj3222FszzbService.updateById(jj3222Fszzb);
    }

    /**
     * 查询所有中等职业教育分年龄学生数。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj3222Fszzb> list() {
        return jj3222FszzbService.list();
    }

    /**
     * 根据中等职业教育分年龄学生数主键获取详细信息。
     *
     * @param id 中等职业教育分年龄学生数主键
     * @return 中等职业教育分年龄学生数详情
     */
    @GetMapping("getInfo/{id}")
    public Jj3222Fszzb getInfo(@PathVariable Integer id) {
        return jj3222FszzbService.getById(id);
    }

    /**
     * 分页查询中等职业教育分年龄学生数。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj3222Fszzb> page(Page<Jj3222Fszzb> page) {
        return jj3222FszzbService.page(page);
    }

}
