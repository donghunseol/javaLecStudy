package ex03;

import java.util.Arrays;
import java.util.Random;

public class LottoEx01 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Random r = new Random();

        int num;
        int j;

        for (int i = 0; i < arr.length; i++) {
            j = i - 1;
            num = r.nextInt(45) + 1;             // 처음에 값을 부여
            if (i == 0) {
                arr[i] = num;
                continue;
            }
            while (true) {
                if (arr[j] != num) {
                    arr[i] = num;
                    j--;                            // j--를 하므로 i-1이 였던것을 숫자가 1씩 자동으로 줄어들도록 만듬
                    if (j < 0) {                    // j값을 i로 받는데 이때 -1이 생기는 경우를 방지하기 위해서 추가
                        break;
                    }
                } else {
                    num = r.nextInt(45) + 1;  // 값이 일치할시에는 다시 값을 부여 해야 하므로 위치 이동
                    j = i - 1;                      // 처음부터 다시 값을 비교하기 위해서
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
