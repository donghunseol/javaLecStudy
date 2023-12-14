package ex03;

import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("받은 돈: ");
        int money = sc.nextInt();
        System.out.print("상품 가격: ");
        int price = sc.nextInt();

        int surtax = price / 10;
        System.out.println("부가세: " + surtax);

        int change = money - price;
        System.out.print("잔돈: " + change);
    }
}
