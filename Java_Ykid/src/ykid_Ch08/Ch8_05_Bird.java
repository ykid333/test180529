package ykid_Ch08;

public class Ch8_05_Bird implements Ch8_05_Countable{
	
	String name;
	
	public Ch8_05_Bird(String name) {
		this.name=name;
	}
	@Override
	public void count() {
		System.out.println(name+"가  2마리 있다.");
		
	}
	
	public void fly() {
		System.out.println("2마리 "+name+"가 날아간다");

	}

}
