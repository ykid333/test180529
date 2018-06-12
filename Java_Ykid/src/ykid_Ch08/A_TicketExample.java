package ykid_Ch08;

public class A_TicketExample {
	
	public static void main(String[] args) {
		//사전예약 티켓 일반티켓을 각각 객체로 만들어서 정보를 출력
		
		A_Advanced adticket = new A_Advanced(100, 20);
		
		adticket.setPrice(1000);
		System.out.println("당신의 사전예약 티켓 번호는 " + adticket.getNumber()+" 이고 구매가격은 " + adticket.getPrice());
		
		A_WalkUpTicket wuticket = new A_WalkUpTicket(120,true);
	}
}
