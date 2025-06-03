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
import shaco.tjnu_data_form.entity.Jj4366Dx;
import shaco.tjnu_data_form.service.Jj4366DxService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 专职辅导员分年龄、专业技术职务、学历情况 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj4366Dx")
public class Jj4366DxController {

    @Autowired
    private Jj4366DxService jj4366DxService;

    /**
     * 添加专职辅导员分年龄、专业技术职务、学历情况。
     *
     * @param jj4366Dx 专职辅导员分年龄、专业技术职务、学历情况
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj4366Dx jj4366Dx) {
        return jj4366DxService.save(jj4366Dx);
    }

    /**
     * 根据主键删除专职辅导员分年龄、专业技术职务、学历情况。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj4366DxService.removeById(id);
    }

    /**
     * 根据主键更新专职辅导员分年龄、专业技术职务、学历情况。
     *
     * @param jj4366Dx 专职辅导员分年龄、专业技术职务、学历情况
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj4366Dx jj4366Dx) {
        return jj4366DxService.updateById(jj4366Dx);
    }

    /**
     * 查询所有专职辅导员分年龄、专业技术职务、学历情况。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj4366Dx> list() {
        return jj4366DxService.list();
    }

    /**
     * 根据专职辅导员分年龄、专业技术职务、学历情况主键获取详细信息。
     *
     * @param id 专职辅导员分年龄、专业技术职务、学历情况主键
     * @return 专职辅导员分年龄、专业技术职务、学历情况详情
     */
    @GetMapping("getInfo/{id}")
    public Jj4366Dx getInfo(@PathVariable Integer id) {
        return jj4366DxService.getById(id);
    }

    /**
     * 分页查询专职辅导员分年龄、专业技术职务、学历情况。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj4366Dx> page(Page<Jj4366Dx> page) {
        return jj4366DxService.page(page);
    }

}
