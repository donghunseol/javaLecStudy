package ex03;

import java.util.Scanner;

// 가위 바위 보 게임 만들기
public class RockPaperScissor {
    final int SCISSOR = 0; // final은 상수 : 변하지 않는 값
    final int ROCK = 1;
    final int PAPER = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가위(0), 바위(1), 보(2): ");
        int user = sc.nextInt();

        int computer = (int) (Math.random() * 3); // Math.random()은 0.0이상 1.0미만 까지의 난수를 출력하는데 앞에 (int)를 붙임으로 0으로 바뀌었고 * 3을 하므로 0~2으로 바뀌었다.
        if (user == computer) {
            System.out.println("비겼습니다.");
        } else if (user == (computer + 1) % 3) { // 0은 1한테 지고 1은 2한테, 2는 0한테 진다. -> 이렇게 하면 나머지로 할시 값이 같아지면 인간이 이긴 결과가 나온다.
            System.out.println("인간: " + user + " 컴퓨터: " + computer + "  인간 승리");
        } else {
            System.out.println("인간: " + user + " 컴퓨터: " + computer + "  컴퓨터 승리");
        }
    }
}
