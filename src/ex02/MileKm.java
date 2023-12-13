package ex02;

import java.util.Scanner;

public class MileKm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mile, km;

        // 1. 마일을 입력 받아라
        System.out.print("마일을 입력하시오: ");
        mile = sc.nextDouble();
        //System.out.println(mile);

        // 2. 마일을 킬로미터로 변환하라
        km = mile * 1.609;
        //System.out.println(km);

        // 3. 모두 출력하라
        System.out.println(mile + "마일은 " + km + "킬로미터입니다.");
    }
}
