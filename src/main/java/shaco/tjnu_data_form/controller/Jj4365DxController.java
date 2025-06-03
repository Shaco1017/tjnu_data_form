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
import shaco.tjnu_data_form.entity.Jj4365Dx;
import shaco.tjnu_data_form.service.Jj4365DxService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 研究生指导教师情况 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj4365Dx")
public class Jj4365DxController {

    @Autowired
    private Jj4365DxService jj4365DxService;

    /**
     * 添加研究生指导教师情况。
     *
     * @param jj4365Dx 研究生指导教师情况
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj4365Dx jj4365Dx) {
        return jj4365DxService.save(jj4365Dx);
    }

    /**
     * 根据主键删除研究生指导教师情况。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj4365DxService.removeById(id);
    }

    /**
     * 根据主键更新研究生指导教师情况。
     *
     * @param jj4365Dx 研究生指导教师情况
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj4365Dx jj4365Dx) {
        return jj4365DxService.updateById(jj4365Dx);
    }

    /**
     * 查询所有研究生指导教师情况。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj4365Dx> list() {
        return jj4365DxService.list();
    }

    /**
     * 根据研究生指导教师情况主键获取详细信息。
     *
     * @param id 研究生指导教师情况主键
     * @return 研究生指导教师情况详情
     */
    @GetMapping("getInfo/{id}")
    public Jj4365Dx getInfo(@PathVariable Integer id) {
        return jj4365DxService.getById(id);
    }

    /**
     * 分页查询研究生指导教师情况。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj4365Dx> page(Page<Jj4365Dx> page) {
        return jj4365DxService.page(page);
    }

}
