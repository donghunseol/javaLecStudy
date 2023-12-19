package ex04;

public class MethodEx01 {

    static void m1() { // 가장 기본 메서드 : 메모리에 띄워야 하니 스태틱이나 힙을 사용해야한다. (반환형이 없는 메서드)
        System.out.println("m1");
    }

    static String m2() { // 반환형이 있는 메서드 : return 값의 타입을 꼭 맞춰야한다.
        System.out.println("m1");
        return "m2"; // 메서드 종료
    }

    /**
     * 메서드는 메인에서 실행(호출) 시에 메서드의 코드가 메모리에 열린다.
     * ex) 15번 줄은 6번줄이 열리고  16번 줄은 10번 11번이 열린다.
     * 실행이 끝나면 리턴값으로 변한다.
     * ex) 16번줄이 "m2"로 변한다.
     */
    public static void main(String[] args) {
        MethodEx01.m1(); // 메서드 선언 할때는 클래스명.으로 찾는데 : 같은 클래스 내에 있으면 클래스명 생략가능
        m2();
        String result = m2();
        // String result = "m2"; // 위의 설명은 이 코드와 같다.
        System.out.println("result : " + result);
    }
}
