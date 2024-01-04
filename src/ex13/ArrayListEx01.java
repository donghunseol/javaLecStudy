package ex13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx01 {
    public static void main(String[] args) {
        // 값을 넣는 방법1
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);

        // 값을 넣는 방법2
        List<Integer> arr2 = Arrays.asList(1, 2);
    }
}
