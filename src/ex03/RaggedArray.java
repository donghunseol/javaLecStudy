package ex03;

/**
 * 레그드 배열
 * 2차원 배열에서 행마다 길이가 다른 배열을 말한다.
 */
public class RaggedArray {
    public static void main(String[] args) {

        int[][] ragged = new int[3][]; // 행이될 배열을 선언
        ragged[0] = new int[1]; // 행마다 배열의 크기를 지정
        ragged[1] = new int[2];
        ragged[2] = new int[3];

        for (int i = 0; i < ragged.length; i++) {
            for (int j = 0; j < ragged[i].length; j++) {
                ragged[i][j] = j;
                System.out.print(ragged[i][j] + " ");
            }
            System.out.println();
        }
    }
}
