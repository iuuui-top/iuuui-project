package com.iuuui.util.excel.inter;

/**
 * @author iuuui
 * @time 2024/01/04 0007
 * 数据处理适配器
 */
public interface DataHandlerAdapter {

    /**
     * 数据处理方法
     * @param value 字段值
     */
    String handler(String value);

}
