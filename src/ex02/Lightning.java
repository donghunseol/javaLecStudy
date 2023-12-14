package ex02;

import java.util.Scanner;

/**
 * 번개로 부터의 거리 계산하기
 * 소리는 공기를 통해 초당 약 340m를 이동
 * 빛은 초당 300,000km를 이동
 * 예시)
 * 시간간격을 입력하시오(단위: 초): 7
 * 번개가 발생한 곳까지의 거리: 2100m
 */

public class Lightning {
    public static void main(String[] args) {
        int distance;
        Scanner sc = new Scanner(System.in);
        System.out.print("시간간격을 입력하시오(단위: 초): ");
        int time = sc.nextInt();
        distance = 300 * time; // 7초가 걸렸을때 2100m 니깐 나누기를 해보면 초당 약 300미터로 두고 계산했다라는 가정이 나온다.
        System.out.print("번개가 발생한 곳까지의 거리: " + distance);
    }
}