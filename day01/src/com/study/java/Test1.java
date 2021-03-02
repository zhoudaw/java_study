package com.study.java;

public class Test1 {
    public static void main(String[] args) {
        Person zhou = new Person();
        zhou.name = "周达旺";
        zhou.age = 30;
        System.out.println(zhou.name);
        System.out.println(zhou.age);
        Person zhou1 =new Person();
        zhou1.age =18;
        System.out.println(zhou1.age);

    }
}

class Person {
    public String name;
    public int age;
}

class Book {
    public String name;
    public String author;
    public String isbn;
    public double price;
}
