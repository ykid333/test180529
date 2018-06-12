package project2;

public class Machine {
	String name;		//기체이름
	int speed;			//기체속도
	int devMoney;		//개발비용
	int time;			//개발 시간
	
	public Machine(String name,int speed,int devMoney, int time) {
		this.name=name;
		this.speed=speed;
		this.devMoney=devMoney;
		this.time=time;
	}
	public void printDetail() {
		System.out.println(name+"\t속도 : "+speed+"\t개발비 : "+devMoney+"\t개발시간 : "+time);
	}
}
