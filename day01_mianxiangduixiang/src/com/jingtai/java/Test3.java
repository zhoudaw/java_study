package day01_mianxiangduixiang.src.com.jingtai.java;

public class Test3 {
    public static void main(String[] args) {
        Person3 p = new Person3("周达旺");
        System.out.println("实例创建个数："+Person3.getCount());
        Person3 p1 = new Person3("周旋");
        System.out.println("实例创建个数："+Person3.getCount());
        Person3 p2 = new Person3("林文星");
        System.out.println("实例创建个数："+Person3.getCount());
    }
}

class Person3 {
    public String name;
    public static int count;
    public Person3(String name) {
        this.name = name;
        count++;
    }
    public static int getCount() {
        return  count;
    }
}
