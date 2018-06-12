package ykid_Ch07;

public class Sedan extends Car{
	
	private int seatNum;

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	public Sedan(String color,int speed) {
		this.color=color;
		this.speed=speed;
	}
	
}
