package ykid180523;
//method = 연습 예제 p.217
public class Ch6_06_Calculator {
	//method 선언
	//메소드 이름 : powerOn
	//메소드 리턴 타입 : void
	
	void powerOn() {
		System.out.println("전원을 컵니다.");
	}
	
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x/(double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

}
