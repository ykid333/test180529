package ykid_Ch08;

public class SmartPhone extends PDA implements MobilePhone, Mp3 {

	@Override
	public void call() {
		System.out.println("전화를 발신합니다.");
	}

	@Override
	public void reciveCall() {
		System.out.println("전화를 수신합니다.");
	}

	@Override
	public void play() {
		System.out.println("음악을 재생합니다.");
	}

	@Override
	public void stop() {
		System.out.println("음악재생을 종료합니다.");
	}

	@Override
	public void sendSms() {
		System.out.println("문자를 발신합니다.");
		
	}

	@Override
	public void reciveSms() {
		System.out.println("문자를 수신합니다.");
		
	}
	
}
