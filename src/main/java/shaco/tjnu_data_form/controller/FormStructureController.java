package shaco.tjnu_data_form.controller;

import com.mybatisflex.core.paginate.Page;
import com.mybatisflex.core.query.QueryWrapper;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import shaco.tjnu_data_form.entity.FormStructure;
import shaco.tjnu_data_form.service.FormStructureService;

import java.util.List;

import static shaco.tjnu_data_form.Util.ChineseToPinyinInitials.getPinyinInitial;

/**
 * 报表结构表 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/formStructure")
public class FormStructureController {

    @Autowired
    private FormStructureService formStructureService;

    /**
     * 添加报表结构表。
     *
     * @param formStructure 报表结构表
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody FormStructure formStructure) {
        return formStructureService.save(formStructure);
    }

    /**
     * 根据主键删除报表结构表。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return formStructureService.removeById(id);
    }

    /**
     * 根据主键更新报表结构表。
     *
     * @param formStructure 报表结构表
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody FormStructure formStructure) {
        return formStructureService.updateById(formStructure);
    }

    /**
     * 查询所有报表结构表。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<FormStructure> list() {
        return formStructureService.list();
    }

    /**
     * 根据报表结构表主键获取详细信息。
     *
     * @param id 报表结构表主键
     * @return 报表结构表详情
     */
    @GetMapping("getInfo/{id}")
    public FormStructure getInfo(@PathVariable Integer id) {
        return formStructureService.getById(id);
    }

    /**
     * 分页查询报表结构表。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<FormStructure> page(Page<FormStructure> page) {
        return formStructureService.page(page);
    }

    @GetMapping("getFormStructure")
    public FormStructure getFormStructure(@RequestParam("formId") String formId) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.select().from("form_structure").where("form_id=?", formId);
        return formStructureService.getMapper().selectOneByQuery(wrapper);
    }

}
