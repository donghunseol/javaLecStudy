package ex07;

abstract class Shape {
    int x, y;

    public void translate(int x, int y) { // 추상 클래스도 보통 메서드를 가질 수 있다.
        this.x = x;
        this.y = y;
    }

    public abstract void draw(); // 추상 메서드 선언
}

class Rectangle extends Shape {
    int width, height;

    public void draw() { // 자식 클래스에서 부모 클래스의 추상 메서드를 구현하지 않으면 오류 발생!
        System.out.println("사각형 그리기 메소드");
    }
}

class Circle extends Shape {
    int radius;

    public void draw() {
        System.out.println("원 그리기 메소드");
    }
}

public class AbstractTest {
    public static void main(String[] args) {
        //Shape s1 = new Shape(); // 추상 클래스로 객체를 생성할 수는 없다.
        Shape s2 = new Circle();
        s2.draw();
    }
}
