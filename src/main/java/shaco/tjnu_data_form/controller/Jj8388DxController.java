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
import shaco.tjnu_data_form.entity.Jj8388Dx;
import shaco.tjnu_data_form.service.Jj8388DxService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 高等教育学校（普通）校舍功能明细统计调查表（台账） 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj8388Dx")
public class Jj8388DxController {

    @Autowired
    private Jj8388DxService jj8388DxService;

    /**
     * 添加高等教育学校（普通）校舍功能明细统计调查表（台账）。
     *
     * @param jj8388Dx 高等教育学校（普通）校舍功能明细统计调查表（台账）
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj8388Dx jj8388Dx) {
        return jj8388DxService.save(jj8388Dx);
    }

    /**
     * 根据主键删除高等教育学校（普通）校舍功能明细统计调查表（台账）。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj8388DxService.removeById(id);
    }

    /**
     * 根据主键更新高等教育学校（普通）校舍功能明细统计调查表（台账）。
     *
     * @param jj8388Dx 高等教育学校（普通）校舍功能明细统计调查表（台账）
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj8388Dx jj8388Dx) {
        return jj8388DxService.updateById(jj8388Dx);
    }

    /**
     * 查询所有高等教育学校（普通）校舍功能明细统计调查表（台账）。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj8388Dx> list() {
        return jj8388DxService.list();
    }

    /**
     * 根据高等教育学校（普通）校舍功能明细统计调查表（台账）主键获取详细信息。
     *
     * @param id 高等教育学校（普通）校舍功能明细统计调查表（台账）主键
     * @return 高等教育学校（普通）校舍功能明细统计调查表（台账）详情
     */
    @GetMapping("getInfo/{id}")
    public Jj8388Dx getInfo(@PathVariable Integer id) {
        return jj8388DxService.getById(id);
    }

    /**
     * 分页查询高等教育学校（普通）校舍功能明细统计调查表（台账）。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj8388Dx> page(Page<Jj8388Dx> page) {
        return jj8388DxService.page(page);
    }

}
