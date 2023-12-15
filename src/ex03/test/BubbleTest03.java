package ex03.test;

public class BubbleTest03 {
    public static void main(String[] args) {
        int[] arr = {4, 3};

        int temp;           // swap 변수
        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;      // swap 코드

        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
