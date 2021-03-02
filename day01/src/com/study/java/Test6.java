package com.study.java;

public class Test6 {
    public static void main(String[] args) {
        Person6 a = new Person6("zdw", 18);
        Person6 p2 = new Person6();
        System.out.println(a.getName());
        System.out.println(a.getAge());

    }
}

class Person6 {
    private String name;
    private int age;

    public Person6(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Person6() {

    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
