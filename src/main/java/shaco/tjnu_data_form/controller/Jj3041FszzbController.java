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
import shaco.tjnu_data_form.entity.Jj3041Fszzb;
import shaco.tjnu_data_form.service.Jj3041FszzbService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 在校生中死亡的主要原因 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj3041Fszzb")
public class Jj3041FszzbController {

    @Autowired
    private Jj3041FszzbService jj3041FszzbService;

    /**
     * 添加在校生中死亡的主要原因。
     *
     * @param jj3041Fszzb 在校生中死亡的主要原因
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj3041Fszzb jj3041Fszzb) {
        return jj3041FszzbService.save(jj3041Fszzb);
    }

    /**
     * 根据主键删除在校生中死亡的主要原因。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj3041FszzbService.removeById(id);
    }

    /**
     * 根据主键更新在校生中死亡的主要原因。
     *
     * @param jj3041Fszzb 在校生中死亡的主要原因
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj3041Fszzb jj3041Fszzb) {
        return jj3041FszzbService.updateById(jj3041Fszzb);
    }

    /**
     * 查询所有在校生中死亡的主要原因。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj3041Fszzb> list() {
        return jj3041FszzbService.list();
    }

    /**
     * 根据在校生中死亡的主要原因主键获取详细信息。
     *
     * @param id 在校生中死亡的主要原因主键
     * @return 在校生中死亡的主要原因详情
     */
    @GetMapping("getInfo/{id}")
    public Jj3041Fszzb getInfo(@PathVariable Integer id) {
        return jj3041FszzbService.getById(id);
    }

    /**
     * 分页查询在校生中死亡的主要原因。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj3041Fszzb> page(Page<Jj3041Fszzb> page) {
        return jj3041FszzbService.page(page);
    }

}
