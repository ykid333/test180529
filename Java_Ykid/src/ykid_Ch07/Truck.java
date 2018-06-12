package ykid_Ch07;

public class Truck extends Car{
	
	
	int loadage;		//적재량 필드선언

	public int getLoadage() {
		return loadage;
	}

	public void setLoadage(int loadage) {
		this.loadage = loadage;
	}
	
	public Truck(String color,int speed, int loadage) {
		this.color=color;
		this.speed=speed;
		this.loadage=loadage;
	}
	
}
