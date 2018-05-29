package ykid180523;

public class Ch6_06_CalculatorExample {

	public static void main(String[] args) {
		// Calculator 객체생성
		//powerOn 메소드 호출
		//plus 메소드 호울(매개값은 알아서...) 및 호출 결과 출력.
		//divide 메소드 호울(매개값은 알아서...) 및 호출 결과 출력.
		//powerOff 메소드 호출
		
		Ch6_06_Calculator Cal = new Ch6_06_Calculator();
		
		Cal.powerOn();
		
		int re1=Cal.plus(6, 9);
		System.out.println("re1 : "+re1);
		
		
		int x=12;
		int y=7;
		double di1=Cal.divide(x, y);
		System.out.println(x+" 를 "+y+" 로 나눈 값은 " + di1);
		
		Cal.powerOff();

	}

}
