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
import shaco.tjnu_data_form.entity.Jj3328Dx;
import shaco.tjnu_data_form.service.Jj3328DxService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 成人本科分专业学生数 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj3328Dx")
public class Jj3328DxController {

    @Autowired
    private Jj3328DxService jj3328DxService;

    /**
     * 添加成人本科分专业学生数。
     *
     * @param jj3328Dx 成人本科分专业学生数
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj3328Dx jj3328Dx) {
        return jj3328DxService.save(jj3328Dx);
    }

    /**
     * 根据主键删除成人本科分专业学生数。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj3328DxService.removeById(id);
    }

    /**
     * 根据主键更新成人本科分专业学生数。
     *
     * @param jj3328Dx 成人本科分专业学生数
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj3328Dx jj3328Dx) {
        return jj3328DxService.updateById(jj3328Dx);
    }

    /**
     * 查询所有成人本科分专业学生数。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj3328Dx> list() {
        return jj3328DxService.list();
    }

    /**
     * 根据成人本科分专业学生数主键获取详细信息。
     *
     * @param id 成人本科分专业学生数主键
     * @return 成人本科分专业学生数详情
     */
    @GetMapping("getInfo/{id}")
    public Jj3328Dx getInfo(@PathVariable Integer id) {
        return jj3328DxService.getById(id);
    }

    /**
     * 分页查询成人本科分专业学生数。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj3328Dx> page(Page<Jj3328Dx> page) {
        return jj3328DxService.page(page);
    }

}
