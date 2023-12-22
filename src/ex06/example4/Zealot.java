package ex06.example4;

public class Zealot extends Protoss {
    String name;
    static int hp = 100;
    int attackDamege = 5;

    public Zealot(String name) {
        super(name);
    }

    public void attack() {
        System.out.println("질럿이 공격합니다." + this.name);
    }
}
