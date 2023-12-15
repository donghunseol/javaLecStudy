package ex03.programming;

/**
 * 1~50까지의 정수를 369 게임으로 정렬하라
 */
public class programming03 {
    public static void main(String[] args) {
        // 1. 1 ~ 50 까지 숫자를 출력해보자
        int[] arr = new int[50];

//        for (int i = 0; i < 50; i++) {
//            arr[i] = i + 1;
//            //System.out.print(arr[i] + " ");
//        }
        // 2. 3 6 9 에서 짝이 나오도록 바꿔보자
        for (int i = 0; i < 50; i++) {
            arr[i] = i + 1;
            if (arr[i] == 3 || arr[i] == 6 || arr[i] == 9) {
                System.out.println("짝 ");
            } else {
                System.out.println(arr[i] + " ");
            }

        }
    }
}
