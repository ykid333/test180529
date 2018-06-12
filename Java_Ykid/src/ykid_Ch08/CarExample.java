package ykid_Ch08;

public class CarExample {

	public static void main(String[] args) {
		Sedan sedan = new Sedan();
		Truck truck = new Truck();
		
		sedan.carry();
		truck.carry();
		
		sedan.information();
		truck.information();
	}

}
