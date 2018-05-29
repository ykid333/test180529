package ykid180517;

import java.util.Scanner;

public class Ch4_BreakExample2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N;
		int sum=0;
		double i=0;
		/*do {
			N = scan.nextInt();
			sum=sum+N;
			i++;
			
		} while( ! (N==0));*/
		
		while(true) {
			N = scan.nextInt();
			sum=sum+N;
			i++;
			if(N==0) {
				break;
			}
		}
		System.out.println("수의 개수는 "+(i-1));
		System.out.println("수의 합은 "+sum);
		System.out.println("수의 평균은 "+ sum/(i-1));
		
		
		scan.close();
		

	}

}
