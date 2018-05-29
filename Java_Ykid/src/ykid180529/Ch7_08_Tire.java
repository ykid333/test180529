package ykid180529;

public class Ch7_08_Tire {
	
	//필드
	public int maxRotation;			//최대 회전수(타이어 수명)
	public int accumulatedRtation;	//누적 회전수
	public String location;			//타이어 위치
	
	//생성자
	public Ch7_08_Tire(String location, int maxRotation) { //(타이어 위치, 최대 회전수)변수로 갖는 생성자
		this.location = location;
		this.maxRotation=maxRotation;
	}
	
	//메소드
	public boolean roll() {									//1회전 하는 메소드	
		++accumulatedRtation;								//누적 회전수 1증가
		if(accumulatedRtation<maxRotation) {				//누적 회전수<최대회전수 일 경우
			System.out.println(location + " Tire 수명 : "+ (maxRotation-accumulatedRtation)+ " 회");
			return true;
		}else {												//누적 회전수가 최대 회전수 이상일 경우
			System.out.println("*** "+ location + " Tire 펑크 ***");
			return false;
		}
	}

}
