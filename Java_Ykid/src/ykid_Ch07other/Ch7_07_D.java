package ykid_Ch07other;

import ykid_Ch07.Ch7_07_A;

public class Ch7_07_D extends Ch7_07_A { //Ch7_07_A클래스 상속
	
	/* 
	 * D클래스는 C클래스와 동일한 패키지에 선언
	 * A클래스 포함시키고 A클래스 상속받고
	 * 생성자를 선언해서 부모 클래스의 필드와 메소드에 접근 가능한지 확인
	 */
	
	Ch7_07_D(){
		super(); //Ch7_07_A클래스 생성자 호출
		this.name="칸타타";
		this.who();
	}
	
}
