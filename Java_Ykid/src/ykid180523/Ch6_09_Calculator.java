package ykid180523;

//method Overloading p.232
public class Ch6_09_Calculator {
	//정사각형의 넓이를  구하는 메소드
	//메소드 이름 : areaRectangle
	
	//직사각형의 넓이를 구하는 메소드
	
	int areaRectangle(int x, int y) {
		int result=x*y;
		return result;		
	}
	void execute(int x, int y) {
		
		double result = areaRectangle(x,y);
		println("직사각형의 넓이는 : "+result);
	}
	
	int areaRectangle(int x) {
		int result=x*x;
		return result;		
	}
	void execute(int x) {
		double result = areaRectangle(x);
		println("정사각형의 넓이는 : "+result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
	

}

//main 클래스의 실행내
/*
 * 객체생성해서
 * 정사각형 넓이 구하는 메소드 호출하고 결과 출력
 * 직사각형 넓이 구하는 메소드 호출하고 결과 출력
 */

