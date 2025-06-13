package shaco.tjnu_data_form.controller;

import com.mybatisflex.core.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shaco.tjnu_data_form.common.UserDTO;
import shaco.tjnu_data_form.util.JwtUtil;
import shaco.tjnu_data_form.common.Result;
import shaco.tjnu_data_form.mapper.FormStructureMapper;

@CrossOrigin
@RestController
@RequestMapping("/form_list")
public class FormListController {
    @Autowired
    private FormStructureMapper formStructureMapper;

    /**
     * 查询该用户有权限编辑的所有报表。
     *
     * @param userToken 用户token
     * @return List<FormStructure>
     */
    @GetMapping("getFormList")
    public Result getFormList(@RequestHeader("token") String userToken, @RequestParam("formType") String formType) {
        UserDTO user = JwtUtil.verifyAndGetUser(userToken);
        QueryWrapper queryWrapper = new QueryWrapper();
        assert user != null;
        if (!formType.isEmpty()) {
            queryWrapper.select("form_id,form_name").from("form_structure").where("form_permissions=?", user.getDepartmentId()).and("form_type=?", formType);
        } else {
            queryWrapper.select("form_id,form_name").from("form_structure").where("form_permissions=?", user.getDepartmentId());
        }
        return Result.success(formStructureMapper.selectListByQuery(queryWrapper));
    }

}
