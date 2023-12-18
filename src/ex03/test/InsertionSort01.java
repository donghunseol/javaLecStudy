package ex03.test;

public class InsertionSort01 {
    public static void main(String[] args) {
        // 1. 배열이 5개짜리가 있다하면. 첫번째 인덱스 값과 두번째 인덱스 값을 비교하여 더 작은수를 앞의 인덱스로 이동시킨다.
        int[] arr = {5, 2};

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        int temp;
        if (arr[0] > arr[1]) {
            temp = arr[1];
            arr[1] = arr[0];
            arr[0] = temp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
