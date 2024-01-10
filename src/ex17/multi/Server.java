package ex17.multi;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(10000);
            Socket socket = serverSocket.accept();

            Thread t1 = new Thread(() -> {
                try {
                    BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
                    while (true) {
                        String requestMsg = br.readLine();
                        System.out.println("클라이언트로 부터의 메세지 : " + requestMsg);
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });

            Thread t2 = new Thread(() -> {
                try {
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));
                    BufferedReader keyBr = new BufferedReader(new InputStreamReader(System.in));
                    while (true) {
                        String msg = keyBr.readLine();
                        bw.write(msg + "\n");
                        bw.flush();
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });

            t1.start();
            t2.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
