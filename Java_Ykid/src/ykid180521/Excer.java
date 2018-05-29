package ykid180521;

import java.util.Scanner;

public class Excer {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[]arr = new int[5];
		int max = 0;
		int num=0;
		int i=0;
		System.out.println("양수 5개를 입력하세요.");
		
		for(i=0;i<5;i++) {			
			num = scan.nextInt();			
			arr[i]=num;
			System.out.println(arr[i]);
		}for(i=0;i<5;i++) {
			max=(max>arr[i])?max:arr[i];
		}
		System.out.println("가장 큰 수는 "+ max+ " 입니다.");
	}
}