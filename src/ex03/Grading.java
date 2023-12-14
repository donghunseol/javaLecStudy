package ex03;

import java.util.Scanner;

// 성적별 학점 분별하기
public class Grading {
    public static void main(String[] args) {
        int grade;

        Scanner sc = new Scanner(System.in);
        // 1. 성적을 입력받는다.
        System.out.print("성적을 입력하시오: ");
        grade = sc.nextInt();

        // 2. 입력값을 if문을 활용하여 상황에 맞는 출력문을 보여준다.
        if (grade >= 90) {
            System.out.println("A학점");
        } else if (grade >= 80) {
            System.out.println("B학점");
        } else if (grade >= 70) {
            System.out.println("C학점");
        } else if (grade >= 60) {
            System.out.println("D학점");
        } else {
            System.out.println("F학점");
        }

        // 3. 도전문제 A+과 A0로 나눠보자
        if (grade >= 95) {
            System.out.println("A+학점");
        } else if (grade >= 90) {
            System.out.println("A0학점");
        } else if (grade >= 85) {
            System.out.println("B+학점");
        } else if (grade >= 80) {
            System.out.println("B0학점");
        } else if (grade >= 75) {
            System.out.println("C+학점");
        } else if (grade >= 70) {
            System.out.println("C0학점");
        } else if (grade >= 65) {
            System.out.println("D+학점");
        } else if (grade >= 60) {
            System.out.println("D0학점");
        } else if (grade >= 55) {
            System.out.println("F+학점");
        } else {
            System.out.println("F0학점");
        }
    }
}
