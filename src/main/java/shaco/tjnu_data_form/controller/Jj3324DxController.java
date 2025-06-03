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
import shaco.tjnu_data_form.entity.Jj3324Dx;
import shaco.tjnu_data_form.service.Jj3324DxService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 高等职业教育专科分专业学生数 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj3324Dx")
public class Jj3324DxController {

    @Autowired
    private Jj3324DxService jj3324DxService;

    /**
     * 添加高等职业教育专科分专业学生数。
     *
     * @param jj3324Dx 高等职业教育专科分专业学生数
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj3324Dx jj3324Dx) {
        return jj3324DxService.save(jj3324Dx);
    }

    /**
     * 根据主键删除高等职业教育专科分专业学生数。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj3324DxService.removeById(id);
    }

    /**
     * 根据主键更新高等职业教育专科分专业学生数。
     *
     * @param jj3324Dx 高等职业教育专科分专业学生数
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj3324Dx jj3324Dx) {
        return jj3324DxService.updateById(jj3324Dx);
    }

    /**
     * 查询所有高等职业教育专科分专业学生数。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj3324Dx> list() {
        return jj3324DxService.list();
    }

    /**
     * 根据高等职业教育专科分专业学生数主键获取详细信息。
     *
     * @param id 高等职业教育专科分专业学生数主键
     * @return 高等职业教育专科分专业学生数详情
     */
    @GetMapping("getInfo/{id}")
    public Jj3324Dx getInfo(@PathVariable Integer id) {
        return jj3324DxService.getById(id);
    }

    /**
     * 分页查询高等职业教育专科分专业学生数。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj3324Dx> page(Page<Jj3324Dx> page) {
        return jj3324DxService.page(page);
    }

}
