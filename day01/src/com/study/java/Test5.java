package com.study.java;

public class Test5 {
    public static void main(String[] args) {
        Person5 p = new Person5();
        p.setName("周达旺");
        p.setAge(12);
        System.out.println(p.getAge());
    }

}

class Person5 {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}