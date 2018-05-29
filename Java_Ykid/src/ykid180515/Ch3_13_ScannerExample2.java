package ykid180515;

import java.util.Scanner;

public class Ch3_13_ScannerExample2 {
	public static void main(String[] args) {
        
	      Scanner scan = new Scanner(System.in);
	      System.out.println("초를 입력하세요 : ");
	      int time = scan.nextInt();
	      int hour = time / 3600; // 몇시간인지 정수형 타입으로 출력한다.
	      int min = (time % 3600) / 60; // 시간을 제외한 나머지로 분을 알 수 있다.
	      int sec = (time % 3600) % 60; // 시간과 분을 제외한 나머지 초를 구한다.
	            
	      System.out.println(time + "초는 " + hour + "시간 " + min + "분 " + sec + "초 입니다.");
	      scan.close();

	   }
}
