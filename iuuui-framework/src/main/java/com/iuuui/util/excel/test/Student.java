package com.iuuui.util.excel.test;

/**
 * @author iuuui
 * @time 2024/01/04 0020
 */
public class Student {

    private String name;

    private String number;

    private Integer age;

    private String describe;


    public Student(String name, String number, Integer age, String describe) {
        this.name = name;
        this.number = number;
        this.age = age;
        this.describe = describe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
