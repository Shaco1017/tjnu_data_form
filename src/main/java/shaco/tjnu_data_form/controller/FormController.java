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
import shaco.tjnu_data_form.entity.Form;
import shaco.tjnu_data_form.service.FormService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 报表表 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/form")
public class FormController {

    @Autowired
    private FormService formService;

    /**
     * 添加报表表。
     *
     * @param form 报表表
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Form form) {
        return formService.save(form);
    }

    /**
     * 根据主键删除报表表。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return formService.removeById(id);
    }

    /**
     * 根据主键更新报表表。
     *
     * @param form 报表表
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Form form) {
        return formService.updateById(form);
    }

    /**
     * 查询所有报表表。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Form> list() {
        return formService.list();
    }

    /**
     * 根据报表表主键获取详细信息。
     *
     * @param id 报表表主键
     * @return 报表表详情
     */
    @GetMapping("getInfo/{id}")
    public Form getInfo(@PathVariable Integer id) {
        return formService.getById(id);
    }

    /**
     * 分页查询报表表。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Form> page(Page<Form> page) {
        return formService.page(page);
    }

}
