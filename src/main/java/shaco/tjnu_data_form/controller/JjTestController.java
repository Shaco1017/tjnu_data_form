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
import shaco.tjnu_data_form.entity.JjTest;
import shaco.tjnu_data_form.service.JjTestService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * jj_test 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jjTest")
public class JjTestController {

    @Autowired
    private JjTestService jjTestService;

    /**
     * 添加jj_test。
     *
     * @param jjTest jj_test
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody JjTest jjTest) {
        return jjTestService.save(jjTest);
    }

    /**
     * 根据主键删除jj_test。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jjTestService.removeById(id);
    }

    /**
     * 根据主键更新jj_test。
     *
     * @param jjTest jj_test
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody JjTest jjTest) {
        return jjTestService.updateById(jjTest);
    }

    /**
     * 查询所有jj_test。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<JjTest> list() {
        return jjTestService.list();
    }

    /**
     * 根据jj_test主键获取详细信息。
     *
     * @param id jj_test主键
     * @return jj_test详情
     */
    @GetMapping("getInfo/{id}")
    public JjTest getInfo(@PathVariable Integer id) {
        return jjTestService.getById(id);
    }

    /**
     * 分页查询jj_test。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<JjTest> page(Page<JjTest> page) {
        return jjTestService.page(page);
    }

}
