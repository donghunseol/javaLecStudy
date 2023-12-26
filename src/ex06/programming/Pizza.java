package ex06.programming;

class Circle {
    protected int radius;

    public Circle(int r) {
        this.radius = r;
    }
}

public class Pizza extends Circle {
    String name;

    public Pizza(String name, int r) {
        super(r);
        this.name = name;
    }

    public static void main(String[] args) {
        Pizza obj = new Pizza("Pepperoni", 20);

    }


}
