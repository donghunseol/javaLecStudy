package ex17.half;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            // localhost = 127.0.0.1 (루프백)
            Socket socket = new Socket("127.0.0.1", 10000);

            BufferedReader keyBr = new BufferedReader(new InputStreamReader(System.in));


//            Scanner sc = new Scanner(System.in);
//            String msg = sc.nextLine();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream(), "UTF-8")
            );

            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream(), "UTF-8") // 인코딩이 누구인지 알려주는것 안알려주면 상황에 따라 문자가 깨질수도 있다.
            );
            String inputMsg = keyBr.readLine();
            bw.write(inputMsg + "\n");
            bw.flush();
            String msg = br.readLine();
            System.out.println(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
