package ex03.test;

public class InsertionSort04 {
    public static void main(String[] args) {
        // 3. 배열이 5개짜리가 있다하면. 공통된 부분을 더 찾아보자!
        int[] arr = {5, 8, 2, 4, 3};
        int N = arr.length;

        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
        int temp;

        for (int i = 1; i < N; i++) {
            temp = arr[i];                                      // temp 에 회전 곳의 뒤의 데이터를 삽입한다.
            for (int j = i - 1; j >= 0 && arr[j] > temp; j--) { // j는 앞의 수로 점점 나아가는 수로 j에 i - 1을 대입하여 j를 비교 대상의 앞에 데이터를 불러 올수 있도록 만들고
                arr[j + 1] = arr[j];                            // 조건 식은 j가 0보다 큰경우에만 인덱스 값이 호출되고 temp 가 arr[j]보다 커야 교환이 일어나야하므로 설정
                arr[j] = temp;                                  // 그 후 점점 아래로 비교하니깐 j를 1씩 빠지도록 만들었다.
            }
        }
        
        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
