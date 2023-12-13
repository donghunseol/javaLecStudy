package ex02;

import java.util.Scanner;

public class OrangeBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int orangeNum, boxNum, leftOrange;

        // 1. 오렌지 개수를 입력
        System.out.print("오렌지의 개수를 입력하시오: ");
        orangeNum = sc.nextInt();

        // 2. 박스 개수 출력
        boxNum = orangeNum/10;
        //System.out.println(boxNum);

        // 3. 남은 오렌지 개수 출력
        leftOrange = orangeNum%10;
        //System.out.println(leftOrange);

        // 4. 한번에 모두 출력
        System.out.println(boxNum + "박스가 필요하고 " + leftOrange + "개가 남습니다.");
    }
}
