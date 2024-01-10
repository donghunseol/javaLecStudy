package ex17.multiTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
            Socket socket = serverSocket.accept();

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
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

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket();
            Thread t1 = new Thread(new ServerRr(serverSocket));
            t1.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
