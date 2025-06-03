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
import shaco.tjnu_data_form.entity.Jj3343Dx;
import shaco.tjnu_data_form.service.Jj3343DxService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 职业教育学生、高等教育学生休退学的主要原因 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj3343Dx")
public class Jj3343DxController {

    @Autowired
    private Jj3343DxService jj3343DxService;

    /**
     * 添加职业教育学生、高等教育学生休退学的主要原因。
     *
     * @param jj3343Dx 职业教育学生、高等教育学生休退学的主要原因
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj3343Dx jj3343Dx) {
        return jj3343DxService.save(jj3343Dx);
    }

    /**
     * 根据主键删除职业教育学生、高等教育学生休退学的主要原因。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj3343DxService.removeById(id);
    }

    /**
     * 根据主键更新职业教育学生、高等教育学生休退学的主要原因。
     *
     * @param jj3343Dx 职业教育学生、高等教育学生休退学的主要原因
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj3343Dx jj3343Dx) {
        return jj3343DxService.updateById(jj3343Dx);
    }

    /**
     * 查询所有职业教育学生、高等教育学生休退学的主要原因。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj3343Dx> list() {
        return jj3343DxService.list();
    }

    /**
     * 根据职业教育学生、高等教育学生休退学的主要原因主键获取详细信息。
     *
     * @param id 职业教育学生、高等教育学生休退学的主要原因主键
     * @return 职业教育学生、高等教育学生休退学的主要原因详情
     */
    @GetMapping("getInfo/{id}")
    public Jj3343Dx getInfo(@PathVariable Integer id) {
        return jj3343DxService.getById(id);
    }

    /**
     * 分页查询职业教育学生、高等教育学生休退学的主要原因。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj3343Dx> page(Page<Jj3343Dx> page) {
        return jj3343DxService.page(page);
    }

}
