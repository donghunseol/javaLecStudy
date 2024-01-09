package ex15;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

// 보조스트림을 만들지만 버퍼는 아닌 버전
public class StreamEx02 {
    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in); // 배열을 만들수 있다
        char[] ch = new char[4];    // 보조 스트림 생성!

        try {
            ir.read(ch);

            for (char c : ch) {
                System.out.print(c + " ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
