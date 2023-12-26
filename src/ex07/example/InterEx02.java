package ex07.example;

// 라이브러리 판매
interface EventListener {
    void action();
}

// 라이브러리 판매
class myApp {
    public void click(EventListener l) {
        l.action();
    }
}


public class InterEx02 {
    public static void main(String[] args) {
        myApp app = new myApp();
        app.click(() -> {
            System.out.println("회원가입 로직이 실행됩니다.");
        });
    }
}
