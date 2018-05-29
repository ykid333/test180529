package acmicpc;

import java.util.Scanner;

public class No_2839 {

	public static void main(String[] args) {
		
		//설탕 배달
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int F = N%5;
		int sum=0;
		switch(F) {
		case 1:
			if(N==1) {
				System.out.println("-1");}
			else if(N==6) {
				System.out.println(N/3);
			}else {
				for(int i=1; i<(N/5);i++) {
					sum = i;			
				}System.out.println(sum+2);
			}
			break;
		case 2:
			if(N==7 || N==17 ||N==2) {
				System.out.println("-1");
			}else {
				for(int i=1; i<(N/5);i++) {
					sum = i-1;			
				}System.out.println(sum+4);
			}
			break;
		case 3:
			if(N==3) {
				System.out.println(N/3);
			}else {
				for(int i=1; i<=(N/5);i++) {
					sum = i;			
				}System.out.println(sum+1);
			}
			break;
		case 4:
			if(N==4) {
				System.out.println("-1");
			}else {
				for(int i=1; i<=(N/5);i++) {
					sum = i-1;			
				}System.out.println(sum+3);
			}
			break;
		case 0:
			for(int i=1; i<=(N/5);i++) {
				sum = i;			
			}System.out.println(sum);
			break;
			
		}
		scan.close();
	}

}


