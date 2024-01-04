package coffee;

public class Coffee {
    private String name;
    private int price;

    public Coffee(MenuItem menuItem) {
        this.name = menuItem.getName();
        this.price = menuItem.cost();
    }

    public String getCoffeeName() {
        return name;
    }

    public int getCoffeePrice() {
        return price;
    }
}
