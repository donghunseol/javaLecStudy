package ex04;

public class DeskLampTest {
    public static void main(String[] args) {
        // 객체를 생성하려면 new 예약어를 사용한다.
        DeskLamp myLamp = new DeskLamp();

        // 객체의 메소드를 호출하려면 도트 연산자인 .을 사용한다.
        myLamp.tnrnOn();
        System.out.println(myLamp);
        myLamp.tnrnOff();
        System.out.println(myLamp);
        /**
         * sout에서
         * .toString()을 안붙히는 이유는 애초에 myLamp 자체에
         * heap으로 return되는 값이 toString()으로 설정되어 있어서 그렇다.
         */
    }
}
