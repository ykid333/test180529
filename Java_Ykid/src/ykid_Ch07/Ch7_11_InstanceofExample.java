package ykid_Ch07;

public class Ch7_11_InstanceofExample {
	
	/*
	 * method의 매개변수 : Parent 클래스 타입의 변수 parent
	 */
	public static void method(Ch7_11_Parent parent) {
		//parent 변수가(Ch7_11_Child 클래스 타입인지?
		if(parent instanceof Ch7_11_Child) {
			//parent 변수를 Child 클래스 타입으로 강제 변환해서
			//Child 클래스 타입의 변수 child로 대입한다
			Ch7_11_Child child = (Ch7_11_Child) parent;
			System.out.println("method - Child로 변환 성공");
		}else {
			System.out.println("method - Child로 변환 실패");
		}
	}
	
	public static void method2(Ch7_11_Parent parent) {
		Ch7_11_Child child = (Ch7_11_Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {

		/*
		 * 객체 타입 확인을 위한 instanceof 연산자
		 * 강제타입변환이 가능한지 여부를 판단하기 위해 사용하는 연산자
		 */
		//Parent 타입의 변수를 선언해서 Child 객체를 대입
		//method1, 2, 각각 호출
		Ch7_11_Parent parent1 = new Ch7_11_Child();
		method(parent1);
		method2(parent1);
		
		//Parent 타입의 변수를 선언해서 Parent 객체를 대입
		//method1, 2, 각각 호출
		Ch7_11_Parent parent2 = new Ch7_11_Parent();
		method(parent2);
		method2(parent2);
		
	}


}
