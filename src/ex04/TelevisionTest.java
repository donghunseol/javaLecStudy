package ex04;

class TelevisionUtil {
    private int channel;
    private int volume;
    private boolean onOff;

    TelevisionUtil(int c, int v, boolean o) {
        channel = c;
        volume = v;
        onOff = o;
    }

    void print() {
        System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
    }
}

public class TelevisionTest {
    public static void main(String[] args) {
        TelevisionUtil myTv = new TelevisionUtil(7, 10, true);
        myTv.print();

        TelevisionUtil youTv = new TelevisionUtil(11, 20, true);
        youTv.print();
    }
}
