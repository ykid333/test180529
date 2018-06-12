package ykid_Ch04;

import java.util.Scanner;

public class Ch4_While {

	public static void main(String[] args) {
		
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		String inputString;
		
		
		do {
			System.out.print(">");
			inputString = scan.nextLine();
			
			System.out.println(inputString);
			
		} while( ! inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
		scan.close();

	}

}
