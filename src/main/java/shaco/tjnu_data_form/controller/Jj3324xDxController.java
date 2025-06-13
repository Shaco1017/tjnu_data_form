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
import shaco.tjnu_data_form.entity.Jj3324xDx;
import shaco.tjnu_data_form.service.Jj3324xDxService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 教基3324续_大学 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj3324xDx")
public class Jj3324xDxController {

    @Autowired
    private Jj3324xDxService jj3324xDxService;

    /**
     * 添加教基3324续_大学。
     *
     * @param jj3324xDx 教基3324续_大学
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj3324xDx jj3324xDx) {
        return jj3324xDxService.save(jj3324xDx);
    }

    /**
     * 根据主键删除教基3324续_大学。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj3324xDxService.removeById(id);
    }

    /**
     * 根据主键更新教基3324续_大学。
     *
     * @param jj3324xDx 教基3324续_大学
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj3324xDx jj3324xDx) {
        return jj3324xDxService.updateById(jj3324xDx);
    }

    /**
     * 查询所有教基3324续_大学。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj3324xDx> list() {
        return jj3324xDxService.list();
    }

    /**
     * 根据教基3324续_大学主键获取详细信息。
     *
     * @param id 教基3324续_大学主键
     * @return 教基3324续_大学详情
     */
    @GetMapping("getInfo/{id}")
    public Jj3324xDx getInfo(@PathVariable Integer id) {
        return jj3324xDxService.getById(id);
    }

    /**
     * 分页查询教基3324续_大学。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj3324xDx> page(Page<Jj3324xDx> page) {
        return jj3324xDxService.page(page);
    }

}
