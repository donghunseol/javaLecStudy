package ex15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StreamEx04 {
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            bw.write("안녕");
            bw.write("반가워\n"); // 통신은 한 번에 읽을 때 \n 까지 읽는다. (이로 인해 문장의 끝에 거의 \n을 붙힌다)
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
