package project;

import java.util.*;

class asdasdasd 
{
 public static void delay(int temp)
 {
  try { Thread.sleep(temp); } catch (Exception e) { System.out.println("딜레이 함수 오류\n원인:"+e); }
 }
 public static void main(String[] args) 
 {
  Scanner scan = new Scanner(System.in);
  int delaytime = 0;

  System.out.println("----------------------------------------------------------"); 
  System.out.println("Java Delay 구현 예제입니다.");
  System.out.println("입력한 Delay 시간동안 지연시키면서 0~ 10 까지 출력합니다.");
  System.out.println("초단위로 입력하세요 ex) 10  (10초간 딜레이 합니다.!)  "); 
  System.out.println("-------------------------------- blog.naver.com/action1020");
  System.out.print("지연시간을  초단위로 입력해주세요 : ");
  delaytime = scan.nextInt() * 1000; 
  
  String m="■ ";
  String b="□";
  String[] dot = new String[10];
  
  for(int i = 0 ; i <= 10; i ++) {
	  System.out.print(m);
	  delay(1000);
  }
  
  
 }
}
