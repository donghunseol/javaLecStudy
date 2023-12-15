package ex03;

import java.util.Arrays;

public class RaggedArray2 {
    public static void main(String[] args) {
        int[][] rarray = new int[3][];

        rarray[0] = new int[]{1, 2, 3, 4};
        rarray[1] = new int[]{5, 6, 7};
        rarray[2] = new int[]{8, 9};

        for (int i = 0; i < rarray.length; i++) { // 전통 방식으로 값을 출력
            for (int j = 0; j < rarray[i].length; j++) {
                System.out.print(rarray[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] row : rarray) { // 1 차원 배열이면 이러한 방식으로 가능하지만 2차원 배열은 불가능하다
            System.out.println(Arrays.toString(row));
        }
    }
}
