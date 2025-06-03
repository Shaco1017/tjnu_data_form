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
import shaco.tjnu_data_form.entity.Jj3040Dx;
import shaco.tjnu_data_form.service.Jj3040DxService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 学生变动情况 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj3040Dx")
public class Jj3040DxController {

    @Autowired
    private Jj3040DxService jj3040DxService;

    /**
     * 添加学生变动情况。
     *
     * @param jj3040Dx 学生变动情况
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj3040Dx jj3040Dx) {
        return jj3040DxService.save(jj3040Dx);
    }

    /**
     * 根据主键删除学生变动情况。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj3040DxService.removeById(id);
    }

    /**
     * 根据主键更新学生变动情况。
     *
     * @param jj3040Dx 学生变动情况
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj3040Dx jj3040Dx) {
        return jj3040DxService.updateById(jj3040Dx);
    }

    /**
     * 查询所有学生变动情况。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj3040Dx> list() {
        return jj3040DxService.list();
    }

    /**
     * 根据学生变动情况主键获取详细信息。
     *
     * @param id 学生变动情况主键
     * @return 学生变动情况详情
     */
    @GetMapping("getInfo/{id}")
    public Jj3040Dx getInfo(@PathVariable Integer id) {
        return jj3040DxService.getById(id);
    }

    /**
     * 分页查询学生变动情况。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj3040Dx> page(Page<Jj3040Dx> page) {
        return jj3040DxService.page(page);
    }

}
