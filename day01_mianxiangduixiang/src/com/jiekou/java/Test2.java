package day01_mianxiangduixiang.src.com.jiekou.java;

public class Test2 {
    public static void main(String[] args) {
        Person1 p = new Student1("周达旺");
        p.run();
        Student1 s = new Student1("林文星");
        System.out.println(s.getName());
    }
}

interface Person1 {
    public abstract String getName();

        default  void run() {
        System.out.println(getName() + "run");
    }
}

class Student1 implements Person1 {
    private String name;

    public Student1(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

}
