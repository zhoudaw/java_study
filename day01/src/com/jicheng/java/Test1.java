package com.jicheng.java;

public class Test1 {
    Student s = new Student("xiaoming", 12, 23);
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    private int score;

    public Student(String name, int age, int score) {
        super(name, age);  // 调用父类的构造方法Person(String, int)
        this.score = score;
    }
}
