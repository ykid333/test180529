package ykid_Ch06;
import java.util.Scanner;
public class Ch6_10_CarExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Ch6_10_Car myCar = new Ch6_10_Car("포르쉐",30,300);
		/*String model= scan.next();
		int acc = scan.nextInt();
		int maxSpeed  = scan.nextInt();*/
		//Ch6_10_Car myCar = new Ch6_10_Car("포르쉐",acc,maxSpeed);
		//객체를 생성할 때 매개변수를 어떻게 전달했는가
		//String 한개=>생성자를 선언
		Ch6_10_Car yourCar = new Ch6_10_Car("아반떼", 15, 150);
		
		
		/*Ch6_10_Car myCar3 = new Ch6_10_Car();
		myCar3.model=scan.next();
		myCar3.acc=scan.nextInt();
		myCar3.maxSpeed=scan.nextInt();*/
		
		//메소드 호출
		//run()메소드 호출했을 때 어떤 결과가 나오는지
		
		myCar.run();
		System.out.println();
		yourCar.run();
		//myCar3.run();

	}

}
