package acmicpc;

import java.util.Scanner;

public class No_11720gg {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		double M = Math.floor(scan.nextDouble());
		double sum=0;
		
		for(int i=1;i<=N;i++) {
		    sum= Math.floor(sum + M%10);
		    System.out.println(i+"번째 : "+Math.floor(M%10));
            M = Math.floor(M/10);
           // System.out.println(sum);
           
		}
		  System.out.println(sum);
		  
	}

}
