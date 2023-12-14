package ex03;

// 정수의 합 계산하기
public class Sum {
    public static void main(String[] args) {
        int sum = 0;

        // 1. sum이라는 저장공간에 i의 값을 중첩시켜서 저장한다. (1~10까지의 합)
        for (int i = 1; i <= +10; i++) {
            sum = sum + i;
        }

        System.out.println("1부터 10까지의 정수의 합 = " + sum);
    }
}
