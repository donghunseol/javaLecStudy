package ex03;

import java.util.ArrayList;

// ArrayList 예시
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();  // ArrayList 생김새
        list.add("철수"); // 0
        list.add("영희"); // 1
        list.add("순신"); // 2
        list.add("지영"); // 3 의 위치에 저장된다. 중간에 지워져도 주소를 다음껄로 자동으로 바꾼다.

        System.out.println(list.get(3));    // 불러오기

        list.remove(3);               // 삭제

        //System.out.println(list.get(3));
    }
}
