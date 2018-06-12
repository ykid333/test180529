package ykid_Ch04;

import java.util.Scanner;

public class Ch4_ForExample2 {

	public static void main(String[] args) {
		/*
		 * 1부터 입력받은 수까지의 정수 중에서 
		 * 2또는 3의 배수가 아닌 수의 총합을 계산하시오.
		 */
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int sum=0;
		System.out.println("2 또는 3의 3배수가 아닌 수");
		for(int i=1; i<=N;i++) {
			if( ! (i%2==0 || i%3==0)){
				System.out.print(i+" ");
				sum=sum+i; 
			}
			
		}
		System.out.println();
		System.out.println("수의 합 = " + sum);
		scan.close();
	}

}
