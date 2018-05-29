package ykid180529;

public class Ch7_06_Car {
	//필드, 메소드, final 메소드
	
	//sportsCar 클래스 선언 메소드, final 메소드 재정의
	
	/*public String model;
	public String color;
	
	public void run() {
		System.out.println(color+"색상의"+model+"가 달립니다.");
	}
	
	final void Stop() {
		System.out.println(color+"색상의"+model+"가 멈춥니다.");
	}*/
	
	public int speed;
	
	//메소드
	public void speedUp() {
		speed += 1;
	}
	public final void stop() {
		System.out.println("차를 멈춤");
		speed=0;
	}

}
