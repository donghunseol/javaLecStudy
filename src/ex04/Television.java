package ex04;

public class Television {

    int channel;    // 채널 번호
    int volume;     // 볼륨
    boolean onOff;  // 전원 상태

    public String toString() {
        return "나의 텔레비전의 채널은 " + channel + "이고 볼륨은 " + volume + "입니다.";
    }

    static String staticStatus(int channel, int volume) {
        return "나의 텔레비전의 채널은 " + channel + "이고 볼륨은 " + volume + "입니다.";
    }

    public static void main(String[] args) {
        Television myTv = new Television();
        myTv.channel = 7;
        myTv.volume = 10;
        myTv.onOff = true;

        Television youTv = new Television();
        youTv.channel = 9;
        youTv.volume = 12;
        youTv.onOff = true;

        String ss1 = staticStatus(myTv.channel, myTv.volume);
        String ss2 = staticStatus(youTv.channel, youTv.volume);

        System.out.println(ss1);
        System.out.println(ss2);

        System.out.println(myTv);
        System.out.println(youTv);
    }
}
