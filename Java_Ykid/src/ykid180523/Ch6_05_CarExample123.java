package ykid180523;

public class Ch6_05_CarExample123 {

	public static void main(String[] args) {
		Ch6_05_Car myCar = new Ch6_05_Car("그랜저");
		Ch6_05_Car myCar2 = new Ch6_05_Car("그랜저","빨강");
		Ch6_05_Car myCar3 = new Ch6_05_Car("그랜저","빨강",400);
		
		System.out.println(myCar.model);
		System.out.println(myCar2.model+myCar2.color);
		

	}

}
