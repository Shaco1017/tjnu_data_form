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
import shaco.tjnu_data_form.entity.Jj3335Dx;
import shaco.tjnu_data_form.service.Jj3335DxService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 高等教育招生、在校生来源情况 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj3335Dx")
public class Jj3335DxController {

    @Autowired
    private Jj3335DxService jj3335DxService;

    /**
     * 添加高等教育招生、在校生来源情况。
     *
     * @param jj3335Dx 高等教育招生、在校生来源情况
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj3335Dx jj3335Dx) {
        return jj3335DxService.save(jj3335Dx);
    }

    /**
     * 根据主键删除高等教育招生、在校生来源情况。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj3335DxService.removeById(id);
    }

    /**
     * 根据主键更新高等教育招生、在校生来源情况。
     *
     * @param jj3335Dx 高等教育招生、在校生来源情况
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj3335Dx jj3335Dx) {
        return jj3335DxService.updateById(jj3335Dx);
    }

    /**
     * 查询所有高等教育招生、在校生来源情况。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj3335Dx> list() {
        return jj3335DxService.list();
    }

    /**
     * 根据高等教育招生、在校生来源情况主键获取详细信息。
     *
     * @param id 高等教育招生、在校生来源情况主键
     * @return 高等教育招生、在校生来源情况详情
     */
    @GetMapping("getInfo/{id}")
    public Jj3335Dx getInfo(@PathVariable Integer id) {
        return jj3335DxService.getById(id);
    }

    /**
     * 分页查询高等教育招生、在校生来源情况。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj3335Dx> page(Page<Jj3335Dx> page) {
        return jj3335DxService.page(page);
    }

}
