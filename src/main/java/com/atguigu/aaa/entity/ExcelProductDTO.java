package com.atguigu.aaa.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import com.atguigu.aaa.zhujie.ExcelSelected;
import lombok.Data;

/**
 * @author dcj
 * @Desc
 * @Date 2022/10/26 23:21
 */

@Data
@ColumnWidth(22)
@HeadRowHeight(30)
public class ExcelProductDTO {


    //动态下拉框，可以查询数据库数据显示在下拉框中
   // @ExcelSelected(sourceClass = MyExcelSelected.class)
    @ExcelProperty(value = "生产厂家编号")
    private String producerCode;

    @ExcelSelected(source = {"高值","低值"})
    @ExcelProperty(value = "库存价值类型")
    private String stockValType;

    @ExcelSelected(source = {"耗材","普通设备","医疗设备"})
    @ExcelProperty(value = "库存类型")
    private String stockType;


    @ExcelSelected(source = {"有","无"})
    @ExcelProperty(value = "是否有明细")
    private Integer hasDetail;

    @ExcelSelected(source = {"药械","资产","设备"})
    @ExcelProperty(value = "业务类型")
    private String ywType;


    @ExcelSelected(source = {"虚库","实库"})
    @ExcelProperty(value = "是否虚库")
    private String isVirtual;

    @ExcelSelected(source = {"是","否"})
    @ExcelProperty(value = "是否进口")
    private String isImport;
}
