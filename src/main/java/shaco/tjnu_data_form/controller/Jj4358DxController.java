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
import shaco.tjnu_data_form.entity.Jj4358Dx;
import shaco.tjnu_data_form.service.Jj4358DxService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 高等教育学校专任教师教学领域分学科门类情况 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj4358Dx")
public class Jj4358DxController {

    @Autowired
    private Jj4358DxService jj4358DxService;

    /**
     * 添加高等教育学校专任教师教学领域分学科门类情况。
     *
     * @param jj4358Dx 高等教育学校专任教师教学领域分学科门类情况
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj4358Dx jj4358Dx) {
        return jj4358DxService.save(jj4358Dx);
    }

    /**
     * 根据主键删除高等教育学校专任教师教学领域分学科门类情况。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj4358DxService.removeById(id);
    }

    /**
     * 根据主键更新高等教育学校专任教师教学领域分学科门类情况。
     *
     * @param jj4358Dx 高等教育学校专任教师教学领域分学科门类情况
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj4358Dx jj4358Dx) {
        return jj4358DxService.updateById(jj4358Dx);
    }

    /**
     * 查询所有高等教育学校专任教师教学领域分学科门类情况。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj4358Dx> list() {
        return jj4358DxService.list();
    }

    /**
     * 根据高等教育学校专任教师教学领域分学科门类情况主键获取详细信息。
     *
     * @param id 高等教育学校专任教师教学领域分学科门类情况主键
     * @return 高等教育学校专任教师教学领域分学科门类情况详情
     */
    @GetMapping("getInfo/{id}")
    public Jj4358Dx getInfo(@PathVariable Integer id) {
        return jj4358DxService.getById(id);
    }

    /**
     * 分页查询高等教育学校专任教师教学领域分学科门类情况。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj4358Dx> page(Page<Jj4358Dx> page) {
        return jj4358DxService.page(page);
    }

}
