package ex04.test;

public class ScopeEx01 {

    int n1 = 1;
    static int n2 = 2;

    static void m1() {
        int n1 = 10;
        System.out.println("n1 : " + n1);
    }

    void m2() {
        System.out.println("n2 : " + n1);
    }

    // 메인 시작 전에 static에 n2 변수와 m1 메서드가 로드 되어 있음.
    public static void main(String[] args) {
        System.out.println("1");
        m1();
        System.out.println("2");
        ScopeEx01 sc = new ScopeEx01();
        System.out.println(sc.n1);
        sc.m2();
    }
    /**
     * ScopeEx01 (클래스)
     *
     * static (n2 = 2), m1(), main) → 클래스명.x
     * → 어디에서든지 접근 가능하다. (heap 이 static 에 접근 가능)
     *
     * heap (n1 = 1, m2())
     * → heap 끼리는 같은 scope 여서 접근이 가능하다
     *
     * stack (n1 = 10)
     * → 외부 접근 불가능
     */
}
