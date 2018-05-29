package acmicpc;

import java.util.Scanner;

public class No_2577 {

	private static int F;
	private static int count;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = A*B*C;
		for(int i=0;i<=9;i++) {
		int count=0;
		No_2577.count(D, i, count);
		}
		
	}
	static void count(int D, int i, int count) {
		while(true) {
			
			F = D%10;
			if(F==i) {
				count++;
			}
			
			if(D<10) {
				break;
			}
			D = D/10;
			
		}
		System.out.println(count);
	}
	

}
