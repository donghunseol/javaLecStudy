package ch02;

public class TypeConversion {
    public static void main(String[] args) {
        int i;
        double f;

        f = 1 / 5;                  // 1 / 5는 피연산자가 정수이므로 정수 연산으로 계산되어서 0이 된다.
        System.out.println(f);

        f =(double) 1 / 5;          // (double)1 / 5에서는 먼저 형변환 연산자가 우선순위가 높기 때문에 먼저 실행되어서 정수 1과 5가 부동 소수점 1.0과 5.0으로 변환된다.
        System.out.println(f);

        i = (int) 1.7 + (int) 1.8;  // 수식(int)1.7 + (int)1.8에서는 1.7과 1.8이 모두 1로 변환되므로 변수 i에는 1 + 1연산 결과인 2가 저장된다.
        System.out.println(i);
    }
}
