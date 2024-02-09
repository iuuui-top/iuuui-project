package com.iuuui.util.excel.test;

import com.iuuui.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author iuuui
 * @time 2024/01/04 0018
 */
public class Test {

    public static void main(String[] args) {
        List<Student> students = listStudent();

    }

    private static List<Student> listStudent() {
        ArrayList students = CollectionUtils.newList();
        students.add(new Student("小明", "S001", 15, "小明是一个学习认真的人"));
        students.add(new Student("小红", "S002", 14, "小红是一个责任感很强的人"));
        students.add(new Student("小刚", "S003", 15, "小刚是一个意志力坚韧的人"));
        return students;
    }

}
