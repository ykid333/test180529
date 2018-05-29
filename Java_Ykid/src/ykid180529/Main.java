package ykid180529;

public class Main {

	public static void main(String[] args) {
		
		Sedan sedan = new Sedan("빨간색",200);
		Truck truck = new Truck("검정색",100,0);
		
		sedan.setSeatNum(10);
		sedan.speedUp(300);
		truck.setLoadage(15);
		truck.speedUp(3);
		
		System.out.println(sedan.color+" 승용차의 "+"속도는 "+sedan.speed+
				" 좌석수는  "+sedan.getSeatNum()+" 개 입니다.");
		System.out.println(truck.color+" 트럭의 "+"속도는 "+truck.speed+
				" 적재량은  "+truck.loadage+" 톤 입니다.");
		
	}

}
