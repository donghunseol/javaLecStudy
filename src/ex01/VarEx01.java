package ex01;

public class VarEx01 {

    // 모든 코드는 main 에서도 내부에 적는다.
    public static void main(String[] args) {
        int n1 = 1;                 // 21억까지 (4Byte)
        double d1 = 1.5;            // 소수를 포함한 21억까지 (8Byte)
        long big1 = 20000000000L;   // 경까지 (8Byte), 정수 표현 범위를 넘어갈때는 L을 넣어준다.
        boolean b1 = true;          // true, false
        char c1 = '가';             // 한 문자(글자)
        String s1 = "가나다";        // 문자열

        System.out.println(n1);
        System.out.println(d1);
        System.out.println(big1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(s1);
    } // 자바 프로그램 종료 (main 부터 종료까지가 '자바의 생명 주기'라고 한다)
}
