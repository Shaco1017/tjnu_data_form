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
import shaco.tjnu_data_form.entity.Jj4063Dx;
import shaco.tjnu_data_form.service.Jj4063DxService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 专任教师变动情况 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj4063Dx")
public class Jj4063DxController {

    @Autowired
    private Jj4063DxService jj4063DxService;

    /**
     * 添加专任教师变动情况。
     *
     * @param jj4063Dx 专任教师变动情况
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj4063Dx jj4063Dx) {
        return jj4063DxService.save(jj4063Dx);
    }

    /**
     * 根据主键删除专任教师变动情况。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj4063DxService.removeById(id);
    }

    /**
     * 根据主键更新专任教师变动情况。
     *
     * @param jj4063Dx 专任教师变动情况
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj4063Dx jj4063Dx) {
        return jj4063DxService.updateById(jj4063Dx);
    }

    /**
     * 查询所有专任教师变动情况。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj4063Dx> list() {
        return jj4063DxService.list();
    }

    /**
     * 根据专任教师变动情况主键获取详细信息。
     *
     * @param id 专任教师变动情况主键
     * @return 专任教师变动情况详情
     */
    @GetMapping("getInfo/{id}")
    public Jj4063Dx getInfo(@PathVariable Integer id) {
        return jj4063DxService.getById(id);
    }

    /**
     * 分页查询专任教师变动情况。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj4063Dx> page(Page<Jj4063Dx> page) {
        return jj4063DxService.page(page);
    }

}
