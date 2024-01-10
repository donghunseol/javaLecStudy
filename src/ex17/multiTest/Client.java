package ex17.multiTest;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

class ClientRr extends Thread implements Runnable {
    Socket socket;

    public ClientRr(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            Socket socket = new Socket("localhost", 10000);
            while (true) {
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
                String msg = br.readLine();
                System.out.println("서버 : " + msg);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class ClientRw extends Thread implements Runnable {
    Socket socket;

    public ClientRw(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            Socket socket = new Socket("localhost", 10000);

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));
            BufferedReader keyBr = new BufferedReader(new InputStreamReader(System.in));
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


public class Client {
    public static void main(String[] args) {
        Thread t1 = new ClientRr(new Socket());
        Thread t2 = new ClientRw(new Socket());
        t1.start();
        t2.start();
    }
}
