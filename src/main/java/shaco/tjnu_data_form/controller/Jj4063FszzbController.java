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
import shaco.tjnu_data_form.entity.Jj4063Fszzb;
import shaco.tjnu_data_form.service.Jj4063FszzbService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 专任教师变动情况 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj4063Fszzb")
public class Jj4063FszzbController {

    @Autowired
    private Jj4063FszzbService jj4063FszzbService;

    /**
     * 添加专任教师变动情况。
     *
     * @param jj4063Fszzb 专任教师变动情况
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj4063Fszzb jj4063Fszzb) {
        return jj4063FszzbService.save(jj4063Fszzb);
    }

    /**
     * 根据主键删除专任教师变动情况。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj4063FszzbService.removeById(id);
    }

    /**
     * 根据主键更新专任教师变动情况。
     *
     * @param jj4063Fszzb 专任教师变动情况
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj4063Fszzb jj4063Fszzb) {
        return jj4063FszzbService.updateById(jj4063Fszzb);
    }

    /**
     * 查询所有专任教师变动情况。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj4063Fszzb> list() {
        return jj4063FszzbService.list();
    }

    /**
     * 根据专任教师变动情况主键获取详细信息。
     *
     * @param id 专任教师变动情况主键
     * @return 专任教师变动情况详情
     */
    @GetMapping("getInfo/{id}")
    public Jj4063Fszzb getInfo(@PathVariable Integer id) {
        return jj4063FszzbService.getById(id);
    }

    /**
     * 分页查询专任教师变动情况。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj4063Fszzb> page(Page<Jj4063Fszzb> page) {
        return jj4063FszzbService.page(page);
    }

}
