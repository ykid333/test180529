package ykid_Ch07;
//추상클래스 선언
public abstract class Ch7_12_Phone {
	//필드 선언
	public String owner;
	
	//생성자 선언
	public Ch7_12_Phone(String owner) {
		this.owner=owner;
	}
	
	//메소드 선언
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
