package shaco.tjnu_data_form.controller;

import com.mybatisflex.core.paginate.Page;
import com.mybatisflex.core.query.QueryWrapper;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import shaco.tjnu_data_form.common.Result;
import shaco.tjnu_data_form.entity.Jj1001Dx;
import shaco.tjnu_data_form.service.Jj1001DxService;

import java.util.List;

/**
 * 学校基本情况 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/Jj1001_Dx")
public class Jj1001DxController {

    @Autowired
    private Jj1001DxService jj1001DxService;

    /**
     * 添加学校基本情况。
     *
     * @param jj1001Dx 学校基本情况
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj1001Dx jj1001Dx) {
        return jj1001DxService.save(jj1001Dx);
    }

    /**
     * 根据主键删除学校基本情况。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj1001DxService.removeById(id);
    }

    /**
     * 根据主键更新学校基本情况。
     *
     * @param jj1001Dx 学校基本情况
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj1001Dx jj1001Dx) {
        return jj1001DxService.updateById(jj1001Dx);
    }

    /**
     * 查询所有学校基本情况。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj1001Dx> list() {
        return jj1001DxService.list();
    }

    /**
     * 根据学校基本情况主键获取详细信息。
     *
     * @param id 学校基本情况主键
     * @return 学校基本情况详情
     */
    @GetMapping("getInfo/{id}")
    public Jj1001Dx getInfo(@PathVariable Integer id) {
        return jj1001DxService.getById(id);
    }

    /**
     * 分页查询学校基本情况。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj1001Dx> page(Page<Jj1001Dx> page) {
        return jj1001DxService.page(page);
    }


    @GetMapping("getFormData")
    public Result getFormData(@RequestHeader("formStatisticalTime") Integer formStatisticalTime) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.select().from("jj1001_dx").where("statistical_time=?", formStatisticalTime);
        if (!jj1001DxService.getMapper().selectListByQuery(queryWrapper).isEmpty()) {
            return Result.success(jj1001DxService.getMapper().selectListByQuery(queryWrapper));
        } else return Result.error("", "数据查询失败");
    }

    /**
     * 根据主键更新高等职业教育专科分专业学生数。
     *
     * @param jj1001Dx 高等职业教育专科分专业学生数
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("saveOrUpdate")
    public Result saveOrUpdate(@RequestBody Jj1001Dx jj1001Dx) {
        return Result.success(jj1001DxService.saveOrUpdate(jj1001Dx));
    }

}
