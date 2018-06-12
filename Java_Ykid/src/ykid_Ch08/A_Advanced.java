package ykid_Ch08;
//예약 티켓을 위한 클래스
public class A_Advanced extends A_Ticket{
	private int advancedDays;//사전예약 일수
	
	public A_Advanced(int number, int advancedDays) {
		super(number);
		this.advancedDays=advancedDays;
	}
	
	public double getPrice() {
		if(advancedDays>=30) {
			price = price*0.5;
			//return price;
		}else if(advancedDays>=10){
			price = price*0.8;
			//return price;
		}else if(advancedDays>=5) {
			price =price*0.9;
			//return ticketPrice;
		}else {
			price=price;
		}
		return price;
		
	}
}
