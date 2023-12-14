package ex03;

import java.util.Scanner;

// 팩토리얼 계산하기
public class Factorial {
    public static void main(String[] args) {
        long fact = 1; // 팩토리얼은 길이가 길어질수 있기에 long으로 선언하고 1로 초기화하는 이유는 모든 값을 곱하여야 하기때문에 0을 하면 무조건 값이 0이 되기 때문이다.
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.print(n + "!은 " + fact + "입니다.");
    }
}
