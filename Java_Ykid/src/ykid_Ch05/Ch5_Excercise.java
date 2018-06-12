package ykid_Ch05;

import java.util.Scanner;

public class Ch5_Excercise {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N;
		int num=0; //학생수
		int max=0; //최대값
		int min=100;
		double sum=0; //총합
		int score[]=null;
		
		while(true) {
			
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("| 1.학생수  | 2.점수입력  | 3.점수리스트  | 4.분석  | 5.종료  |");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("선택>");
			N = scan.nextInt();
			
			if(N==1) {
				System.out.print("학생수>");
				num = scan.nextInt();
				System.out.println("학생수는 "+num+" 명 입니다.");
				score = new int[num];
			}
			if(N==2) {
				for(int i=0;i<num;i++) {
					System.out.print((i+1)+" 번 째 학생 점수 : ");
					score[i]=scan.nextInt();
				}
			}
			if(N==3) {
				for(int i=0;i<num;i++) {
					System.out.println((i+1)+" 번 째 학생 점수 : "+score[i]+" 점");
				}
			}
			if(N==4) {
				for(int i=0;i<score.length;i++) {
					sum=sum+score[i];
					if(score[i]>max) {
						max=score[i];
					}
					if(score[i]<=min) {
						min=score[i];
					}
				}
				System.out.println("최고 점수 : "+max+" 점");
				System.out.println("최저 점수 : "+min+" 점");
				System.out.println("평균 점수 : "+(sum/score.length)+" 점");
			}
			if(N==5) {
				System.out.print("종료합니다.");				
				break;
			}
		} 
	}
}