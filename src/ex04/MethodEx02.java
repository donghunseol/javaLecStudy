package ex04;

public class MethodEx02 {

    static void m3(int n1) { // 파라미터(매개변수)에 값을 넣는 메서드
        System.out.println("m3 : " + n1);
    }

    static void m4(int n1, int n2) { // 파라미터(매개변수)의 값이 여러개인 메서드
        System.out.println("m4 : " + n1);
        System.out.println("m4 : " + n2);
    }

    // 파라미터(동전투입구) 아규먼트(동전)
    public static void main(String[] args) {
        m3(1);
        m4(1, 2); // 인수(아규먼트 - arguments) - 괄호 안의 값
    }
}
