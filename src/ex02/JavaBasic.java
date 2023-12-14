package ex02;

public class JavaBasic {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = true;
        System.out.println("P\tQ\tAND\tOR\tXOR");
        System.out.println(x == true ? true : false);
        System.out.println(y == true ? true : false);
        System.out.println((x == true) && (y == true) ? true : false);
        System.out.println((x == true) || (y == true) ? true : false);
        System.out.println((x == true) && (y == true) ? true : false);
    }
}
