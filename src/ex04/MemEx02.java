package ex04;

class Person2{
    int age = 10;
    char gender = '남';
}

public class MemEx02 {
    public static void main(String[] args) {
        System.out.println("1년 지남");
        System.out.println("2년 지남");
        System.out.println("3년 지남");

        Person2 p = new Person2();  // new 하면 class의 내용이 heap(동적할당)에 뜬다. / 커스텀 변수이기 때문에 내가 만든 변수 이름으로 한다.
        System.out.println(p.age);
        System.out.println(p.gender);

        System.out.println("메인 종료");
    }
}