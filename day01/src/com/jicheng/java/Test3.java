package com.jicheng.java;

public class Test3 {
    public static void main(String[] args) {
        Person3 p = new Person3("小明", 12);
        Student3 s = new Student3("小红", 20, 99);
        // TODO: 定义PrimaryStudent，从Student继承，新增grade字段:
        Student3 ps = new PrimaryStudent("小军", 9, 100, 5);
        System.out.println(ps.getScore());
    }
}

class Person3 {
    protected String name;
    protected int age;

    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student3 extends Person3 {
    protected int score;

    public Student3(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}

class PrimaryStudent extends Student3 {
    private int grade;
    public PrimaryStudent(String name, int age, int score,int grade) {
        super(name, age, score);
        this.grade=grade;
    }

    public int getGrade() {
        return grade;
    }
}
