package ex04;

import java.util.Scanner;

// App 이 붙은 친구만 main 을 주자! 약속해!
public class CalculatorApp {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        double result;

        result = cal.add(50, 80);
        System.out.println("add : " + result);

        result = cal.minus(50, 80);
        System.out.println("minus : " + result);

        result = cal.divide(50, 80);
        System.out.println("divide : " + result);

        result = cal.multi(50, 80);
        System.out.println("multi : " + result);
    }
}
