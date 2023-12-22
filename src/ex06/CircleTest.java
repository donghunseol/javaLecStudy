package ex06;

class Shape {
    int x, y;

    public Shape() {
        System.out.println("Shape 생성됨");
    }
}

class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        System.out.println("Circle 생성됨");
        this.radius = radius;
        super.x = 0;
        super.y = 0;
    }

    double getArea() {
        return 3.14 * radius * radius;
    }
}


public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        circle.getArea();
    }
}
