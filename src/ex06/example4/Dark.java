package ex06.example4;

public class Dark extends Protoss {
    String name;
    static int hp = 120;
    int attackDamege = 15;

    public Dark(String name) {
        super(name);
    }

    public void attack() {
        System.out.println("다크템플러가 공격합니다." + this.name);
    }
}
