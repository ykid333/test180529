package ykid180518;

import java.util.Scanner;

public class Ch5_ArrayExample {

	public static void main(String[] args) {
		/*
		 * 3열짜리 1차원 배열을 선언하고
		 * 스캐너를 이용하여 값을 하나하나 입력하고
		 * 입력한 값의 총 합 및 평균 값을 구하시오.
		 */		
		Scanner scan = new Scanner(System.in);
		int[]arr = new int[3];
		int num=0;
		int sum=0;
		for(int i=0;i<3;i++) {
			num = scan.nextInt();
			arr[i]=num;
			sum=sum+arr[i];
		}
		int avg=sum/arr.length;
		System.out.println("총합은 "+ sum);
		System.out.println("평균은 "+ avg);
	}

}
