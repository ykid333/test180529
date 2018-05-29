package ykid180523;
//생성자 Overloading 예제
public class Ch6_05_CarExample {

	public static void main(String[] args) {
		//1. 기본 생성자를 이용한 객체 생성하여 필드값 출력
		
		//2. model 매개변수 갖는 생성자를 이용한 객체 생성하여 필드값 출력.
		//3. model,color 매개변수 갖는 생성자를 이용한 객체 생성하여 필드값 출력.
		//4. model,color,maxSpeed 매개변수 갖는 생성자를 이용한 객체 생성하여 필드값 출력.
		
		Ch6_05_Car myCar = new Ch6_05_Car();
		Ch6_05_Car myCar2 = new Ch6_05_Car("그랜저");
		Ch6_05_Car myCar3 = new Ch6_05_Car("아반떼","흰색");
		Ch6_05_Car myCar4 = new Ch6_05_Car("다마스","빨강",400);
		
		System.out.println(myCar.company +"  "+ myCar.model+"  " + myCar.color+"  " + myCar.maxSpeed);
		System.out.println(myCar2.company +"  "+ myCar2.model+"  " + myCar2.color+"  " + myCar2.maxSpeed);
		System.out.println(myCar3.company +"  "+ myCar3.model+"  " + myCar3.color+"  " + myCar3.maxSpeed);
		System.out.println(myCar4.company +"  "+ myCar4.model+"  " + myCar4.color+"  " + myCar4.maxSpeed);
		
		

	}

}
