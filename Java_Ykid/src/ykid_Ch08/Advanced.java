package ykid_Ch08;

public class Advanced extends Ticket {
	
	public int advancedDay;; //사전예약일
	
	public Advanced(int ticketNum, double ticketPrice,int advancedDay) {
		super(ticketNum,ticketPrice);
		this.advancedDay=advancedDay;
	}
	
	public int getAdvancedDay() {
		return advancedDay;
	}
	
	public void setAdvancedDay(int advancedDay) {
		this.advancedDay = advancedDay;
	}
	
	@Override
	public double getTicketPrice() {
		if(advancedDay>=30) {
			this.ticketPrice = (int) (ticketPrice*0.5);
			return ticketPrice;
		}else if(advancedDay>=10){
			this.ticketPrice = (int) (ticketPrice*0.8);
			return ticketPrice;
		}else if(advancedDay>=5) {
			this.ticketPrice = (int) (ticketPrice*0.9);
			return ticketPrice;
		}else {
			return ticketPrice;
		}
		
	}
	
	

}
