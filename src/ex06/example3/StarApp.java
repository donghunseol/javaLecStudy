package ex06.example3;

public class StarApp {

    public static void gameStart(Zealot u1, Dragoon u2) {
        u1.attack();
        u2.attack();
    }

    public static void main(String[] args) {
        Zealot z1 = new Zealot("z1");
        Dragoon d1 = new Dragoon("d1");
        River r1 = new River("r1");
        Dark dark1 = new Dark("dark1");

    }
}
