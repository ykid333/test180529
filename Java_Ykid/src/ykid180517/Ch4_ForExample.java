package ykid180517;

import java.util.Scanner;

public class Ch4_ForExample {
	
	public static void main(String[] args) {
		
		//출력형태
		//1+2+3+4+5+6+7+8+9+10=55
		Scanner scan = new Scanner(System.in);
		System.out.print("처음숫자를 입력하세요 : ");
		int S = scan.nextInt();
		System.out.print("끝숫자를 입력하세요 : ");
		int E = scan.nextInt();
		int sum=0;
		for(int i=S;i<=E;i++) {			
				sum=sum+i;
				System.out.print(i);	
			
			if(i%10==0) {
				System.out.print("\t");
				System.out.println();
				
			}
			if(i<=E-1) {
				System.out.print(" + ");
			}else {
				System.out.print(" = ");
			}
		}
			System.out.println(sum);
			
		
		
	}
}



