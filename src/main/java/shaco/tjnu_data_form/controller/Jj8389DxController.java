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
import shaco.tjnu_data_form.entity.Jj8389Dx;
import shaco.tjnu_data_form.service.Jj8389DxService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 职业教育学校、高等教育学校资产等办学条件 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj8389Dx")
public class Jj8389DxController {

    @Autowired
    private Jj8389DxService jj8389DxService;

    /**
     * 添加职业教育学校、高等教育学校资产等办学条件。
     *
     * @param jj8389Dx 职业教育学校、高等教育学校资产等办学条件
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj8389Dx jj8389Dx) {
        return jj8389DxService.save(jj8389Dx);
    }

    /**
     * 根据主键删除职业教育学校、高等教育学校资产等办学条件。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj8389DxService.removeById(id);
    }

    /**
     * 根据主键更新职业教育学校、高等教育学校资产等办学条件。
     *
     * @param jj8389Dx 职业教育学校、高等教育学校资产等办学条件
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj8389Dx jj8389Dx) {
        return jj8389DxService.updateById(jj8389Dx);
    }

    /**
     * 查询所有职业教育学校、高等教育学校资产等办学条件。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj8389Dx> list() {
        return jj8389DxService.list();
    }

    /**
     * 根据职业教育学校、高等教育学校资产等办学条件主键获取详细信息。
     *
     * @param id 职业教育学校、高等教育学校资产等办学条件主键
     * @return 职业教育学校、高等教育学校资产等办学条件详情
     */
    @GetMapping("getInfo/{id}")
    public Jj8389Dx getInfo(@PathVariable Integer id) {
        return jj8389DxService.getById(id);
    }

    /**
     * 分页查询职业教育学校、高等教育学校资产等办学条件。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj8389Dx> page(Page<Jj8389Dx> page) {
        return jj8389DxService.page(page);
    }

}
