package ex08.example;

public class StringEx01 {

    public static String encoding(String data) {
        String result = "";
        char sameStr = ' ';
        int count = 0;
        for (int i = 0; i < data.length(); i++) {
            for (int j = 0; j < data.length(); j++) {
                if (sameStr == data.charAt(i)) {
                    break;
                }
                if (data.charAt(i) == data.charAt(j)) {
                    count++;
                }
            }
            sameStr = data.charAt(i);
            if (sameStr == data.charAt(i)) {
                if (count != 0) {
                    result = result + sameStr + Integer.toString(count);
                }
                count = 0;
            }
        }
        return result;
    }

    public static String decoding(String data) {
        String result = "";
        int number;
        String[] separation = data.split("");

        for (int i = 0; i < separation.length; i++) {
            if (i % 2 != 0) {
                number = Integer.parseInt(separation[i]);
                for (int j = 0; j < number; j++) {
                    result = result + separation[i - 1];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String data = "AABBBCCCCDDDDD"; // Byte -> 14Byte

        System.out.println(encoding(data));
        System.out.println(decoding(encoding(data)));

        // 인코딩 A2B3C4D5
        // 디코딩 AABBBCCCCDDDDD
    }
}