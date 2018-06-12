package ykid_Ch08;

public class A_WalkUpTicket extends A_Ticket {
	
	private boolean payByCredit;
	
	public A_WalkUpTicket(int number, boolean payByCredit) {
		super(number);
		this.payByCredit=payByCredit;
	}
	
	public double getPrice() {
		if(payByCredit) {
			return price*1.05;
		}
		return price;
	}
}
