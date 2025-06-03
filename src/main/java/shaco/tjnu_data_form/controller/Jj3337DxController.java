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
import shaco.tjnu_data_form.entity.Jj3337Dx;
import shaco.tjnu_data_form.service.Jj3337DxService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 高等职业教育专科招生类型来源情况 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj3337Dx")
public class Jj3337DxController {

    @Autowired
    private Jj3337DxService jj3337DxService;

    /**
     * 添加高等职业教育专科招生类型来源情况。
     *
     * @param jj3337Dx 高等职业教育专科招生类型来源情况
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj3337Dx jj3337Dx) {
        return jj3337DxService.save(jj3337Dx);
    }

    /**
     * 根据主键删除高等职业教育专科招生类型来源情况。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj3337DxService.removeById(id);
    }

    /**
     * 根据主键更新高等职业教育专科招生类型来源情况。
     *
     * @param jj3337Dx 高等职业教育专科招生类型来源情况
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj3337Dx jj3337Dx) {
        return jj3337DxService.updateById(jj3337Dx);
    }

    /**
     * 查询所有高等职业教育专科招生类型来源情况。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj3337Dx> list() {
        return jj3337DxService.list();
    }

    /**
     * 根据高等职业教育专科招生类型来源情况主键获取详细信息。
     *
     * @param id 高等职业教育专科招生类型来源情况主键
     * @return 高等职业教育专科招生类型来源情况详情
     */
    @GetMapping("getInfo/{id}")
    public Jj3337Dx getInfo(@PathVariable Integer id) {
        return jj3337DxService.getById(id);
    }

    /**
     * 分页查询高等职业教育专科招生类型来源情况。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj3337Dx> page(Page<Jj3337Dx> page) {
        return jj3337DxService.page(page);
    }

}
