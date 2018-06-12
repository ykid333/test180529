package ykid_Ch08;

public interface Phone {
	
	/*
	 * 1.Phone interface
	 * 	A.10개의 버튼이 있음
	 * 	B.전화를 걸고, 받을 수 있음.
	 * 2.MobilePhone interface(Phone 상속)
	 * 	A.문자를 보내고 받을 수 있음
	 * 3.Mp3 interface
	 * 	B.음악 재생, 정지가 가능함
	 * 4.PDA Class
	 * 	A.덧셈 계산을 할 수 있음.
	 * 5.SmartPhone Class
	 *  A.PDA를 상속받고 MobilePhone Mp3 를 구현
	 *  B.SmartPhone클래스를 완성하세요.
	 * 6. Main클래스
	 * 	A. SmartPhone객체를 만들어서
	 * 	B. SmartPhone의 기능을 사용하세요.
	 */
	int buttons = 10;
	//추상메소드 선언
	public void call();
	public void reciveCall();
}
