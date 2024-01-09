package ex17.half;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(10000);   // 서버 소켓 생성
            System.out.println("서버가 실행되었습니다");
            Socket socket = serverSocket.accept();                      // 리스너 (while을 돌면서 확인하는 것이다) : 누가 연결을 하는지 확인 -> 연결이 되면 소켓을 생성
            System.out.println("클라이언트 연결되었습니다");

            //BufferedReader keyBr = new BufferedReader(new InputStreamReader(System.in));

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream(), "UTF-8")
            );

            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream(), "UTF-8")
            );
            String msg = br.readLine();
            System.out.println("클라이언트 : " + msg);
            //String inputMsg = keyBr.readLine();
            bw.write("서버에서 클라이언트의 메세지를 확인하였습니다\n");
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
