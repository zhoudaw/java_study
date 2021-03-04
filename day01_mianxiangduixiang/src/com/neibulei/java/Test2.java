package day01_mianxiangduixiang.src.com.neibulei.java;

public class Test2 {
    public static void main(String[] args) {
        Person.sun s  =new Person.sun();
        s.hello();
    }
}
class Person{
    private static String NAME ="ZHOUDAWANG";
    private  String name;
    Person(String name){
        this.name =name;
    }
    static class sun{
        void hello(){
            System.out.println("hello"+Person.NAME);
        }
    }
}

