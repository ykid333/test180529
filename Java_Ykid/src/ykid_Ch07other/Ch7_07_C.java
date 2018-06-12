package ykid_Ch07other;

import ykid_Ch07.Ch7_07_A;

public class Ch7_07_C {
	
	/* 
	 * C클래스는 다른패키지에 선언
	 * A클래스 포함시키고
	 * a클래스 객체 만들고 a클래스의 필드, 메소드로 접근 가능한지 확인
	 */
	
	public void CCC() {
		//A클래스 객체 생성 가능한지
		Ch7_07_A a = new Ch7_07_A(); //안된데
		
		//a클래스의 필드, 메소드로 접근 가능한지 확인
		a.name="맥심";
		a.who();		//둘다 안된데
	}

}
