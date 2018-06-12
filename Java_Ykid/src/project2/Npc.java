package project2;

public class Npc {		//경주에 참여하는 상대선수
	
	String name;		//선수이름
	String mname;		//기체이름
	int speed;			//기체속도
	public Npc(String name, String mname, int speed) {
		this.name=name;
		this.mname=mname;
		this.speed=speed;
	}
}
