package ex17.oneway;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

// 요청 하는 자(을)
public class Client {
    public static void main(String[] args) {
        try {
            // localhost = 127.0.0.1 (루프백)
            Socket socket = new Socket("127.0.0.1", 10000);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String msg = br.readLine();

//            Scanner sc = new Scanner(System.in);
//            String msg = sc.nextLine();

            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream(), "UTF-8") // 인코딩이 누구인지 알려주는것 안알려주면 상황에 따라 문자가 깨질수도 있다.
            );

            bw.write(msg + "\n");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
