package ex02;

import java.util.Scanner;

// P.83 3번
public class ArithmeticOperation {
    public static void main(String[] args) {
        // 1. 두 개의 정수를 받아보자
        int x = 10;
        int y = 20;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("두 수의 합: " + (x + y));
        System.out.println("두 수의 차: " + (x - y));
        System.out.println("두 수의 곱: " + (x * y));
        System.out.println("두 수의 평균: " + ((x + y) / 2));
        //삼항연산자 활용
        System.out.println((x > y) ? "큰 수: " + x : "큰 수: " + y);
        System.out.println((x < y) ? "작은 수: " + x : "작은 수: " + y);
        //if문 활용
        if (x > y) {
            System.out.println("큰 수: " + x);
            System.out.println("작은 수: " + y);
        } else {
            System.out.println("큰 수: " + y);
            System.out.println("작은 수: " + x);
        }
    }
}
