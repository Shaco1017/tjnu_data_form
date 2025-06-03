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
import shaco.tjnu_data_form.entity.Jj3332Dx;
import shaco.tjnu_data_form.service.Jj3332DxService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 博士研究生分专业（领域）学生数 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj3332Dx")
public class Jj3332DxController {

    @Autowired
    private Jj3332DxService jj3332DxService;

    /**
     * 添加博士研究生分专业（领域）学生数。
     *
     * @param jj3332Dx 博士研究生分专业（领域）学生数
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj3332Dx jj3332Dx) {
        return jj3332DxService.save(jj3332Dx);
    }

    /**
     * 根据主键删除博士研究生分专业（领域）学生数。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj3332DxService.removeById(id);
    }

    /**
     * 根据主键更新博士研究生分专业（领域）学生数。
     *
     * @param jj3332Dx 博士研究生分专业（领域）学生数
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj3332Dx jj3332Dx) {
        return jj3332DxService.updateById(jj3332Dx);
    }

    /**
     * 查询所有博士研究生分专业（领域）学生数。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj3332Dx> list() {
        return jj3332DxService.list();
    }

    /**
     * 根据博士研究生分专业（领域）学生数主键获取详细信息。
     *
     * @param id 博士研究生分专业（领域）学生数主键
     * @return 博士研究生分专业（领域）学生数详情
     */
    @GetMapping("getInfo/{id}")
    public Jj3332Dx getInfo(@PathVariable Integer id) {
        return jj3332DxService.getById(id);
    }

    /**
     * 分页查询博士研究生分专业（领域）学生数。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj3332Dx> page(Page<Jj3332Dx> page) {
        return jj3332DxService.page(page);
    }

}
