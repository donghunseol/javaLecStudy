package ex13.example1;

class Box<T> {
    T data;
}

public class GenericEx01 {
    public static void main(String[] args) {
        Box<String> box1 = new Box();   // 제네릭을 사용시 원하는 타입으로 new 선언시 선택이 가능하다.
        Box<Integer> box2 = new Box();

        box1.data = "1";
        box2.data = 1;
    }
}
