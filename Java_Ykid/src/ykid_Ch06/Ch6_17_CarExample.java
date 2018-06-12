package ykid_Ch06;

public class Ch6_17_CarExample {
	
	public static void main(String[]args) {
		Ch6_17_Car car = new Ch6_17_Car();
			
			//setter를 호출하여 속도 값을 설정
			car.setSpeed(100);
			
			System.out.println("현재속도 : "+car.getSpeed());
			
			if(!car.isStop()) {
				car.setStop(true);
			}
			
			System.out.println("현재속도 : "+car.getSpeed());
		
	}

}
