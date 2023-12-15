package ex03;

public class BubbleEx01 {

    // 함수-메서드 : 메서드 맛보기
    // static 을 찾을때 class 부터 찾는다. 하지만 같은 class 내에 있으면 class 명 생략가능
    static void bubble(int[] arr) {
        final int N = arr.length;

        int temp;

        for (int loop = 1; loop < N; loop++) {
            for (int i = 0; i < N - loop; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        BubbleEx01.bubble(arr); // static 을 찾을때 class 부터 찾는다. 하지만 같은 class 내에 있으면 class 명 생략가능

        System.out.println();

        int[] arr2 = {5, 8, 2, 4, 3, 10, 500, 7, 6};
        BubbleEx01.bubble(arr2);
    }
}
