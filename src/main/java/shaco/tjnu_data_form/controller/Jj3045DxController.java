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
import shaco.tjnu_data_form.entity.Jj3045Dx;
import shaco.tjnu_data_form.service.Jj3045DxService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 在校生中其他情况 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj3045Dx")
public class Jj3045DxController {

    @Autowired
    private Jj3045DxService jj3045DxService;

    /**
     * 添加在校生中其他情况。
     *
     * @param jj3045Dx 在校生中其他情况
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj3045Dx jj3045Dx) {
        return jj3045DxService.save(jj3045Dx);
    }

    /**
     * 根据主键删除在校生中其他情况。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj3045DxService.removeById(id);
    }

    /**
     * 根据主键更新在校生中其他情况。
     *
     * @param jj3045Dx 在校生中其他情况
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj3045Dx jj3045Dx) {
        return jj3045DxService.updateById(jj3045Dx);
    }

    /**
     * 查询所有在校生中其他情况。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj3045Dx> list() {
        return jj3045DxService.list();
    }

    /**
     * 根据在校生中其他情况主键获取详细信息。
     *
     * @param id 在校生中其他情况主键
     * @return 在校生中其他情况详情
     */
    @GetMapping("getInfo/{id}")
    public Jj3045Dx getInfo(@PathVariable Integer id) {
        return jj3045DxService.getById(id);
    }

    /**
     * 分页查询在校生中其他情况。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj3045Dx> page(Page<Jj3045Dx> page) {
        return jj3045DxService.page(page);
    }

}
