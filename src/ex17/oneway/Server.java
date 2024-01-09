package ex17.oneway;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

// 요청 받는 자(갑)
// 서버는 소켓이 최소 2개이다.
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(10000);   // 서버 소켓 생성
            Socket socket = serverSocket.accept();                      // 리스너 (while을 돌면서 확인하는 것이다) : 누가 연결을 하는지 확인 -> 연결이 되면 소켓을 생성
            System.out.println("클라이언트 연결됨");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream(), "UTF-8")
            );

            while (true) {
                String msg = br.readLine();
                if (msg == null) {
                    break;
                }
                System.out.println(msg);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
