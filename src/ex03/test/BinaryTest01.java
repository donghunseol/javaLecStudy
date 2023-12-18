package ex03.test;

public class BinaryTest01 {
    public static void main(String[] args) {
        // 이진 검색 => 반드시 정렬이 되어 있어야 한다.
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // 9 / 2 = 4

        // target = 8

        // start=0 ~ end = 8
        //        // mid = N/2 = 4 -> arr[4] -> 값 5
        //        // if(8==5) -> mid 위치에 타겟이 있다.
        //        // if(8>5) 참
        //
        //
        //        // start=5 (mid+1) ~ end=8
        //        // mid = 7 = arr[7] -> 값 8
        //        // if(8==8) -> mid 위치에 타겟이 있다.
        //        // if(8>8)
        //
        //
        //        // target = 3
        //
        //        // start=0 ~ end = 8
        //        // mid = N/2 = 4 -> arr[4] -> 값 5
        //        // if(3==5) -> mid 위치에 타겟이 있다.
        //        // if(3>5) 거짓
        //
        //
        //        // start=0 ~ end = mid-1
        //        // mid = 7 = arr[7] -> 값 8
        //        // if(8==8) -> mid 위치에 타겟이 있다.
        //        // if(8>8)
    }
}