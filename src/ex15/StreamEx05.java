package ex15;

import java.io.*;

// 상대 경로 : 실행되는 위치(일반적으로 프로젝트 폴더)를 기반으로 경로를 정하는 것 (내 파일을 out의 파일에서 찾는다!)
// 절대 경로 : 루트에서 부터 경로를 찾는 것 (아래의 파일 경로)
// 윈도우 : C:\\workspace\\hello.txt
// 맥, 리눅스 : /workspace/hello.txt
// 상대 경로와 절대 경로의 차이점을 명확하게 알고 접근 해야한다. 타겟 설정의 실수가 나지 않도록 해야 하기 때문이다.
public class StreamEx05 {
    public static void main(String[] args) {
        try {
            //BufferedReader br = new BufferedReader(new FileReader("D:\\workspace\\java_lec\\study\\src\\ex15\\hello.txt")); // 절대 경로
            BufferedReader br = new BufferedReader(new FileReader("src\\ex15\\hello.txt")); // 상대 경로
            BufferedWriter bw = new BufferedWriter(new FileWriter("input.txt"));
            bw.write("안녕 반가워\n");

            bw.flush();
            
            String line = br.readLine();
            System.out.println(line);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
