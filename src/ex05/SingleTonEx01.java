package ex05;

// 싱글톤 패턴 이해하자
class President {
    static President instance = new President();

    private President() {
    }
}

public class SingleTonEx01 {
    public static void main(String[] args) {
        President p1 = President.instance;
        System.out.println(p1.hashCode());

        President p2 = President.instance;
        System.out.println(p2.hashCode());
    }
}
