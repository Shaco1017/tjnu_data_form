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
import shaco.tjnu_data_form.entity.Jj3326Dx;
import shaco.tjnu_data_form.service.Jj3326DxService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 普通本科分专业学生数 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj3326Dx")
public class Jj3326DxController {

    @Autowired
    private Jj3326DxService jj3326DxService;

    /**
     * 添加普通本科分专业学生数。
     *
     * @param jj3326Dx 普通本科分专业学生数
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj3326Dx jj3326Dx) {
        return jj3326DxService.save(jj3326Dx);
    }

    /**
     * 根据主键删除普通本科分专业学生数。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj3326DxService.removeById(id);
    }

    /**
     * 根据主键更新普通本科分专业学生数。
     *
     * @param jj3326Dx 普通本科分专业学生数
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj3326Dx jj3326Dx) {
        return jj3326DxService.updateById(jj3326Dx);
    }

    /**
     * 查询所有普通本科分专业学生数。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj3326Dx> list() {
        return jj3326DxService.list();
    }

    /**
     * 根据普通本科分专业学生数主键获取详细信息。
     *
     * @param id 普通本科分专业学生数主键
     * @return 普通本科分专业学生数详情
     */
    @GetMapping("getInfo/{id}")
    public Jj3326Dx getInfo(@PathVariable Integer id) {
        return jj3326DxService.getById(id);
    }

    /**
     * 分页查询普通本科分专业学生数。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj3326Dx> page(Page<Jj3326Dx> page) {
        return jj3326DxService.page(page);
    }

}
