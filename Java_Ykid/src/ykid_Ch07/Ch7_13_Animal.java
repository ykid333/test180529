package ykid_Ch07;

public abstract class Ch7_13_Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	
	//추상메소드 선언
	//추상메소드는 실행 블록이 없고 단지 메소드 이름, 리턴타입등만 선언
	public abstract void sound();
}
