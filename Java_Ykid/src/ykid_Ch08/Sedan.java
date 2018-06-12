package ykid_Ch08;

public class Sedan extends Car{
	public Sedan() {
		this.speed = 10;
		this.color = "빨간색";
	}
	@Override
	public void carry() {
		System.out.println("Sedan은 사람을 실을 수 있다.");
	}
	@Override
	public void information() {
		System.out.println("Sedan의 속도는 "+speed+" 색상은 "+color);
	}
}
