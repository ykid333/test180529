package ykid_Ch04;

import java.util.Scanner;

public class Ch4_Example3 {

	public static void main(String[] args) {		
		
		int BA=0;
		
		while(true) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("1.예금  || 2.출금  || 3.잔고  || 4.종료");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
			Scanner scan = new Scanner(System.in);
			System.out.print("선택>");
			int N = scan.nextInt();
			if(N==1) {
				System.out.print("예금액>");
				int deposit = scan.nextInt();
				BA=BA+deposit;
				System.out.println("현재잔액은 "+BA+" 입니다.");
			}
			if(N==2) {
				System.out.print("출금액>");
				int withdraw = scan.nextInt();
				if(withdraw>BA) {
					System.out.println("잔액이 부족합니다.\n"+"현재잔액은 "+BA+" 입니다.");
				}else {
				BA=BA-withdraw;
				System.out.println("현재잔액은 "+BA+" 입니다.");
				}
			}
			if(N==3) {
				System.out.println("현재잔액은 "+BA+" 입니다.");
			}
			
			if(N==4) {
				System.out.print("종료합니다.");				
				break;
			}
		
		} 
		
	}
}

