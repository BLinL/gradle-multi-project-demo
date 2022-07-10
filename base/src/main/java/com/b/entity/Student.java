package com.b.entity;

import org.apache.commons.lang3.StringUtils;

public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        System.out.println(StringUtils.indexOf("aaa", 'a'));
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
