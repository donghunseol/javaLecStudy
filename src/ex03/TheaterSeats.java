package ex03;

// 2차원 배열 예제
public class TheaterSeats {
    public static void main(String[] args) {

        // 배열은 구조 변경 불가능
        int[][] seats = {
                {0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 1, 1, 0},
                {1, 1, 0, 0, 0, 0, 1, 1, 1, 0}
        };

        int sum = 0;
        int count = 0;
        //int row = -1;

        for (int row = 0; row < seats.length; row++) {
            count = 0;
            for (int i = 0; i < seats[row].length; i++) {
                count = count + seats[row][i];
            }
            System.out.println(row + "번째 행의 관객수는: " + count);
            sum = sum + count;
        }
        System.out.println("전체 관계수는: " + sum);

//        // 모듈화 및 단계 과정
//        row++;
//        count = 0;
//        for (int i = 0; i < seats[row].length; i++) {
//            count = count + seats[row][i];
//        }
//        System.out.println(row + "번째 행의 관객수는: " + count);
//        sum = sum + count;
//
//        row++;
//        count = 0;
//        for (int i = 0; i < seats[row].length; i++) {
//            count = count + seats[row][i];
//        }
//        System.out.println(row + "번째 행의 관객수는: " + count);
//        sum = sum + count;
//
//        row++;
//        count = 0;
//        for (int i = 0; i < seats[row].length; i++) {
//            count = count + seats[row][i];
//        }
//        System.out.println(row + "번째 행의 관객수는: " + count);
//        sum = sum + count;
//
//        row++;
//        count = 0;
//        for (int i = 0; i < seats[row].length; i++) {
//            count = count + seats[row][i];
//        }
//        System.out.println(row + "번째 행의 관객수는: " + count);
//        sum = sum + count;
//
//
//        System.out.println("전체 관계수는: " + sum);
    }
}
