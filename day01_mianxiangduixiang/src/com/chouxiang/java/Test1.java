package day01_mianxiangduixiang.src.com.chouxiang.java;

public class Test1 {
    public static void main(String[] args) {
        //向下转型
        Person p = new Student();
        Person t = new Teacher();
        p.run();
        t.run();
    }
}

/**
 * 抽象方法不能被实例化
 */
abstract class Person {
    public abstract void run();
}

class Student extends Person {
    @Override
    public void run() {
        System.out.println("你好你好! Student.run");
    }
}
class Teacher extends Person {
    @Override
    public void run() {
        System.out.println("hello world! Teacher.run");
    }
}
