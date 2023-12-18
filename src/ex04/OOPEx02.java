package ex04;

class Person4 {
    // 상태 = 변수
    private int weight = 100; // 다른 클래스에서 접근이 불가능하도록 하는 것

    // 메서드 x => 확인 용도 이다.
    public int getWeight() {
        return weight;
    }

    // 행위 = 메서드
    // 접근 제어자 : private 어디에서도 접근 불가 / public 어디에서든지 접근 가능
    public void exercise() {
        weight = weight - 10;
    }
}

public class OOPEx02 {
    public static void main(String[] args) {
        Person4 p4 = new Person4();
        System.out.println("p4의 몸무게 : " + p4.getWeight());

        p4.exercise();
        System.out.println("p4의 몸무게 : " + p4.getWeight());

        p4.exercise();
        System.out.println("p4의 몸무게 : " + p4.getWeight());

        for (int i = 0; i < 8; i++) {
            p4.exercise();
        }
        System.out.println("p4의 몸무게 : " + p4.getWeight());
    }
}
