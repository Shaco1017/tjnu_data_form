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
import shaco.tjnu_data_form.entity.Jj4064Dx;
import shaco.tjnu_data_form.service.Jj4064DxService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 心理咨询工作人员（心理健康教育教师）情况 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj4064Dx")
public class Jj4064DxController {

    @Autowired
    private Jj4064DxService jj4064DxService;

    /**
     * 添加心理咨询工作人员（心理健康教育教师）情况。
     *
     * @param jj4064Dx 心理咨询工作人员（心理健康教育教师）情况
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj4064Dx jj4064Dx) {
        return jj4064DxService.save(jj4064Dx);
    }

    /**
     * 根据主键删除心理咨询工作人员（心理健康教育教师）情况。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj4064DxService.removeById(id);
    }

    /**
     * 根据主键更新心理咨询工作人员（心理健康教育教师）情况。
     *
     * @param jj4064Dx 心理咨询工作人员（心理健康教育教师）情况
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj4064Dx jj4064Dx) {
        return jj4064DxService.updateById(jj4064Dx);
    }

    /**
     * 查询所有心理咨询工作人员（心理健康教育教师）情况。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj4064Dx> list() {
        return jj4064DxService.list();
    }

    /**
     * 根据心理咨询工作人员（心理健康教育教师）情况主键获取详细信息。
     *
     * @param id 心理咨询工作人员（心理健康教育教师）情况主键
     * @return 心理咨询工作人员（心理健康教育教师）情况详情
     */
    @GetMapping("getInfo/{id}")
    public Jj4064Dx getInfo(@PathVariable Integer id) {
        return jj4064DxService.getById(id);
    }

    /**
     * 分页查询心理咨询工作人员（心理健康教育教师）情况。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj4064Dx> page(Page<Jj4064Dx> page) {
        return jj4064DxService.page(page);
    }

}
