package acmicpc;

import java.util.Scanner;

public class No_2439 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i=N; i>=1; i--) {
			for(int j=2; j<=i; j++) {
			 System.out.print(" ");
			};
			for(int k=N-1; k>=i; k--){			
				System.out.print("*");
			}						
			System.out.println("*");			
		}		
		scan.close();
	}
}

