package com.stringbuilder.java;

public class Test1 {
    public static void main(String[] args) {
        Adder adder = new Adder();
        adder.add(3).add(5).inc().add(20);
        System.out.println(adder.value());
    }
}

class Adder {
    private int sun = 0;

    public Adder add(int n) {
        sun += n;
        return this;
    }

    public Adder inc() {
        sun++;
        return this;
    }

    public int value() {
        return sun;
    }

}
