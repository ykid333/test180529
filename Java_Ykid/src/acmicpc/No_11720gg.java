package acmicpc;

import java.util.Scanner;

public class No_11720gg {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		double M = scan.nextDouble();
		double sum=0;
		
		for(int i=1;i<=N;i++) {
			System.out.println((double)M);
		    sum= (sum + ((double)M%10));
            M = (M/10);
            System.out.println((int)sum);
           
		}
		  System.out.println((int)sum);
	}

}
