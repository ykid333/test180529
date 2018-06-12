package ykid_Ch04;

import java.util.Scanner;

public class Ch4_Exercise {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("당신의 점수와 학년을 입력하세요 : ");
		int score = scan.nextInt();
		int G = scan.nextInt();
		
		
		if( score>100 || G>4) {
			System.out.print("입력 범위를 벗어났습니다.");
		}else {
			switch (G) {
			case 4:
				if(score>=70) {
					System.out.println("합격");
				}else {
					System.out.println("불합격");
				}
				break;
			default :
				if(score>=60) {
					System.out.println("합격");
				}else {
					System.out.println("불합격");
				}
				break;
			}	
		}	
		scan.close();
	}
}
