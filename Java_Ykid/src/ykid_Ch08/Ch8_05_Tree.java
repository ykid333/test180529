package ykid_Ch08;

public class Ch8_05_Tree implements Ch8_05_Countable {
	String name;
	public Ch8_05_Tree(String name) {
		this.name=name;
	}

	@Override
	public void count() {
		System.out.println(name+" 가 5그루 있다.");
		
	}
	
	public void ripe() {
		System.out.println(name+"에 열매가 잘 익었다.");
	
	}
}
