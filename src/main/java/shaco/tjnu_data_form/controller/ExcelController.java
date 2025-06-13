package shaco.tjnu_data_form.controller;

import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import shaco.tjnu_data_form.common.Result;

import java.io.IOException;

import java.util.List;

@RestController
@RequestMapping("excel")
public class ExcelController {

    @PostMapping("/upload")
    public Result uploadExcel(@RequestBody MultipartFile file) throws IOException {
        ExcelReader reader = ExcelUtil.getReader(file.getInputStream());
        List<List<Object>> readAll = reader.read();
        System.out.println(readAll);
        return Result.success();
    }

    @GetMapping("/download")
    public Result downloadExcel(@RequestParam("file") MultipartFile file) throws IOException {
        return Result.success();
    }
}
