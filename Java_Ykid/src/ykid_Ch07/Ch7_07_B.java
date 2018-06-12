package ykid_Ch07;

public class Ch7_07_B {
	
	/*	
	 * B클래스
	 * 메소드선언해서
	 * a클래스 객체 만들고 a클래스의 필드, 메소드에 접근 가능한지 확인
	 */
	
	public void BBB() {
	Ch7_07_A a = new Ch7_07_A();  //a클래스 객체생성
	
	//A클래스에서 선언한 필드에 접근 가능한지
	a.name="맥심";
	//A클래스에서 선언한 메소드에 접근 가능한지
	a.who();
	}
	
}
