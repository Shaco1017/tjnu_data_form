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
import shaco.tjnu_data_form.entity.Jj4354Fszzb;
import shaco.tjnu_data_form.service.Jj4354FszzbService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 职业教育学校、高等教育学校专任教师分年龄情况 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj4354Fszzb")
public class Jj4354FszzbController {

    @Autowired
    private Jj4354FszzbService jj4354FszzbService;

    /**
     * 添加职业教育学校、高等教育学校专任教师分年龄情况。
     *
     * @param jj4354Fszzb 职业教育学校、高等教育学校专任教师分年龄情况
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj4354Fszzb jj4354Fszzb) {
        return jj4354FszzbService.save(jj4354Fszzb);
    }

    /**
     * 根据主键删除职业教育学校、高等教育学校专任教师分年龄情况。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj4354FszzbService.removeById(id);
    }

    /**
     * 根据主键更新职业教育学校、高等教育学校专任教师分年龄情况。
     *
     * @param jj4354Fszzb 职业教育学校、高等教育学校专任教师分年龄情况
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj4354Fszzb jj4354Fszzb) {
        return jj4354FszzbService.updateById(jj4354Fszzb);
    }

    /**
     * 查询所有职业教育学校、高等教育学校专任教师分年龄情况。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj4354Fszzb> list() {
        return jj4354FszzbService.list();
    }

    /**
     * 根据职业教育学校、高等教育学校专任教师分年龄情况主键获取详细信息。
     *
     * @param id 职业教育学校、高等教育学校专任教师分年龄情况主键
     * @return 职业教育学校、高等教育学校专任教师分年龄情况详情
     */
    @GetMapping("getInfo/{id}")
    public Jj4354Fszzb getInfo(@PathVariable Integer id) {
        return jj4354FszzbService.getById(id);
    }

    /**
     * 分页查询职业教育学校、高等教育学校专任教师分年龄情况。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj4354Fszzb> page(Page<Jj4354Fszzb> page) {
        return jj4354FszzbService.page(page);
    }

}
