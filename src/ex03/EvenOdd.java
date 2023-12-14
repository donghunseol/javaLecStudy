package ex03;

import java.util.Scanner;

// 짝수인지 홀수인지 말해주는 프로그램
public class EvenOdd {
    public static void main(String[] args) {
        int number;

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오: ");

        number = sc.nextInt();

        // 2로 나머지가 0이 되면 짝수고 아닌 경우 홀수 이기에 조건식을 저렇게 추가
        if (number % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

    }
}
