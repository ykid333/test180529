package ykid_Ch07;

public class Ch7_13_Cat extends Ch7_13_Animal{

	public Ch7_13_Cat() {
		this.kind = "포유류";
	}
	
	//부모클래스에서 정의된 추상메소드를 구체화.
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
