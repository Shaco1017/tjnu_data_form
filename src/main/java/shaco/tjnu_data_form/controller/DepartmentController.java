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
import shaco.tjnu_data_form.entity.Department;
import shaco.tjnu_data_form.service.DepartmentService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 部门表 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    /**
     * 添加部门表。
     *
     * @param department 部门表
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Department department) {
        return departmentService.save(department);
    }

    /**
     * 根据主键删除部门表。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return departmentService.removeById(id);
    }

    /**
     * 根据主键更新部门表。
     *
     * @param department 部门表
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Department department) {
        return departmentService.updateById(department);
    }

    /**
     * 查询所有部门表。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Department> list() {
        return departmentService.list();
    }

    /**
     * 根据部门表主键获取详细信息。
     *
     * @param id 部门表主键
     * @return 部门表详情
     */
    @GetMapping("getInfo/{id}")
    public Department getInfo(@PathVariable Integer id) {
        return departmentService.getById(id);
    }

    /**
     * 分页查询部门表。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Department> page(Page<Department> page) {
        return departmentService.page(page);
    }

}
