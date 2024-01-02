package ex08;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int result = 0;
        try {
            result = 10 / num;
        } catch (Exception e) { // try 실패시 catch가 발생
//            System.out.println("0으로 나누면 안되요");
//            System.out.println(e.getMessage());
//            System.out.println(e.getClass());
//            e.printStackTrace();                           // 오류를 알려준다.(try catch를 안하면 무조건 터지는 오류)
            throw new RuntimeException("0으로 나눌 수 없어요"); // 강제로 오류를 만들어 줄 수 있다.
        }
        System.out.println("나눗셈 결과 : " + result);
    }
}
