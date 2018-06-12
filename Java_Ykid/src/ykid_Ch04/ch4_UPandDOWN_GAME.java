package ykid_Ch04;

import java.util.Scanner;

public class ch4_UPandDOWN_GAME {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1~50 UP & Down GAME");
		System.out.println();
		System.out.println("숫자를 입력하세요.");
		int num = (int)(Math.random()*3) + 1;
		System.out.println(num);
		int N;
		
		int i=0;
		do {
			System.out.print(">");
			N = scan.nextInt();
				if(N>num) {
					System.out.println(N+" 보다 작다.");
				}else if(N<num) {
					System.out.println(N+" 보다 크다.");
				}
			i++;
		} while( ! (N==num));
		System.out.println("맞았다!!!");
		System.out.println("당신은 "+i+" 번의 시도를 하였습니다.");
		scan.close();

	}

}
