package ykid_Ch05;

import java.util.Scanner;

public class Excercise {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[]num = new int[5];
		int temp;
		System.out.println("정수 5개를 입력하세요.");
		int max = 0;
		
		for(int i=0;i<num.length;i++) {			
			num[i] = scan.nextInt();
			if(num[i]>max) {
				max=num[i];
			}
		}
		for(int j=0;j<num.length;j++) {
			for(int k=j+1;k<num.length;k++) {
				if(num[j]>num[k]) {
					temp=num[j];
					num[j]=num[k];
					num[k]=temp;
				}
				
			}
		}
		for(int n=0; n<num.length;n++) {
			System.out.println(num[n]);
		}
			
		System.out.println("가장 큰 수는 "+ max+ " 입니다.");
	}
		
}

