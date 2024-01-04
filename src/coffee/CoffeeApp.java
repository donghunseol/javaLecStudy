package coffee;

import java.util.Arrays;
import java.util.List;

public class CoffeeApp {
    public static void main(String[] args) {
        MenuItem m1 = new MenuItem("아메리카노", 1500);
        MenuItem m2 = new MenuItem("카푸치노", 3000);
        MenuItem m3 = new MenuItem("카라멜 마끼아또", 4500);
        MenuItem m4 = new MenuItem("에스프레소", 2000);

        List<MenuItem> mi = Arrays.asList(m1, m2, m3, m4);

        Menu menu = new Menu((List<MenuItem>) mi);

        Barista barista = new Barista();
        Customer customer = new Customer(barista);  // 고객이 바리스타에게 부탁하므로 의존적이다. 이런 경우 바리스타를 매개변수로 선언 해줘야한다.

        customer.order("아메리카노", menu, barista);
        customer.order("카푸치노", menu, barista);
        customer.order("카라멜 마끼아또", menu, barista);
        customer.order("에스프레소", menu, barista);
        // 이런 행위를 컴포지션이라 한다.
        //customer.order("아메리카노");
    }
}
