package day01_mianxiangduixiang.src.com.jingtai.java;

public class Test2 {
    public static void main(String[] args) {
        Person1.setNumber(18);
        System.out.println(Person1.number);
    }
}

class Person1 {
    public static int number;

    public static void setNumber(int value) {
        number = value;
    }
}

