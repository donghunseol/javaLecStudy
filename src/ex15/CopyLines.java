package ex15;

import java.io.*;

public class CopyLines {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("input.txt")); // FileReader에 BufferedReader를 연결한다.
            outputStream = new PrintWriter(new FileWriter("output.txt"));  // FileWriter의 출력이 PrinterWriter의 입력이 된다.
            String l;
            while ((l = inputStream.readLine()) != null) { // 한 줄 단위로 입출력할 수 있다.
                outputStream.println(l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
