package ex06.example4;

public class Dragoon extends Protoss {
    static int hp = 150;
    int attackDamege = 30;

    public Dragoon(String name) {
        super(name);
    }

    public void attack() {
        System.out.println("드라군이 공격합니다." + super.name);
    }
}
