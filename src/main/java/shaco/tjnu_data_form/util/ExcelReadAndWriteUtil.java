package shaco.tjnu_data_form.util;

import cn.hutool.core.lang.Console;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.sax.handler.RowHandler;

import java.util.List;
import java.util.Map;

public class ExcelReadAndWriteUtil {
    //    读取Excel中所有行和列，用二维列表表示
    public void excelToList() {
        ExcelReader reader = ExcelUtil.getReader("d:/aaa.xlsx");
        List<List<Object>> readAll = reader.read();
    }

    //    读取为Map列表，默认第一行为标题行，数据从第二行开始，一个Map表示一行，Map中的key为标题，value为标题对应的单元格值。
    public void excelToMap() {
        ExcelReader reader = ExcelUtil.getReader("d:/aaa.xlsx");
        List<Map<String, Object>> readAll = reader.readAll();
    }

    //    读取为Bean列表，Bean中的字段名为标题，字段值为标题对应的单元格值。
    public void excelToClass() {
        ExcelReader reader = ExcelUtil.getReader("d:/aaa.xlsx");
//        List<Person> all = reader.readAll(Person.class);
    }


    private static RowHandler createRowHandler() {
        return new RowHandler() {
            @Override
            public void handle(int sheetIndex, long rowIndex, List<Object> rowlist) {
                Console.log("[{}] [{}] {}", sheetIndex, rowIndex, rowlist);
            }
        };
    }

    public static void main(String[] args) {
        ExcelUtil.readBySax("aaa.xlsx", 0,

                createRowHandler());
    }


}
