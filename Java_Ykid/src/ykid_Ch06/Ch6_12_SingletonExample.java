package ykid_Ch06;

public class Ch6_12_SingletonExample {

	public static void main(String[] args) {
		//일반적인 객체 생성하는 방식
		//Ch6_12_Singleton obj2 = new Ch6_12_Singleton();
		
		//싱글톤으로 선언한 클래스를 사용하는 방식
		Ch6_12_Singleton obj1 = Ch6_12_Singleton.getInstance();

	}

}
