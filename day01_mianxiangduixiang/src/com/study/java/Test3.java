package com.study.java;

public class Test3 {
    public static void main(String[] args) {
        Person3 p = new Person3();
        p.setBitth(2000);
        System.out.println(p.getAge());

//        p.setNameAndAge()
    }

}

class Person3 {
    private String name;
    private int bitth;

    public void setBitth(int bitth) {
        this.bitth = bitth;
    }

    public int getAge() {
        return calcAge(30000); //调用private 方法
    }

    private int calcAge(int currentYear) {
        return currentYear - this.bitth;
    }

    public  void setNameAndAge(String name,int age){

    }

}
