package ex03;

import java.util.Scanner;

// 약수 계산하기
public class Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수를 입력하시오: ");
        int n = sc.nextInt();

        System.out.print(n + "의 약수는 다음과 같습니다.");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(" " + i);
            }
        }
    }
}
