package ykid_Ch08;

import java.util.Scanner;

public class TicketExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		Advanced adv = new Advanced(100,1000,30);
		WalkUpTicket wut = new WalkUpTicket(200,1000,"n");
		
		System.out.println("사전예약 티켓의 번호는 "+adv.ticketNum+" 이며 "+
							adv.getAdvancedDay()+" 일 전 예약 고객이므로"
							+" 구매가격은 "+adv.getTicketPrice()+" 입니다.");
		
		if(wut.credit.equals("y")) {
		System.out.println("일반예약 티켓의 번호는 "+wut.ticketNum+" 이며 "+"신용카드 결제로 5%가산되어"+
						   " 구매가격은 "+wut.getTicketPrice()+" 입니다.");
		}else {
		System.out.println("일반예약 티켓의 번호는 "+wut.ticketNum+" 이며 "+
					   " 구매가격은 "+wut.getTicketPrice()+" 입니다.");
		}

	}

}
