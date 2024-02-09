package com.iuuui.generator;


import com.iuuui.generator.core.GeneratorConfig;
import com.iuuui.generator.core.GeneratorInfo;

/**
 * @author iuuui
 * @since 2023/02/17 1020
 */
public class GeneratorUtil {

    public static void main(String[] args) {
        GeneratorInfo info = new GeneratorInfo();
        info.setTablePre("iuuui_");
        info.setDataUrl("jdbc:mysql://localhost:3306/iuuui_mysql_backup?useunicode=true&characterEncoding=utf-8&allowMultiQueries=true&zeroDateTimeBehavior=convertToNull");
        info.setUserName("root");
        info.setPassword("root");

        String path = "D:\\code\\Java\\iuuui-project\\iuuui-mysql-backup";

        String model = "sys";

        // 包之前的路径
        info.setXmlPath(String.format("\\%s\\src\\main\\resources\\mapper\\%s", path, model));
        info.setDaoPath(String.format("\\%s\\src\\main\\java", path));
        info.setModelPath(String.format("\\%s\\src\\main\\java", path));
        info.setServicePath(String.format("\\%s\\src\\main\\java", path));
        info.setServiceImplPath(String.format("\\%s\\src\\main\\java", path));

        // 是否启用生成
        info.setXmlEnable(true);
        info.setDaoEnable(true);
        info.setModelEnable(true);
        info.setServiceEnable(true);
        info.setServiceImplEnable(true);

        String packagePath = "com.iuuui";

        // 所属包
        info.setDaoPackage(packagePath + ".dao." + model);
        info.setModelPackage(packagePath + ".domain." + model);
        info.setServicePackage(packagePath + ".service." + model);
        info.setServiceImplPackage(packagePath + ".service." + model + ".impl");

        info.setAuthor("iuuui");
        info.setTable("iuuui_mysql_dump_params");


        GeneratorConfig.execute(info);
    }

}
