package ykid_Ch06;

public class Ch6_02_CarExample {

	public static void main(String[] args) {
		//Car 클래스 객체 선언
		Ch6_02_Car myCar = new Ch6_02_Car();
		//Car 클래스 에서 선언한 필드 값을 출력해보세요.
		System.out.println("Car 클래스의 company 필드값 : "+ myCar.company);
		System.out.println("Car 클래스의 model 필드값 : "+ myCar.model);
		System.out.println("Car 클래스의 color 필드값 : "+ myCar.color);
		System.out.println("Car 클래스의 maxSpeed 필드값 : "+ myCar.maxSpeed);
		System.out.println("Car 클래스의 speed 필드값 : "+ myCar.speed);
		
		myCar.company = "페라리";
		System.out.println("myCar의 company : "+ myCar.company);

	}

}
