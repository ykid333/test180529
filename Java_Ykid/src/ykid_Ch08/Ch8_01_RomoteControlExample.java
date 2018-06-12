package ykid_Ch08;

public class Ch8_01_RomoteControlExample {

	public static void main(String[] args) {
		//인터페이스 타입의 변수 선언
		Ch8_01_RemoteControl rc;
		//각각의 객체를 인터페이스 타입 변수에 대입.
		
		//Television 객체를 rc에 대입
		//따라서 rc는 Television 객체가 됨
		rc = new Ch8_01_Television();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		
		//Audio 객체를 rc에 대입
		//따라서 rc는 Audio 객체가 됨
		rc = new Ch8_01_Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		
		Ch8_01_RemoteControl.changeBattery();
	}

}
