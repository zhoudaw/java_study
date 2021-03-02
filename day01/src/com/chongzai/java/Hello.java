package com.chongzai.java;

public class Hello {
}

/***
 * 方法名相同产，参数不同的称为方法重载
 *
 */
class Test {
    public void hello() {
        System.out.println("hello,world");
    }

    public void hello(String name) {
        System.out.println("Hell," + name);
    }

    public void hello(String name, int age) {
        if (age < 18) {
            System.out.println("h1," + name);
        } else {
            System.out.println("h2" + name);
        }
    }
}
