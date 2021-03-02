package day01.src.com.duotai.java;

public class Test1 {
    public static void main(String[] args) {

    }
}

class Income {
    protected double income;

    public double getTax() {
        return income * 0.1; //税率10%
    }
}

class Salary extends Income {
    @Override
    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}

class StateCouncilSpecialAllowance extends Income {
    @Override
    public double getTax() {
        return 0;
    }
}

