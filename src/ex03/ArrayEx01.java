package ex03;

public class ArrayEx01 {
    public static void main(String[] args) {
        // 타입이 있어야만 연속된 공간을 확보 할 수 있다. (배열)
        int[] arr = new int[3]; // 4 + 12 = 16-1

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        // arr[3] = 4; // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3 at ex03.ArrayEx01.main(ArrayEx01.java:11)

        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
    }
}
