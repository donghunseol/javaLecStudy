package ex03.programming;

import java.util.Scanner;

/**
 * 처음에는 연산자
 * 두번째는 두 수를 입력하여
 * 두 수를 연산자에 맞게 계산한 값을 출력하라
 * 계산기!
 */
public class programming02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. 연산자와 숫자를 입력 받자
        System.out.print("연산을 입력하세요: ");
        char operator = sc.next().charAt(0);
        System.out.print("피연산자 2개를 입력하세요: ");
        double n1 = sc.nextDouble(), n2 = sc.nextDouble();
        // System.out.println(operator + " " + n1 + " " + n2);

        // 2. 입력받은 연산자와 숫자의 계산 결과를 입력!
        System.out.print(n1 + "" + operator + "" + n2 + " = ");
        if (operator == '*') {
            System.out.print(n1 * n2);
        } else if (operator == '+') {
            System.out.print(n1 + n2);
        } else if (operator == '-') {
            System.out.print(n1 - n2);
        } else {
            System.out.print(n1 / n2);
        }
    }
}
