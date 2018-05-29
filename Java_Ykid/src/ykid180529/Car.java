package ykid180529;

public class Car {
	//필드 선언
	public String color;
	public int speed;
	
	//생성자
	public Car() {}
		
	//메소드
	
	public void speedUp(int speed) {
		this.speed=this.speed+speed;
	}
	public void speedDown(int speed) {
		this.speed=this.speed-speed;
	}
	
}
