package ykid_Ch08;

public class Ch8_05_Birdabs extends Ch8_05_CountableAbs {

	public Ch8_05_Birdabs(String name, int num){
		super(name,num);
		
	}

	@Override
	void count() {
		System.out.println(name+"가  2마리 있다.");
		
	}
	public void fly() {
		System.out.println("2마리 "+name+"가 날아간다");

	}

}
