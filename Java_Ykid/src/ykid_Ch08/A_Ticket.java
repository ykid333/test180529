package ykid_Ch08;

public class A_Ticket {
	private int number;				//티켓번호
	protected double price;			//티켓가격
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public A_Ticket(int number) {
		this.number=number;
	}
}
