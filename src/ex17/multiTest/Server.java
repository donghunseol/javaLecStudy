package ex17.multiTest;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

class ServerRr implements Runnable {
    ServerSocket serverSocket;

    public ServerRr(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    @Override
    public void run() {
        try {
            System.out.println("서버가 켜졌습니다");
            Socket socket = serverSocket.accept();
            System.out.println("클라이언트가 연결되었습니다");
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
            while (true) {
                String msg = br.readLine();
                System.out.println("클라이언트 : " + msg);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class ServerRw implements Runnable {
    ServerSocket serverSocket;

    public ServerRw(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    @Override
    public void run() {
        try {
            Socket socket = serverSocket.accept();

            BufferedReader keyBr = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));
            while (true) {
                String msg = keyBr.readLine();
                bw.write(msg + "\n");
                bw.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(10000);
            Thread t1 = new Thread(new ServerRr(serverSocket));
            Thread t2 = new Thread(new ServerRw(serverSocket));
            t1.start();
            t2.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
