package acmicpc;

import java.util.Scanner;

public class No_8393 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();	
		int j = 0;
		for(int i=1; i<=N; i++) {
			j=j+i;
		}
		System.out.println(j);
		
		scan.close();

	}

}
