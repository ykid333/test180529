package ykid_Ch08;

public class Ticket {
	/* Ticket 클래스
	 * 각 티켓은 티켓 번호와 가격 정보를 가지고 있음
	 * 티켓의 가격은 변경 가능함
	 * 
	 * Advanced 클래스 (Ticket 상속)
	 * 사전예약 티켓, 티켓 번호와 사전예약 일수 정보를 가지고 있음
	 * 언제 예약을 했느냐에 따라 가격이 달라짐.
	 *  30일전 : 50%할인
	 *  10일전 : 20%할인
	 *   5일전 : 10%할인
	 *   
	 * WalkUpTicket (Ticket 상속)
	 * 일반 티켓, 티켓이 발행될 때 티켓 번호와 신용카드 결제 여부 정보를 가지고 있음
	 * 신용카드로 결제하는 경우 5% 금액이 가산됨
	 * 
	 * TicketExample 클래스
	 * 사전예약 티켓, 일반 예매 티켓을 각각 객체로 만들어서
	 * 각 티켓의 티켓번호, 구매가격을 출력하시오
	 * 
	 */
	
	
	public int ticketNum;
	public double ticketPrice;
	
	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
			this.ticketPrice =ticketPrice;
		}

	public Ticket(int ticketNum,double ticketPrice) {
		this.ticketNum=ticketNum;
		this.ticketPrice=ticketPrice;
	}
}
