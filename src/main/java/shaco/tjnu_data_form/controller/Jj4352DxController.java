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
import shaco.tjnu_data_form.entity.Jj4352Dx;
import shaco.tjnu_data_form.service.Jj4352DxService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 高等教育学校教职工情况 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj4352Dx")
public class Jj4352DxController {

    @Autowired
    private Jj4352DxService jj4352DxService;

    /**
     * 添加高等教育学校教职工情况。
     *
     * @param jj4352Dx 高等教育学校教职工情况
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj4352Dx jj4352Dx) {
        return jj4352DxService.save(jj4352Dx);
    }

    /**
     * 根据主键删除高等教育学校教职工情况。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj4352DxService.removeById(id);
    }

    /**
     * 根据主键更新高等教育学校教职工情况。
     *
     * @param jj4352Dx 高等教育学校教职工情况
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj4352Dx jj4352Dx) {
        return jj4352DxService.updateById(jj4352Dx);
    }

    /**
     * 查询所有高等教育学校教职工情况。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj4352Dx> list() {
        return jj4352DxService.list();
    }

    /**
     * 根据高等教育学校教职工情况主键获取详细信息。
     *
     * @param id 高等教育学校教职工情况主键
     * @return 高等教育学校教职工情况详情
     */
    @GetMapping("getInfo/{id}")
    public Jj4352Dx getInfo(@PathVariable Integer id) {
        return jj4352DxService.getById(id);
    }

    /**
     * 分页查询高等教育学校教职工情况。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj4352Dx> page(Page<Jj4352Dx> page) {
        return jj4352DxService.page(page);
    }

}
