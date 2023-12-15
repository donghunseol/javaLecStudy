package ex03;

import java.util.Scanner;

// 컴퓨터가 가진 숫자를 추측하여 맞추는 게임
public class TheGuessingGame {
    public static void main(String[] args) {
        // 1. 숫자를 입력하고 입력 횟수만큼 카운터를 누적 시켜보자
        Scanner sc = new Scanner(System.in);
        int num, count = 0;

        // 2. 숫자를 랜덤하게 컴퓨터가 가지도록 만든다.
        int computerNum = (int) (Math.random() * 100) + 1;
        //System.out.println(computerNum);

        // 3. 입력한 숫자와 컴퓨터가 가진 숫자가 같을때까지 입력을 받게한다. 이때 입력한 숫자가 가진 숫자보다 큰지 작은지 알려준다.
        while (true) {
            System.out.print("정답을 추측하여 보시오: ");
            num = sc.nextInt();
            count++;

            if (computerNum == num) {
                System.out.println("축하합니다. 시도횟수=" + count);
                break;
            } else {
                System.out.println((computerNum > num) ? "제시한 정수보다 낮습니다." : "제시한 정수보다 높습니다.");
            }

        }
    }
}
