package ex13.example3;

class Dog {
    String name;
    int age;

    void speak() {
        System.out.println("멍멍");
    }
}

class Cat {
    String name;
    int age;

    void speak() {
        System.out.println("야옹");
    }
}

public class GenericEX03 {
    public static void main(String[] args) {
        Object[] arr = new Object[2];
        arr[0] = new Dog();
        arr[1] = new Cat();

        Dog d1 = (Dog) arr[0]; // [-> Object, Dog]
        Cat c1 = (Cat) arr[1]; // [-> Object, Cat]

        d1.speak();

        c1.speak();
    }
}
