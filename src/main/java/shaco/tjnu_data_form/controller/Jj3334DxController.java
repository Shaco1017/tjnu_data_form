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
import shaco.tjnu_data_form.entity.Jj3334Dx;
import shaco.tjnu_data_form.service.Jj3334DxService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 高等教育分年龄在校学生数 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj3334Dx")
public class Jj3334DxController {

    @Autowired
    private Jj3334DxService jj3334DxService;

    /**
     * 添加高等教育分年龄在校学生数。
     *
     * @param jj3334Dx 高等教育分年龄在校学生数
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj3334Dx jj3334Dx) {
        return jj3334DxService.save(jj3334Dx);
    }

    /**
     * 根据主键删除高等教育分年龄在校学生数。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj3334DxService.removeById(id);
    }

    /**
     * 根据主键更新高等教育分年龄在校学生数。
     *
     * @param jj3334Dx 高等教育分年龄在校学生数
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj3334Dx jj3334Dx) {
        return jj3334DxService.updateById(jj3334Dx);
    }

    /**
     * 查询所有高等教育分年龄在校学生数。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj3334Dx> list() {
        return jj3334DxService.list();
    }

    /**
     * 根据高等教育分年龄在校学生数主键获取详细信息。
     *
     * @param id 高等教育分年龄在校学生数主键
     * @return 高等教育分年龄在校学生数详情
     */
    @GetMapping("getInfo/{id}")
    public Jj3334Dx getInfo(@PathVariable Integer id) {
        return jj3334DxService.getById(id);
    }

    /**
     * 分页查询高等教育分年龄在校学生数。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj3334Dx> page(Page<Jj3334Dx> page) {
        return jj3334DxService.page(page);
    }

}
