package com.iuuui.util.excel.annotation;

import com.iuuui.util.excel.inter.DataHandlerAdapter;

/**
 * @author iuuui
 * @time 2024/01/03 2346
 */
public @interface ExcelExport {

    /**
     * 列名称
     */
    String value() default "";

    /**
     * 分隔符（多个值时使用）
     */
    String delimiter() default "";

    /**
     * 前缀
     */
    String prefix() default "";

    /**
     * 后缀
     */
    String suffix() default "";

    /**
     * 当值为空时，字段默认值
     */
    String defaultValue() default "";

    /**
     * 字典转换
     */
    String dictType() default "";

    /**
     * 读取内容转换表达式 （如：0=男,1=女,2=保密）
     */
    String readConverterExp() default "";

    /**
     * 日期格式化，如：yyyy-MM-dd
     * 注意：字段为 Date 类型才生效
     */
    String dateFormat() default "";

    /**
     * 导出数据自定义处理器处理
     */
    Class<? extends DataHandlerAdapter> handler();

}
