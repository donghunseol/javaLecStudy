package ex04;

// 설계도
public class Circle {
    private int radius;

    // 생성자 : 생성될 때 무조건 실행되는 메소드
    public Circle(int r) { // 초기화 코드를 짠 것
        radius = r;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}
