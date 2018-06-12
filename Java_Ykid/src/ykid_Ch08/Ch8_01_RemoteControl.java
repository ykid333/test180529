package ykid_Ch08;

public interface Ch8_01_RemoteControl {
	//상수만 선언가능
	public int MAX_VOLUME = 10 ;
	public int MIN_VOLUME = 0;
	
	//추상메소드 선언
	//abstract를 붙이지 않아도 자동으로 추상메소드로 인식
	//사용 목적은 객체가 가지고 있는 메소드에 대한 설명
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드
	//구현 객체가 가지고 있는 메소드의 실행내용까지 작성해 놓은 것.
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리 합니다.");
		}else {
			System.out.println("무음 해체 합니다.");
		}
	}
	
	//정적(static)메소드
	//객체가 없어도 인터페이스에서 바로 호출이 가능한 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
