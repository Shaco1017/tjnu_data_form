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
import shaco.tjnu_data_form.entity.Jj3244Dx;
import shaco.tjnu_data_form.service.Jj3244DxService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 职业教育招生中其他情况 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj3244Dx")
public class Jj3244DxController {

    @Autowired
    private Jj3244DxService jj3244DxService;

    /**
     * 添加职业教育招生中其他情况。
     *
     * @param jj3244Dx 职业教育招生中其他情况
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj3244Dx jj3244Dx) {
        return jj3244DxService.save(jj3244Dx);
    }

    /**
     * 根据主键删除职业教育招生中其他情况。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj3244DxService.removeById(id);
    }

    /**
     * 根据主键更新职业教育招生中其他情况。
     *
     * @param jj3244Dx 职业教育招生中其他情况
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj3244Dx jj3244Dx) {
        return jj3244DxService.updateById(jj3244Dx);
    }

    /**
     * 查询所有职业教育招生中其他情况。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj3244Dx> list() {
        return jj3244DxService.list();
    }

    /**
     * 根据职业教育招生中其他情况主键获取详细信息。
     *
     * @param id 职业教育招生中其他情况主键
     * @return 职业教育招生中其他情况详情
     */
    @GetMapping("getInfo/{id}")
    public Jj3244Dx getInfo(@PathVariable Integer id) {
        return jj3244DxService.getById(id);
    }

    /**
     * 分页查询职业教育招生中其他情况。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj3244Dx> page(Page<Jj3244Dx> page) {
        return jj3244DxService.page(page);
    }

}
