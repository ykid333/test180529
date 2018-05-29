package ykid180524;
//생성자의 접근제한 해제
public class Ch6_15_A {
	//필드선언
	//a1, a2, a3 필드는 Ch6_15_A클래스 타입으로 선언
	Ch6_15_A a1 = new Ch6_15_A(true);
	Ch6_15_A a2 = new Ch6_15_A(1);
	Ch6_15_A a3 = new Ch6_15_A("문자열");
	
	//생성자 선언
	public Ch6_15_A(boolean b) {
	}
	Ch6_15_A(int b){
	}
	private Ch6_15_A(String s) {
	}
}
