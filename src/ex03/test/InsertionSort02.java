package ex03.test;

public class InsertionSort02 {
    public static void main(String[] args) {
        // 2. 배열이 5개짜리가 있다하면. 1차 과정뒤 2차 과정을 만들어보자!!
        int[] arr = {5, 2, 1, 9, 7};

        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
        int temp;
        int i = 0;

        // 1회전
        if (arr[i] > arr[i + 1]) {
            temp = arr[i + 1];
            arr[i + 1] = arr[i];
            arr[i] = temp;
        }

        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();

        // 2회전
        if (arr[i + 1] > arr[i + 2]) {
            temp = arr[i + 2];
            arr[i + 2] = arr[i + 1];
            arr[i + 1] = temp;
        }

        if (arr[i] > arr[i + 1]) {
            temp = arr[i + 1];
            arr[i + 1] = arr[i];
            arr[i] = temp;
        }

        for (int v : arr) {
            System.out.print(v + " ");
        }
    }
}
