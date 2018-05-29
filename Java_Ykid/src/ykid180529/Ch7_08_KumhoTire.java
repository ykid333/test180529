package ykid180529;

public class Ch7_08_KumhoTire extends Ch7_08_Tire{
	
	//필드
	//생성자
	public Ch7_08_KumhoTire(String location, int maxRotation) {
		super(location,maxRotation);
	}
	
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRtation;		//누적 회전수 1증가
		if(accumulatedRtation<maxRotation) {
			System.out.println(location + " KumhoTire 수명 : "+ (maxRotation-accumulatedRtation)+ " 회");
			return true;
		}else {
			System.out.println("*** "+ location + " HanKookTire 펑크 ***");
			return false;
		}
	}

} 

