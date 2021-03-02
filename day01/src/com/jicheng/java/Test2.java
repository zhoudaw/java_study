package com.jicheng.java;

public class Test2 {
    public static void main(String[] args) {
        Person1 p = new Student1();
//        Person1 p1 = new Person1();
//        Person1 s1 = (Person1) p;
        if (p instanceof Person1) {
            Student1 s = (Student1) p;
        }

        Object obj = "hello";
        if (obj instanceof String ) {
            String s = (String) obj;
            System.out.println(s.toUpperCase());
        }
//        System.out.println(p instanceof Person1);
//        System.out.println(p instanceof Person1);
    }
}

class Person1 {
}

class Student1 extends Person1 {
}
