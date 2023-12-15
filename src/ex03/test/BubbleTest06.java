package ex03.test;

public class BubbleTest06 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};

        final int N = arr.length;

        int temp;

        // 1, 2, 3, 4 회전 리펙토링
        for (int loop = 1; loop < N; loop++) {
            for (int i = 0; i < N - loop; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
