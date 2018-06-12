package ykid_Ch08;

public abstract class Car {
	/*
	 *1. Car 클래스 (추상클래스
	 *  ㅁ.속도 색깔 정보를 가지고 있음
	 *  ㅠ.무엇인가를 실을 수 있는 메소드를 가지고 있음
	 *2. Sedan클래스 (Car 클래스 상속)
	 *	ㅁ.Sedan은 사람을 실을 수 있다.
	 *3. Truck클래스(Car 클래스 상속)
	 *	ㅁ. Truck은 짐을 실을 수 있다.
	 *4.CarExample
	 *	a.Sedan, truck에 대한 객체 각각 생성해서
	 *	ㅠ.각자 할 수 있는 것을 출력문으로 출력
	 */
	protected int speed;
	protected String color;
	
	public abstract void carry();
	public abstract void information();
}
