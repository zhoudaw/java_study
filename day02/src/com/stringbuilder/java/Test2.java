package com.stringbuilder.java;

public class Test2 {
    public static void main(String[] args) {
        String[] fields = {"name", "position", "salary"};
        String table = "employee";
        String insert = buildInsertSql(table, fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s.equals(insert) ? "测试成功" : "测试失败");
    }

    static String buildInsertSql(String table, String[] fields) {
        StringBuilder sb = new StringBuilder(1024);
        sb.append("INSERT INTO ")
                .append(table)
                .append(" (")
                .append(String.join(", ",fields))
//                .append(String.join(", ",fields))
                .append(") ")
                .append("VALUES (?, ?, ?)");
        return sb.toString();
    }

}
