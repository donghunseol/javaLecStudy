package coffee;

public class Customer {

    private Barista barista;

    public Customer(Barista barista) { // 의존적인 관계이기 때문에 생성자를 넘겨준다. 아래까지 포함.
        this.barista = barista;
    }

    public void order(String menuName, Menu menu, Barista barista) {
        MenuItem menuItem = menu.choose(menuName);
        Coffee coffee = barista.makeCoffee(menuItem);

        System.out.println("가격이 " + coffee.getCoffeePrice() + "인 " + coffee.getCoffeeName() + "을 주문하셨습니다.");
    }
}
