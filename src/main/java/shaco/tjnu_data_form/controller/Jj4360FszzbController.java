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
import shaco.tjnu_data_form.entity.Jj4360Fszzb;
import shaco.tjnu_data_form.service.Jj4360FszzbService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 职业教育学校、高等学校教师分学历（位）情况 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj4360Fszzb")
public class Jj4360FszzbController {

    @Autowired
    private Jj4360FszzbService jj4360FszzbService;

    /**
     * 添加职业教育学校、高等学校教师分学历（位）情况。
     *
     * @param jj4360Fszzb 职业教育学校、高等学校教师分学历（位）情况
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj4360Fszzb jj4360Fszzb) {
        return jj4360FszzbService.save(jj4360Fszzb);
    }

    /**
     * 根据主键删除职业教育学校、高等学校教师分学历（位）情况。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj4360FszzbService.removeById(id);
    }

    /**
     * 根据主键更新职业教育学校、高等学校教师分学历（位）情况。
     *
     * @param jj4360Fszzb 职业教育学校、高等学校教师分学历（位）情况
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj4360Fszzb jj4360Fszzb) {
        return jj4360FszzbService.updateById(jj4360Fszzb);
    }

    /**
     * 查询所有职业教育学校、高等学校教师分学历（位）情况。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj4360Fszzb> list() {
        return jj4360FszzbService.list();
    }

    /**
     * 根据职业教育学校、高等学校教师分学历（位）情况主键获取详细信息。
     *
     * @param id 职业教育学校、高等学校教师分学历（位）情况主键
     * @return 职业教育学校、高等学校教师分学历（位）情况详情
     */
    @GetMapping("getInfo/{id}")
    public Jj4360Fszzb getInfo(@PathVariable Integer id) {
        return jj4360FszzbService.getById(id);
    }

    /**
     * 分页查询职业教育学校、高等学校教师分学历（位）情况。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj4360Fszzb> page(Page<Jj4360Fszzb> page) {
        return jj4360FszzbService.page(page);
    }

}
