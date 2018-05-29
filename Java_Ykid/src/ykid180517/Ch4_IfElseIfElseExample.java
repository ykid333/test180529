package ykid180517;

import java.util.Scanner;

public class Ch4_IfElseIfElseExample {
	
	public static void main(String[] args){
		/*
		 * 점수를 스캔으로 입력받아서
		 * 90이상이면 점수가 90~100입니다. 등급은 A입니다.
		 * 80~90미만이면 점수가 80~89입니다. 등급은 B 입니다.
		 * 70~80미만이면 점수가 70~79입니다. 등급은 C 입니다.
		 * 60~70미만이면 점수가 60~69입니다. 등급은 D 입니다.
		 * 60미만이면 점수가 60미만입니다. 재수강 고고고 FFFFFFF 입니다.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력 하세요.");
		
		int score = scan.nextInt();
		
		if(score>=90) {
			System.out.println("점수가 90~100 입니다.");
			System.out.println("등급은 A 입니다.");
		}else if(score>=80) {
			System.out.println("점수가 80~89 입니다.");
			System.out.println("등급은 B 입니다.");
		}else if(score>=70) {
			System.out.println("점수가 70~79 입니다.");
			System.out.println("등급은 C 입니다.");
		}else if(score>=60) {
			System.out.println("점수가 60~69 입니다.");
			System.out.println("등급은 D 입니다.");
		}else {
			System.out.println("점수가 60 미만 입니다.");
			System.out.println("재수강 고고고 FFFFFFFF 입니다.");
		}
		scan.close();
	}
	

}
