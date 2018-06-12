package ykid_Ch08;
//인터페이스 Ch8_01_RemoteControl의 구현 클래스
public class Ch8_01_Television implements Ch8_01_RemoteControl{
	//필드선언
	private int volume;
	
	//인터페이스에서 선언한 turnOn 실체 메소드 선언
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	@Override
	public void setVolume(int volume) {
		if(volume>Ch8_01_RemoteControl.MAX_VOLUME) {
			this.volume = Ch8_01_RemoteControl.MAX_VOLUME;
		} else if(volume<Ch8_01_RemoteControl.MIN_VOLUME) {
			this.volume=Ch8_01_RemoteControl.MIN_VOLUME;
		} else {
			this.volume =volume;
		}
		System.out.println("현재 TV 볼륨 : "+ volume);
	}
	

}
