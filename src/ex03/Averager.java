package ex03;

import java.util.Scanner;

// 점수 평균 구하기
public class Averager {
    public static void main(String[] args) {
        int total = 0, count = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("점수를 입력하시오: ");
            int grade = sc.nextInt();
            if (grade < 0) {
                break;
            }
            total = total + grade;
            count++;
        }
        System.out.println("평균: " + total / count);
    }
}
