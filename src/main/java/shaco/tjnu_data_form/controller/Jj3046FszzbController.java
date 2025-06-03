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
import shaco.tjnu_data_form.entity.Jj3046Fszzb;
import shaco.tjnu_data_form.service.Jj3046FszzbService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 国际学生基本情况 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj3046Fszzb")
public class Jj3046FszzbController {

    @Autowired
    private Jj3046FszzbService jj3046FszzbService;

    /**
     * 添加国际学生基本情况。
     *
     * @param jj3046Fszzb 国际学生基本情况
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj3046Fszzb jj3046Fszzb) {
        return jj3046FszzbService.save(jj3046Fszzb);
    }

    /**
     * 根据主键删除国际学生基本情况。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj3046FszzbService.removeById(id);
    }

    /**
     * 根据主键更新国际学生基本情况。
     *
     * @param jj3046Fszzb 国际学生基本情况
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj3046Fszzb jj3046Fszzb) {
        return jj3046FszzbService.updateById(jj3046Fszzb);
    }

    /**
     * 查询所有国际学生基本情况。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj3046Fszzb> list() {
        return jj3046FszzbService.list();
    }

    /**
     * 根据国际学生基本情况主键获取详细信息。
     *
     * @param id 国际学生基本情况主键
     * @return 国际学生基本情况详情
     */
    @GetMapping("getInfo/{id}")
    public Jj3046Fszzb getInfo(@PathVariable Integer id) {
        return jj3046FszzbService.getById(id);
    }

    /**
     * 分页查询国际学生基本情况。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj3046Fszzb> page(Page<Jj3046Fszzb> page) {
        return jj3046FszzbService.page(page);
    }

}
