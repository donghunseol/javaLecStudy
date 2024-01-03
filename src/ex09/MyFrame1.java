package ex09;

import javax.swing.*;
import java.awt.*;

public class MyFrame1 extends JFrame { // 상속하여 JFrame의 메서드를 사용한다.
    public MyFrame1() {
        setSize(300, 150);
        setLocation(200, 300);
        setTitle("MyFrame");

        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.yellow);
        JButton button1 = new JButton("확인");
        JButton button2 = new JButton("취소");
        this.add(button1);    // 버튼에 프레임 추가
        this.add(button2);    // 버튼에 프레임 추가
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame1 f = new MyFrame1();
    }
}
