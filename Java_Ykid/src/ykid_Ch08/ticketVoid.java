package ykid_Ch08;

import java.util.Scanner;

public class ticketVoid {
	Scanner scan = new Scanner(System.in);
	public int asd() {
		int ticketNum;
		int ticketPrice;
		int advancedDay;
		System.out.println("티켓번호");
		System.out.print(">>");
		ticketNum = scan.nextInt();
		
		System.out.println("정상티켓가격");
		System.out.print(">>");
		ticketPrice = scan.nextInt();
		System.out.println("예매일");
		System.out.print(">>");
		advancedDay = scan.nextInt();
		return ticketNum&ticketPrice&advancedDay;
		
	}
}
