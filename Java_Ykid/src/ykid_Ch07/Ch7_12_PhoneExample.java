package ykid_Ch07;

public class Ch7_12_PhoneExample {

	public static void main(String[] args) {
		//자식클래스 객체 생성
		Ch7_12_SmartPhone smartphone = new Ch7_12_SmartPhone("소유자");
		
		//추상클래스 객체 생성
		
		//Ch7_12_Phone phone = new Ch7_12_Phone("소유자");
		smartphone.turnOn();
		smartphone.turnOff();
		smartphone.internetSerch();
	}

}
