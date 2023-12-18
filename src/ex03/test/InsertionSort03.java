package ex03.test;

public class InsertionSort03 {
    public static void main(String[] args) {
        // 3. 배열이 5개짜리가 있다하면. 공통된 부분을 더 찾아보자!
        int[] arr = {5, 8, 2, 4, 3};

        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
        int temp;
        int n1 = 0;
        int n2 = 0;
        int i = 0;

        // 1회전
        n1 = 1;
        n2 = n1 - 1;
        if (arr[i + n2] > arr[i + n1]) {
            temp = arr[i + n1];
            arr[i + n1] = arr[i + n2];
            arr[i + n2] = temp;
        }

        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();


        // 2회전
        n1 = 2;
        n2 = n1 - 1;
        if (arr[i + n2] > arr[i + n1]) {
            temp = arr[i + n1];
            arr[i + n1] = arr[i + n2];
            arr[i + n2] = temp;
        }

        n1 = n1 - 1;
        n2 = n1 - 1;
        if (arr[i + n2] > arr[i + n1]) {
            temp = arr[i + n1];
            arr[i + n1] = arr[i + n2];
            arr[i + n2] = temp;
        }

        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();

        // 3회전
        n1 = 3;
        n2 = n1 - 1;
        if (arr[i + n2] > arr[i + n1]) {
            temp = arr[i + n1];
            arr[i + n1] = arr[i + n2];
            arr[i + n2] = temp;
        }

        n1 = n1 - 1;
        n2 = n1 - 1;
        if (arr[i + n2] > arr[i + n1]) {
            temp = arr[i + n1];
            arr[i + n1] = arr[i + n2];
            arr[i + n2] = temp;
        }

        n1 = n1 - 1;
        n2 = n1 - 1;
        if (arr[i + n2] > arr[i + n1]) {
            temp = arr[i + n1];
            arr[i + n1] = arr[i + n2];
            arr[i + n2] = temp;
        }

        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();

        // 4회전
        n1 = 4;
        n2 = n1 - 1;
        if (arr[i + n2] > arr[i + n1]) {
            temp = arr[i + n1];
            arr[i + n1] = arr[i + n2];
            arr[i + n2] = temp;
        }

        n1 = n1 - 1;
        n2 = n1 - 1;
        if (arr[i + n2] > arr[i + n1]) {
            temp = arr[i + n1];
            arr[i + n1] = arr[i + n2];
            arr[i + n2] = temp;
        }

        n1 = n1 - 1;
        n2 = n1 - 1;
        if (arr[i + n2] > arr[i + n1]) {
            temp = arr[i + n1];
            arr[i + n1] = arr[i + n2];
            arr[i + n2] = temp;
        }

        n1 = n1 - 1;
        n2 = n1 - 1;
        if (arr[i + n2] > arr[i + n1]) {
            temp = arr[i + n1];
            arr[i + n1] = arr[i + n2];
            arr[i + n2] = temp;
        }

        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
