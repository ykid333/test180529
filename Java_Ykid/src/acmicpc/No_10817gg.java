package acmicpc;

import java.util.Scanner;

public class No_10817gg {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int A= scan.nextInt();
		int B= scan.nextInt();
		int C= scan.nextInt();
		if(A>B) {
			if(A>C) {
				if(B>C) {
					System.out.println(B);
				}else {
					System.out.println(C);					
				}
			}else {
				System.out.println(A);
			}
		}
		if(B>=A) {
			if(B>C) {
				if(A>C) {
					System.out.println(A);
				}else {
					System.out.println(C);
				}
				
			}else {
				System.out.println(B);
			}
		}
		
	}
}