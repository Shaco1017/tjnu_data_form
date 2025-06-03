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
import shaco.tjnu_data_form.entity.Jj3336Dx;
import shaco.tjnu_data_form.service.Jj3336DxService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 高等职业教育专科录取类型来源情况 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj3336Dx")
public class Jj3336DxController {

    @Autowired
    private Jj3336DxService jj3336DxService;

    /**
     * 添加高等职业教育专科录取类型来源情况。
     *
     * @param jj3336Dx 高等职业教育专科录取类型来源情况
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj3336Dx jj3336Dx) {
        return jj3336DxService.save(jj3336Dx);
    }

    /**
     * 根据主键删除高等职业教育专科录取类型来源情况。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj3336DxService.removeById(id);
    }

    /**
     * 根据主键更新高等职业教育专科录取类型来源情况。
     *
     * @param jj3336Dx 高等职业教育专科录取类型来源情况
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj3336Dx jj3336Dx) {
        return jj3336DxService.updateById(jj3336Dx);
    }

    /**
     * 查询所有高等职业教育专科录取类型来源情况。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj3336Dx> list() {
        return jj3336DxService.list();
    }

    /**
     * 根据高等职业教育专科录取类型来源情况主键获取详细信息。
     *
     * @param id 高等职业教育专科录取类型来源情况主键
     * @return 高等职业教育专科录取类型来源情况详情
     */
    @GetMapping("getInfo/{id}")
    public Jj3336Dx getInfo(@PathVariable Integer id) {
        return jj3336DxService.getById(id);
    }

    /**
     * 分页查询高等职业教育专科录取类型来源情况。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj3336Dx> page(Page<Jj3336Dx> page) {
        return jj3336DxService.page(page);
    }

}
