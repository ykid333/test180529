package project2;

public class Engineer extends Character {	//Character 클래스의 자식클래스
											//engineer 등록에 사용
	
	public Engineer(String name, int mech, int sal,int payment) {
		this.name=name;			//엔지니어 이름
		this.mech=mech;			//엔지니어 기술
		this.sal=sal;			//엔지니어 급여
		this.payment=payment;	//엔지니어 계약금
	}
	public void printDetail() {
		System.out.println("이름 : "+name+"\t기술 : "+mech+"\t급여 : "+sal+"\t   계약금 : "+payment);
	}
}
