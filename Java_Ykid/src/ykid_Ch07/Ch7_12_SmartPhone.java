package ykid_Ch07;
//추상클래스를 상속받는 자식 클래스
public class Ch7_12_SmartPhone extends Ch7_12_Phone {
	public Ch7_12_SmartPhone(String owner) {
		super(owner);
	}
	
	//메소드 선언
	public void internetSerch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
