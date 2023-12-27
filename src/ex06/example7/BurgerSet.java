package ex06.example7;

public class BurgerSet { // has Burger, Coke
    private Burger berger;
    private Coke coke;

    public BurgerSet(Burger berger, Coke coke) {
        this.berger = berger;
        this.coke = coke;
        System.out.println("버거 세트가 만들어졌어요");
    }

    public int getTotalPrice() {
        return berger.getPrice() + coke.getPrice();
    }

    public Burger getBerger() {
        return berger;
    }

    public Coke getCoke() {
        return coke;
    }
}
