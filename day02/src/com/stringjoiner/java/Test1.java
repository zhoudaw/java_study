package com.stringjoiner.java;

import java.util.StringJoiner;

public class Test1 {
    public static void main(String[] args) {
//        String[] name = {"zdw", "lwx", "zx", "zfh", "wxa", "ldt", "cyl", "zdx"};
//        StringBuilder sb = new StringBuilder();
//        sb.append("hello,");
//        for(String names:name){
//            sb.append(names).append(",");
//        }
//        System.out.println(sb);
//        String[] names = {"zdw", "lwx", "zx"};
//        StringJoiner sb = new StringJoiner(",","hello ","!");
//        for(String name:names){
//            sb.add(name);
//        }
//        System.out.println(sb);
        String[] name = {"zdw", "lwx", "zx", "zfh", "wxa", "ldt", "cyl", "zdx"};
        String s =String.join(",",name);
        System.out.println(s);
    }
}
