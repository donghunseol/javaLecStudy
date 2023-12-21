package ex04.example;

import ex04.example.model.Account;
import ex04.example.model.User;

public class BankApp {
    public static void main(String[] args) {
        // 1. 고객 2명 만들기
        User ssar = new User(1, "ssar", "ssar@naver.com");
        User cos = new User(2, "cos", "cos@naver.com");
        User love = new User(3, "love", "love@naver.com");

        // 2. 계좌 2개 만들기
        Account ssarAccount = new Account(1111, 1000L, 1);
        Account cosAccount = new Account(2222, 1000L, 2);
        Account loveAccount = new Account(3333, 1000L, 3);

        // 3. 고객에게 정보를 받기 (amount)
        long amount = 100L;

        // 4. 이체 (ssar -> cos 100원)
        BankService.이체(ssarAccount, cosAccount, amount);

        // 5. 이체 (ssar -> love 100원)
        BankService.이체(ssarAccount, loveAccount, amount);

    }
}
