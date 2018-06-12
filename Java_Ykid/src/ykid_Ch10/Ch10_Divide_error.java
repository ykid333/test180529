package ykid_Ch10;

import java.util.Scanner;

public class Ch10_Divide_error {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int x = scan.nextInt();
		int y = scan.nextInt();
		try {
			System.out.println("x / y = " +x/y);
		}catch(ArithmeticException e) {
			System.out.println("예외발생");
		}
	}
}
