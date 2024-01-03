package ex09;

import javax.swing.*;

public class FrameTest1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Frame Test");
        f.setTitle("MyFrame");
        f.setSize(300, 200);
        f.setVisible(true);                                 // 화면에 나타나도록 만듬
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // 닫힘 버튼을 누르면 전체 프로그램이 종료되도록 만듬
    }
}
