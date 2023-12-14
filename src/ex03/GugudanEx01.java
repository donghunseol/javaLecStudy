package ex03;

import java.util.Scanner;

// 1. 2~9단까지 출력되는 프로그램을 만드시오.
// 2. 스캐너를 이용하여 입력받은 단만 출력하시오.
public class GugudanEx01 {
    public static void main(String[] args) {
        // 가로로 출력되는 구구단
        for (int i = 1; i <= 9; i++) { // 가로로 나올때는 앞의 숫자가 변수 뒤의 숫자가 상수이다. 그러므로 뒤의 숫자는 고정한채 앞의숫자가 바뀌게 해주면 가로 구구단이 완성된다.
            for (int j = 2; j <= 9; j++) {
                System.out.print(j + "*" + i + "=" + (j * i) + "\t");
            }
            System.out.println();
        }

        // 변수와 상수가 누구인지 알아내라
        for (int x = 2; x <= 9; x++) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(x + "*" + i + "=" + (x * i));
            }
        }

        //입력한 구구단을 출력하라
        System.out.print("출력하고 싶은 구구단의 단을 골라주세요: ");
        Scanner sc = new Scanner(System.in);
        int selectedNum = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(selectedNum + "*" + i + "=" + (selectedNum * i));
        }
    }
}
