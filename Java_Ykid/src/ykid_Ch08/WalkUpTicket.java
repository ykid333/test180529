package ykid_Ch08;

public class WalkUpTicket extends Ticket{
	
	String credit;
	public WalkUpTicket(int ticketNum,double ticketPrice,String credit) {
		super(ticketNum,ticketPrice);
		this.credit=credit;
		
	}
	@Override
	public double getTicketPrice() {
		if(credit.equals("y")) {
			this.ticketPrice = (int) (ticketPrice*1.05);
			return ticketPrice;
		}else {
			return ticketPrice;
		}
		
		
	}
	

}
