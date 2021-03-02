package com.study.java;

public class Test2 {
    public static void main(String[] args) {
        City bj = new City();
        bj.name = "Beijing";
        bj.latitude = 39.903;
        bj.longitude = 116.401;
        System.out.println(bj.name);
        System.out.println("location: " + bj.latitude + ", " + bj.longitude);
        Person1 p = new Person1();
        p.setAge(18);
        p.setName("周达旺");
        System.out.println(p.getName()+":今年"+p.getAge()+"岁咯！");
    }
}

class City {
    public String name;
    public double latitude;
    public double longitude;
}

class Person1 {
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }

}
