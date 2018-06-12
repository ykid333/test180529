package ykid_Ch03;

import java.util.Scanner;

public class Ch3_12_ScannerExample {

	public static void main(String[] args) {
/*
 * next() : 문자열 입력
 * nextInt() : 정수 입력
 * nextDouble() : 실수 입력
 * close() : 스캐너 종료* 		
 */
		Scanner scan = new Scanner(System.in);
		//현재 프로그램에서 scan이라는 이름으로 Scanner 기능을 사용하겠다는 의미 
		/*System.out.print("이름을 입력해 주세요 : ");		
		String name = scan.next();
		System.out.println("당신의 이름은 " + name + " 입니다.");
		*/
		System.out.println("이름, 도시, 나이, 체중을 빈칸으로 분리하여 입력하세요.");
		String name1 = scan.next();
		String city = scan.next();
		int age = scan.nextInt();		
		double weight = scan.nextDouble();
		System.out.println("당신의 이름은 " + name1 + " 입니다.");
		System.out.println("당신이 사는 도시는 " + city + " 입니다.");
		System.out.println("당신의 나이는 " + age + "세 입니다.");
		System.out.println("당신의 체중은 " + weight + "kg 입니다.");
		scan.close();

	}

}
