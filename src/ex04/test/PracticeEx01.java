package ex04.test;

/**
 * 1. 자료형
 * 2. 조건문
 * 3. 반복문
 * 4. static, heap, stack
 * 5. 클래스, 메서드
 * 6. 생성자 오버로딩, 메서드, 오버로딩
 * 7. 접근제어자
 */
class Bird { // 클래스, 오브젝트(가능성)
    // 상태 : 무게, 색상
    double weight;
    String color;

    public Bird(double weight, String color) { // 파라미터
        this.weight = weight;
        this.color = color;
    }

    public Bird() {
        this.weight = 10;
        this.color = "빨강";
    }

    public void eat() {
        this.weight++;
    }
}

public class PracticeEx01 {
    public static void main(String[] args) {
        Bird b1 = new Bird(5.5, "빨강"); // 인스턴스, 오브젝트(객체)
        Bird b2 = new Bird(5.0, "하얀");

        b1.eat(); // 행위 (메서드)
        System.out.println(b1.weight);
        System.out.println(b2.weight);
    }
}
