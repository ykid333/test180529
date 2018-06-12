package ykid_Ch08;

public class Ch8_02_Car {
	//좌변 : Tire 인터페이스 타입의 변수 frontLeftTire선언
	//우변 : HankookTire 객체를 만듬
	Ch8_02_Tire frontLeftTire = new Ch8_02_HankookTire();
	Ch8_02_Tire frontRightTire = new Ch8_02_HankookTire();
	Ch8_02_Tire backLeftTire = new Ch8_02_HankookTire();
	Ch8_02_Tire backRightTire = new Ch8_02_HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
