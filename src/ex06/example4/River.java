package ex06.example4;

public class River extends Protoss {
    String name;
    static int hp = 200;
    int attackDamege = 30;

    public River(String name) {
        super(name);
    }

    public void attack() {
        System.out.println("리버가 공격합니다." + this.name);
    }
}
