package com.stringbuilder.java;

public class StringBuilderTest {
    public static void main(String[] args) {
//       StringBuilder sb = new StringBuilder(1024);
//       for(int i=0;i<1000;i++){
//           sb.append(",");
//           sb.append(i);
//       }
//        System.out.println(sb.toString());


        StringBuilder sun = new StringBuilder(1024);
        sun.append("mr,")
                .append("hellow")
                .append("!")
                .insert(0, "周达旺,");
        System.out.println(sun);
    }
}

