package com.stringjoiner.java;

import java.util.StringJoiner;

public class Test2 {
    public static void main(String[] args) {
        String[] fields = {"name", "position", "salary"};
        String table = "employee";
        String select = buildSelectSql(table, fields);
        System.out.println(select);
        System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "测试成功" : "测试失败");
    }

    static String buildSelectSql(String table, String[] fields) {
        StringJoiner sb = new StringJoiner(", ", "SELECT ", " FROM ");
        for (String name : fields) {
            sb.add(name);
        }
        return sb.toString() + table;
    }
}
