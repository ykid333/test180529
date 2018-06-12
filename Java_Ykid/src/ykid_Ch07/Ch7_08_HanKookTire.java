package ykid_Ch07;

public class Ch7_08_HanKookTire extends Ch7_08_Tire{
	
	//필드
	//생성자
	public Ch7_08_HanKookTire(String location, int maxRotation) {   //(타이어 위치, 최대회 전수)
		super(location,maxRotation); //부모 클래스의 생성자 호출
	}
	
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRtation;		//누적 회전수 1증가
		if(accumulatedRtation<maxRotation) {
			System.out.println(location + " HanKookTire 수명 : "+ (maxRotation-accumulatedRtation)+ " 회");
			return true;
		}else {
			System.out.println("*** "+ location + " HanKookTire 펑크 ***");
			return false;
		}
	}

}
