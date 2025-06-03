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
import shaco.tjnu_data_form.entity.Jj5377Dx;
import shaco.tjnu_data_form.service.Jj5377DxService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 职业教育学校、高等教育学校资产等办学条件 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj5377Dx")
public class Jj5377DxController {

    @Autowired
    private Jj5377DxService jj5377DxService;

    /**
     * 添加职业教育学校、高等教育学校资产等办学条件。
     *
     * @param jj5377Dx 职业教育学校、高等教育学校资产等办学条件
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj5377Dx jj5377Dx) {
        return jj5377DxService.save(jj5377Dx);
    }

    /**
     * 根据主键删除职业教育学校、高等教育学校资产等办学条件。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj5377DxService.removeById(id);
    }

    /**
     * 根据主键更新职业教育学校、高等教育学校资产等办学条件。
     *
     * @param jj5377Dx 职业教育学校、高等教育学校资产等办学条件
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj5377Dx jj5377Dx) {
        return jj5377DxService.updateById(jj5377Dx);
    }

    /**
     * 查询所有职业教育学校、高等教育学校资产等办学条件。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj5377Dx> list() {
        return jj5377DxService.list();
    }

    /**
     * 根据职业教育学校、高等教育学校资产等办学条件主键获取详细信息。
     *
     * @param id 职业教育学校、高等教育学校资产等办学条件主键
     * @return 职业教育学校、高等教育学校资产等办学条件详情
     */
    @GetMapping("getInfo/{id}")
    public Jj5377Dx getInfo(@PathVariable Integer id) {
        return jj5377DxService.getById(id);
    }

    /**
     * 分页查询职业教育学校、高等教育学校资产等办学条件。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj5377Dx> page(Page<Jj5377Dx> page) {
        return jj5377DxService.page(page);
    }

}
