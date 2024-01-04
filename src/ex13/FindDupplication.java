package ex13;

import java.util.*;

public class FindDupplication {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        String[] sample = {"사과", "사과", "바나나", "토마토"};
        for (String a : sample) {
            if (!s.add(a)) { // 중복이 되면 set은 들어가지 않으니 add로 들어가지 않는 경우 false로 반환하니 가능한 코드이다.
                System.out.println("중복된 단어: " + a);
            }
        }
        System.out.println(s.size() + " 중복되지 않은 단어: " + s);
    }
}
