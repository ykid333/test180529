package ykid_Ch06;

public class Ch6_07_CarExample {
	
	public static void main(String[] args) {
		//car 클래스의 객체 생성
		Ch6_07_Car car = new Ch6_07_Car();
		
		//setGas 메소드 호출 배개변수 5
		car.setGas(5);
		System.out.println("gas 잔량 = "+car.gas);
		//isLeftGas 메소드 호출결과를 gasstate라는 변수에 담으세요.
		boolean gasstate = car.isLeftGas();
		if(gasstate) {
			System.out.println("출발합니다.");
			car.run();
		}
		System.out.println(car.gas);
		if(car.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}
		
		
	}

}
