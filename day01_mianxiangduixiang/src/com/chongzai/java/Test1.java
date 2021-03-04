package com.chongzai.java;

public class Test1 {
    public static void main(String[] args) {
        Person p2 = new Person();
        Person p3 = new Person();
        p2.setName("zdw");
        p3.setName("zdw1", "zdw2");
        System.out.println(p2.getName());
        System.out.println(p3.getName());
    }


}

class Person {
    private String name;
    private String name1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(String name1, String name) {
        this.setName(name1 + ":" + name);
    }
}
