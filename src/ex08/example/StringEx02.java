package ex08.example;

public class StringEx02 {
    public static void main(String[] args) {
        // 문서
        // ? 뒤를 쿼리스트링이라고 한다.
        // 쿼리스트링은 키=값 형태의 데이터의 집합이다.
        // 키=값이 여러개일때는 &로 구분한다.
        String url = "http://www.naver.com?username=ssar&password=1234";

        // username값과, password값 찾아보기
        String username = "";
        String password = "";

        String[] tokens1 = url.split("&");
        String[] tokens2;

        for (int i = 0; i < tokens1.length; i++) {
            tokens2 = tokens1[i].split("=");
            if (tokens1[i] == tokens1[0]) {
                username = tokens2[1];
            }
            if (tokens1[i] == tokens1[1]) {
                password = tokens2[1];
            }
        }

        System.out.println("user의 ID는 " + username + "이고, PW는 " + password + "입니다");
    }
}