package ykid_Ch10;

import java.util.Scanner;

public class Ch10_04_Arithmetic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			while(true) {
				System.out.println("분자를 입력하세요.");
				int num1 = scan.nextInt();
				System.out.println("분모를 입력하세요.");
				int num2 = scan.nextInt();
				
				int result = num1/num2;
				System.out.println(result);
			}
		}catch(ArithmeticException e){
			System.out.println("0으로 나울수 없엉");
		}

	}

}
