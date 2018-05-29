package acmicpc;

import java.util.Scanner;

public class No_9498 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		if(N>=90) {
			System.out.println("A");
		}
		if(N>=80 && N<=89) {
			System.out.println("B");
		}
		if(N>=70 && N<=79) {
			System.out.println("C");
		}
		if(N>=60 && N<=69) {
			System.out.println("D");
		}
		if(N<60) {
			System.out.println("F");
		}
		scan.close();

	}

}
