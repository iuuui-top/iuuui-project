package com.iuuui.enums;

/**
 * @author iuuui
 * @time 2024/02/05 1720
 */
public enum MySQLDumpParameterEnum {

    PORT("--port", true, false, "连接数据库端口号(默认：3306)"),
    HOST("--host", true, false, "主机地址(默认：localhost)"),
    USER("--user", true, true, "连接数据库用户名"),
    PASSWORD("--password", true, true, "连接数据库密码"),

    ADD_DROP_DATABASE("--add-drop-database", false, false,"数据库创建之前添加drop数据库语句(默认不添加)"),
    SKIP_ADD_DROP_TABLE("--skip-add-drop-table", false, false,"*取消 数据库表创建之前添加drop数据表语句(默认添加)"),
    SKIP_ADD_LOCKS("--skip-add-locks", false, false, "*取消 在每个表导出之前增加LOCK TABLES并且之后UNLOCK TABLE"),
    DEFAULT_CHARACTER_SET("--default-character-set", true, false, "指定导出数据字符集，如：utf8mb4"),
    IGNORE_TABLE("--ignore-table", true, true, "忽略导出的表(多个逗号分隔)"),
    NO_CREATE_DB("--no-create-db", false, false, "不导出创建数据库的语句 “CREATE DATABASE”"),
    NO_CREATE_INFO("--no-create-info", false, false, "不导出创建数据表的语句 “CREATE TABLE”"),
    NO_DATA("--no-data", false, false, "只导出数据库表结构"),
    ;

    /**
     * 参数指令
     */
    private String command; // 参数指令

    /**
     * 指令后面是否有参数
     */
    private boolean hasParameters;

    /**
     * 指令后面的参数是否必填
     */
    private boolean hasRequired;

    /**
     * 参数说明
     */
    private String directions;


    MySQLDumpParameterEnum(String command, boolean hasParameters, boolean hasRequired, String directions) {
        this.command = command;
        this.hasParameters = hasParameters;
        this.hasRequired = hasRequired;
        this.directions = directions;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public boolean isHasParameters() {
        return hasParameters;
    }

    public void setHasParameters(boolean hasParameters) {
        this.hasParameters = hasParameters;
    }

    public boolean isHasRequired() {
        return hasRequired;
    }

    public void setHasRequired(boolean hasRequired) {
        this.hasRequired = hasRequired;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }
}
