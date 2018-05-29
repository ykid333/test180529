package ykid180528;

public class Ch7_04_supersonicAirplaneExample {

	public static void main(String[] args) {
		
		Ch7_04_supersonicAirplane sa = new Ch7_04_supersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flymode=Ch7_04_supersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flymode=Ch7_04_supersonicAirplane.NORMAL;
		sa.fly();
		sa.land();

	}

}
