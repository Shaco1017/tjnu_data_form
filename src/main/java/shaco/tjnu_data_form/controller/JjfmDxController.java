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
import shaco.tjnu_data_form.entity.JjfmDx;
import shaco.tjnu_data_form.service.JjfmDxService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 教育事业综合统计调查表 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jjfmDx")
public class JjfmDxController {

    @Autowired
    private JjfmDxService jjfmDxService;

    /**
     * 添加教育事业综合统计调查表。
     *
     * @param jjfmDx 教育事业综合统计调查表
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody JjfmDx jjfmDx) {
        return jjfmDxService.save(jjfmDx);
    }

    /**
     * 根据主键删除教育事业综合统计调查表。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jjfmDxService.removeById(id);
    }

    /**
     * 根据主键更新教育事业综合统计调查表。
     *
     * @param jjfmDx 教育事业综合统计调查表
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody JjfmDx jjfmDx) {
        return jjfmDxService.updateById(jjfmDx);
    }

    /**
     * 查询所有教育事业综合统计调查表。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<JjfmDx> list() {
        return jjfmDxService.list();
    }

    /**
     * 根据教育事业综合统计调查表主键获取详细信息。
     *
     * @param id 教育事业综合统计调查表主键
     * @return 教育事业综合统计调查表详情
     */
    @GetMapping("getInfo/{id}")
    public JjfmDx getInfo(@PathVariable Integer id) {
        return jjfmDxService.getById(id);
    }

    /**
     * 分页查询教育事业综合统计调查表。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<JjfmDx> page(Page<JjfmDx> page) {
        return jjfmDxService.page(page);
    }

}
