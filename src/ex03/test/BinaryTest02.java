package ex03.test;

public class BinaryTest02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        final int target = 2;
        int mid, start, end;
        int count = 0;
        int N = arr.length;
        end = N - 1;
        start = 0;
        mid = (end - start) / 2;

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < N / 2; i++) {
            count++;
            System.out.println("mid : " + mid);
            if (target == arr[mid]) {
                System.out.println("검색을 " + count + "회 하여 " + target + "값을 " + mid + "번지에서 찾았습니다");
                break;
            }
            if (target > arr[mid]) {
                start = mid + 1;
                mid = start + ((end - start) / 2);
            } else if (target < arr[mid]) {
                end = mid - 1;
                mid = start + ((end - start) / 2);
            }
        }
    }
}
