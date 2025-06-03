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
import shaco.tjnu_data_form.entity.Jj1203Fszzb;
import shaco.tjnu_data_form.service.Jj1203FszzbService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 职业教育学校基本情况 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj1203Fszzb")
public class Jj1203FszzbController {

    @Autowired
    private Jj1203FszzbService jj1203FszzbService;

    /**
     * 添加职业教育学校基本情况。
     *
     * @param jj1203Fszzb 职业教育学校基本情况
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj1203Fszzb jj1203Fszzb) {
        return jj1203FszzbService.save(jj1203Fszzb);
    }

    /**
     * 根据主键删除职业教育学校基本情况。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj1203FszzbService.removeById(id);
    }

    /**
     * 根据主键更新职业教育学校基本情况。
     *
     * @param jj1203Fszzb 职业教育学校基本情况
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj1203Fszzb jj1203Fszzb) {
        return jj1203FszzbService.updateById(jj1203Fszzb);
    }

    /**
     * 查询所有职业教育学校基本情况。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj1203Fszzb> list() {
        return jj1203FszzbService.list();
    }

    /**
     * 根据职业教育学校基本情况主键获取详细信息。
     *
     * @param id 职业教育学校基本情况主键
     * @return 职业教育学校基本情况详情
     */
    @GetMapping("getInfo/{id}")
    public Jj1203Fszzb getInfo(@PathVariable Integer id) {
        return jj1203FszzbService.getById(id);
    }

    /**
     * 分页查询职业教育学校基本情况。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj1203Fszzb> page(Page<Jj1203Fszzb> page) {
        return jj1203FszzbService.page(page);
    }

}
