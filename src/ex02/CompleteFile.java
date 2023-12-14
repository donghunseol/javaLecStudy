package ex02;

import java.util.Scanner;

/**
 * 사용자로부터 파일이 위치한 드라이브 이름, 디렉터리이름, 파일이름, 화장자를 받아서 완전한 파일 이름으로 만드는 프로그램 작성
 * 예시)
 * 드라이브 이름: c
 * 디렉터리 이름: \test\
 * 파일 이름: sample
 * 확장자: py
 * <p>
 * 완전한 이름은 c:\test\sample.py
 */
public class CompleteFile {
    public static void main(String[] args) {
        // 1. 드라이브 이름을 받고 출력해보자 (드라이브는 한 문자로 되어 있어 char형을 사용한다)
        Scanner sc = new Scanner(System.in);
        char drive;
        System.out.print("드라이브 이름: ");
        drive = sc.next().charAt(0);
        // System.out.print(drive);

        sc.nextLine(); // 입력버퍼 제거 next()를 입력시 마지막에 \n으로 공백이 생기므로 공백을 생략하기 위해서 사용한다.

        // 2. 디렉터리 이름부터 확장자 이름까지는 모두 문자열로 들어가므로 String 을 이용한다.
        // 디렉터리
        System.out.print("디렉터리 이름: ");
        String directory = sc.nextLine();
        // System.out.println(directory);

        // 파일
        System.out.print("파일 이름: ");
        String file = sc.nextLine();
        // System.out.println(file);

        // 확장자
        System.out.print("확장자: ");
        String extension = sc.nextLine();
        // System.out.println(extension);
        System.out.println("\n완전한 이름은 " + drive + ":" + directory + file + "." + extension);
    }
}
