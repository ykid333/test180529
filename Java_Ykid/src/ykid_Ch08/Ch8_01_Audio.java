package ykid_Ch08;

public class Ch8_01_Audio implements Ch8_01_RemoteControl {
	
	private int volume;
	private boolean mute;
	
	//인터페이스에서 선언한 turnOn 실체 메소드 선언
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
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
		System.out.println("현재 Audio 볼륨 : "+ volume);
	}
	
	//인터페이스에서 정의한 디폴트 메소드를 재정의 할 때
	//접근제한자를 default에서 public
	@Override
	public void setMute(boolean mute) {
		if(mute) {
		System.out.println("오디오를 무음 처리 합니다.");
		}else {
		System.out.println("오디오를 무음 해체 합니다.");
		}
]
}