package com.study.java;

public class Test4 {
    public static void main(String[] args) {
        Group g=new Group();
        g.setNames("小红","小明","老王");

    }
}

class Group {
    private String[] name;

    public void setNames(String... name) {
        this.name = name;
    }

}
