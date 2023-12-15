package ex03;

import java.util.Arrays;
import java.util.List;

public class SortEx01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 8, 2, 4, 3);

        list.stream().sorted(); // 버블정렬 명령어 - 나중에는 안짜고 그냥 가능하다.

        System.out.println(list.stream().sorted());
    }
}
