package ex02;

public class JavaBasic {
    public static void main(String[] args) {
        // 논리연산표를 만들어 보자
        // 1. 논리연산표의 참 거짓을 논하기 위한 변수 선언
        boolean p, q, and, or, xor;
        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR");
        // 2. 첫번째 줄 결과값 출력해보기
        p = true;
        q = true;
        // 3. boolean에 바로 논리연산자를 사용가능한가?
        and = (p && q) ? true : false;
        //System.out.println(and);
        or = (p || q) ? true : false;
        //System.out.println(or);
        // 4. xor는 하나만 참일때 출력된다 둘다 참이면 안된다.
        xor = ((p || q) && !(p && q) ? true : false);
        // System.out.println(xor);
        System.out.println(p + "\t" + q + "\t" + and + "\t" + or + "\t" + xor);
        /**
         * (p || q) && !(p && q)는
         * (p || q)가 모두 참이거나 둘중하나가 참이여야 참인데
         * !(p && q)는 !가 붙으면서 둘다 참이면 안된다 라고 하는 것이다.
         * 이걸 서로 && 로 묶어주면 둘중 하나가 참인경우가 제외가 되는데 이 때문에 하나가 참인경우만 수용하게 된다.
         */
        p = true;
        q = false;
        xor = ((p || q) && !(p && q) ? true : false);
        and = (p && q) ? true : false;
        or = (p || q) ? true : false;
        System.out.println(p + "\t" + q + "\t" + and + "\t" + or + "\t" + xor);

        p = false;
        q = true;
        xor = ((p || q) && !(p && q) ? true : false);
        and = (p && q) ? true : false;
        or = (p || q) ? true : false;
        System.out.println(p + "\t" + q + "\t" + and + "\t" + or + "\t" + xor);

        p = false;
        q = false;
        xor = ((p || q) && !(p && q) ? true : false);
        and = (p && q) ? true : false;
        or = (p || q) ? true : false;
        System.out.println(p + "\t" + q + "\t" + and + "\t" + or + "\t" + xor);
    }
}