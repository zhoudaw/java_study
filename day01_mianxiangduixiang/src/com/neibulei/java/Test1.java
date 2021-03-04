package day01_mianxiangduixiang.src.com.neibulei.java;

public class Test1 {
    public static void main(String[] args) {
        Outer o = new Outer("周达旺"); //  实例化一个Outer
        Outer.Inner I =o.new Inner(); //实例化一个Inner
        I.hello();
    }
}

class Outer {
    private String name;

    public Outer(String name) {
        this.name = name;
    }

    class Inner {
        void hello() {
            System.out.println("Hello, " +Outer.this.name);
        }
    }
}