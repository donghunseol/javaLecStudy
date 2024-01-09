package ex15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 보조 스트림(버퍼)를 정확하게 만들기!
public class StreamEx03 {
    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in);    // Reader 인 이유는 읽어야 하니깐!
        BufferedReader br = new BufferedReader(ir);                 // 가변 사이즈 8192

        try {
            String line = br.readLine(); // readLine은 \n 까지만 읽는다
            System.out.println(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
