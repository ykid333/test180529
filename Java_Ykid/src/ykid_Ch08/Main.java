package ykid_Ch08;

public class Main {

	public static void main(String[] args) {
		SmartPhone smp = new  SmartPhone();
		
		smp.call();
		smp.reciveCall();
		smp.sendSms();
		smp.reciveSms();
		smp.play();
		smp.stop();
		System.out.println(smp.plus(5, 6));
	}

}
