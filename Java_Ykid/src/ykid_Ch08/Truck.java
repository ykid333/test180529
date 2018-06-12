package ykid_Ch08;

public class Truck extends Car{
	public Truck() {
		this.speed = 5;
		this.color = "코발트블루";
	}
	@Override
	public void carry() {
		System.out.println("Truck은 짐을 실을 수 있다.");
	}
	@Override
	public void information() {
		System.out.println("Truck의 속도는 "+speed+" 색상은 "+color);
	}

}
