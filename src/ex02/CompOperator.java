package ex02;

public class CompOperator {
    public static void main(String[] args) {
        System.out.print((3 == 4) + " ");
        System.out.print((3 != 4) + " ");
        System.out.print((3 > 4) + " ");
        System.out.print((4 > 3) + " ");

        System.out.print((3 == 3 && 4 == 7) + " "); // 하나만 거짓이면 전체가 거짓
        System.out.print((3 == 3 || 4 == 7) + " "); // 하나만 참이면 전체가 참
    }
}
