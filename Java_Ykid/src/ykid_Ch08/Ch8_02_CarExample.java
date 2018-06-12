package ykid_Ch08;

public class Ch8_02_CarExample {

	public static void main(String[] args) {
		Ch8_02_Car car = new Ch8_02_Car();
		
		car.run();
		System.out.println("-----------------------------");
		System.out.println("변수에 다른 객체 대입");
		car.frontLeftTire = new Ch8_02_KumhoTire();
		
		car.run();

	}

}
