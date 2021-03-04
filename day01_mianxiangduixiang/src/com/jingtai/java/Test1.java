package day01_mianxiangduixiang.src.com.jingtai.java;

/**
 * 静态字段和静态方法 static
 */
public class Test1 {
    public static void main(String[] args) {
        Person.number =200;
        Person p = new Person("周达旺", 18);
        Person p1 = new Person("林文星", 18);
        p.number = 88;
        System.out.println(p1.number);
        p1.number = 880;
        System.out.println(p.number);


    }
}

class Person {
    public String name;
    public int age;
    public static int number;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
