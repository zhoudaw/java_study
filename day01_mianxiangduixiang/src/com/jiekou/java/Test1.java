package day01_mianxiangduixiang.src.com.jiekou.java;

/**
 * interface 接口
 */
public class Test1 {
    public static void main(String[] args) {
        Person s = new Student("周达旺");
        System.out.println(s.getName());
    }
}

//abstract class Person {
//    public abstract void run();
//    public abstract String getName();
//}
interface Hello {
    public abstract void hell();

//    void hell(Sting name);
}

interface Person extends Hello {
    public abstract void run();

    public abstract String getName();
}

class Student implements Person {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name + "run");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void hell() {

    }

//    @Override
//    public void hell(Sting name) {

//    }
}