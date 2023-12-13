package ex02;

import java.util.Scanner;
// 직접 만든 섭씨-화씨 온도 변환 문제
public class FtoC {
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("1. 화씨->섭씨");
        System.out.println("2. 섭씨->화씨");
        System.out.println("=====================================");
        System.out.println();
        double f_temp; // 화씨 계산
        double c_temp; // 섭씨 계산
        double temp;
        int num;
        Scanner sc = new Scanner(System.in);
        // 변환할 온도 선택 (화씨, 섭씨 중 선택)
        System.out.print("번호를 입력하시오: ");
        num = sc.nextInt();

        System.out.print((num == 1)?"화씨(미국 F)온도를 입력하시오: " : "섭씨(국제 C)온도를 입력하시오: ");
        temp = sc.nextDouble();
        c_temp = 5.0 / 9.0 * (temp - 32);
        f_temp = 9.0 / 5.0 * temp + 32;
        System.out.print((num == 1)?"섭씨(국제 C)온도는 " + c_temp : "화씨(미국 F)온도는 " + f_temp);
    }
}
