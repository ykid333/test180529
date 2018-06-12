package project;

public abstract class Player {
	
	String name;
	int num;
	
	public void printDetail() {
		if(num==0) {
			System.out.print("[투수]  ");
		}else {
			System.out.print("[ "+num+" ] 번  ");
		}
		System.out.println(name);
		//printExtra();
	}
	
	//public abstract void printExtra();

}
