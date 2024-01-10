package ex17.half2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(20000);
            Socket socket = serverSocket.accept();
            // 소켓 연결 완료됨

            // 버퍼 만들기 (recevied)
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String requsetMsg = br.readLine();
            System.out.println("클라이언트로부터 받은 메세지 : " + requsetMsg);

            // 버퍼 만들기 (send)
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

            if (requsetMsg.equals("1")) {
                pw.println("영화");
            } else if (requsetMsg.equals("2")) {
                pw.println("드라마");
            } else {
                pw.println("프로토콜을 확인하세요 : 1은 영화, 2는 드라마");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
