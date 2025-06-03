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
import shaco.tjnu_data_form.entity.Jj4067Dx;
import shaco.tjnu_data_form.service.Jj4067DxService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 教职工其他情况 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj4067Dx")
public class Jj4067DxController {

    @Autowired
    private Jj4067DxService jj4067DxService;

    /**
     * 添加教职工其他情况。
     *
     * @param jj4067Dx 教职工其他情况
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj4067Dx jj4067Dx) {
        return jj4067DxService.save(jj4067Dx);
    }

    /**
     * 根据主键删除教职工其他情况。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj4067DxService.removeById(id);
    }

    /**
     * 根据主键更新教职工其他情况。
     *
     * @param jj4067Dx 教职工其他情况
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj4067Dx jj4067Dx) {
        return jj4067DxService.updateById(jj4067Dx);
    }

    /**
     * 查询所有教职工其他情况。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj4067Dx> list() {
        return jj4067DxService.list();
    }

    /**
     * 根据教职工其他情况主键获取详细信息。
     *
     * @param id 教职工其他情况主键
     * @return 教职工其他情况详情
     */
    @GetMapping("getInfo/{id}")
    public Jj4067Dx getInfo(@PathVariable Integer id) {
        return jj4067DxService.getById(id);
    }

    /**
     * 分页查询教职工其他情况。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj4067Dx> page(Page<Jj4067Dx> page) {
        return jj4067DxService.page(page);
    }

}
