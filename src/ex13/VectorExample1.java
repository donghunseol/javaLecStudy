package ex13;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class VectorExample1 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();
        vec.add("Apple");
        vec.add("Orange");
        vec.add("Mango");

        // 크기
        System.out.println(vec.size());

        // 인덱스 접근
        System.out.println(vec.get(1));

        // 정렬 (오름차순)
        Collections.sort(vec);

        for (String s : vec) {
            System.out.print(s + " ");
        }
        System.out.println();

        // 정렬 (내림차순)
        Collections.sort(vec, Collections.reverseOrder());

        for (String s : vec) {
            System.out.print(s + " ");
        }
        System.out.println();

        // 정렬 다른 방법
        // Arrays.sort(); -> 배열 정렬 할 때에 사용

        // 삭제
        String result = vec.remove(2);
        System.out.println(result); // 삭제한 값이 리턴된다.
        System.out.println(vec.size());

        // 값 찾기 (mango, Mango, mAngo, MANGO) -> 어떻게 검색해도 찾도록 만들자!
        boolean search = vec.contains("Mango");
        System.out.println(search);

        // 대소문자 구분없이 찾기
        String a = "Mango";
        boolean check = a.equalsIgnoreCase("mAngo"); // 대소문자 구별없이 찾기 위해 사용하는 것 equalsIgnoreCase()
        System.out.println(check);
    }
}
