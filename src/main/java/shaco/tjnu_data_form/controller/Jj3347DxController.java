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
import shaco.tjnu_data_form.entity.Jj3347Dx;
import shaco.tjnu_data_form.service.Jj3347DxService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 对外开展培训情况 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj3347Dx")
public class Jj3347DxController {

    @Autowired
    private Jj3347DxService jj3347DxService;

    /**
     * 添加对外开展培训情况。
     *
     * @param jj3347Dx 对外开展培训情况
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj3347Dx jj3347Dx) {
        return jj3347DxService.save(jj3347Dx);
    }

    /**
     * 根据主键删除对外开展培训情况。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj3347DxService.removeById(id);
    }

    /**
     * 根据主键更新对外开展培训情况。
     *
     * @param jj3347Dx 对外开展培训情况
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj3347Dx jj3347Dx) {
        return jj3347DxService.updateById(jj3347Dx);
    }

    /**
     * 查询所有对外开展培训情况。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj3347Dx> list() {
        return jj3347DxService.list();
    }

    /**
     * 根据对外开展培训情况主键获取详细信息。
     *
     * @param id 对外开展培训情况主键
     * @return 对外开展培训情况详情
     */
    @GetMapping("getInfo/{id}")
    public Jj3347Dx getInfo(@PathVariable Integer id) {
        return jj3347DxService.getById(id);
    }

    /**
     * 分页查询对外开展培训情况。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj3347Dx> page(Page<Jj3347Dx> page) {
        return jj3347DxService.page(page);
    }

}
