package acmicpc;

import java.util.Scanner;

public class No_2440 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for(int i=N; i>=1; i--) {
			for(int j=1; j<=i; j++) {
			 System.out.print("*");
			};								
			System.out.println();			
		}		
		scan.close();
	}
}