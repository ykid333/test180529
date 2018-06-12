package project2;

public class Racing {		//경주대회 작성을 위한 클래스
	String name;			//대회이름
	int prize;				//대회상금
	int length;				//경기장길이
	
	public Racing(String name, int prize, int length){
		this.name=name;
		this.prize=prize;
		this.length=length;
	}
	public void printDetail() {
		System.out.println("대회이름 : "+name+"\t대회상금 : "+prize+"\t경주길이 : "+length);
	}
}
