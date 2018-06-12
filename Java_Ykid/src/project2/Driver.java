package project2;

public class Driver extends Character{		//Character 클래스의 자식클래스
											//Driver 등록에 사용
	
	
	public Driver(String name, int driveskill, int sal, int payment) {
		this.name=name;				//드라이버 이름
		this.driveskill=driveskill;	//운전기술
		this.sal=sal;				//드라이버의 급여
		this.payment=payment;		//드라이버의 계약금
	}
	public void printDetail() {
		System.out.println("이름 : "+name+"\t운전기술 : "+driveskill+"\t급여 : "+sal+" \t계약금 : "+payment);
	}
	
}
