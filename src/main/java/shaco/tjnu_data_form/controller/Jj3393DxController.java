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
import shaco.tjnu_data_form.entity.Jj3393Dx;
import shaco.tjnu_data_form.service.Jj3393DxService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 中外合作办学机构及项目基本情况 控制层。
 *
 * @author shaco
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jj3393Dx")
public class Jj3393DxController {

    @Autowired
    private Jj3393DxService jj3393DxService;

    /**
     * 添加中外合作办学机构及项目基本情况。
     *
     * @param jj3393Dx 中外合作办学机构及项目基本情况
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Jj3393Dx jj3393Dx) {
        return jj3393DxService.save(jj3393Dx);
    }

    /**
     * 根据主键删除中外合作办学机构及项目基本情况。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return jj3393DxService.removeById(id);
    }

    /**
     * 根据主键更新中外合作办学机构及项目基本情况。
     *
     * @param jj3393Dx 中外合作办学机构及项目基本情况
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Jj3393Dx jj3393Dx) {
        return jj3393DxService.updateById(jj3393Dx);
    }

    /**
     * 查询所有中外合作办学机构及项目基本情况。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Jj3393Dx> list() {
        return jj3393DxService.list();
    }

    /**
     * 根据中外合作办学机构及项目基本情况主键获取详细信息。
     *
     * @param id 中外合作办学机构及项目基本情况主键
     * @return 中外合作办学机构及项目基本情况详情
     */
    @GetMapping("getInfo/{id}")
    public Jj3393Dx getInfo(@PathVariable Integer id) {
        return jj3393DxService.getById(id);
    }

    /**
     * 分页查询中外合作办学机构及项目基本情况。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Jj3393Dx> page(Page<Jj3393Dx> page) {
        return jj3393DxService.page(page);
    }

}
