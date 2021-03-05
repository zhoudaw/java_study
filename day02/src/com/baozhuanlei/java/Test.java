package com.baozhuanlei.java;

/**
 * 基本类型：byte，short，int，long，boolean，float，double，char
 * 引用类型：所有class和interface类型
 */
public class Test {
    public static void main(String[] args) {
        Integer n = null;
        Integer n2 = new Integer(99);
        int n3 = n2.intValue();
        System.out.println(n3);
    }
}

class Integer {
    private int value;

    public Integer(int value) {
        this.value = value;
    }

    public int intValue() {
        return this.value;
    }
}
