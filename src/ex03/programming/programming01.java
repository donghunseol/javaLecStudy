package ex03.programming;

import java.util.Scanner;

/**
 * 입력한 정수를 영어로 출력하는 프로그램을 만들기 ( 조건문 활용 )
 * 1 부터 9 사이가 아니면 "OTHER"를 출력
 */
public class programming01 {
    public static void main(String[] args) {
        // 1. 숫자를 입력 받도록 만든다.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //System.out.println(num);
        // 2. 숫자를 입력시 영어가 출력되도록 만드시오.
        String[] eNum = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};

        for (int i = 0; i < 9; i++) {
            if (num == (i + 1)) {
                System.out.println(eNum[i]);
            }
        }
        if (num >= 10 || num <= 0)
            System.out.println("OTHER");

        // 모듈화 전 과정
//        if(num == 1){
//            System.out.println(eNum[0]);
//        }
//
//        if(num == 2){
//            System.out.println(eNum[1]);
//        }
    }
}
