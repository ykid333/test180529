package acmicpc;

import java.util.Scanner;

public class No_4344 {
	
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int F = scan.nextInt();
		for	(int j=1; j<=F;j++) {
			int N = scan.nextInt();
			int scores[] = new int[N];
			int sco = 0;
			int sum=0;
			int over=0;
			for(int i=0; i<N;i++) {
				sco = scan.nextInt();
				scores[i] = sco;			
				sum = sum + scores[i];
			}
			int avg = sum/scores.length;
			for(int i=0; i<N;i++) {
				if(scores[i]>avg) {
					over = over + scores[i];
				}
			}
			double o = Math.floor(over/avg);
			double k = (o/scores.length);
			System.out.printf("%.3f", k*100 );
			System.out.print("%");
		}
		
		
	} 
}


