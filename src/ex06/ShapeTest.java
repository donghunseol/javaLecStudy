package ex06;

class Shape01 {
    public void draw() {
        System.out.println("Shape");
    }
}

class Circle01 extends Shape01 {
    public void draw() {
        super.draw();
        System.out.println("Circle을 그립니다.");
    }
}

class Rectangle01 extends Shape01 {
    public void draw() {
        System.out.println("Rectangle을 그립니다.");
    }
}

class Triangle01 extends Shape01 {
//    public void draw() {
//        System.out.println("Triangle을 그립니다.");
//    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle01 s = new Rectangle01();
        s.draw();
        Triangle01 t = new Triangle01();
        t.draw();
        Circle01 c = new Circle01();
        c.draw();
    }
}
