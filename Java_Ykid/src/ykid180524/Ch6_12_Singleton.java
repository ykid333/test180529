package ykid180524;
//싱글톤 예제 p.244
public class Ch6_12_Singleton {
	
	private static Ch6_12_Singleton singleton = new Ch6_12_Singleton();
	
	private Ch6_12_Singleton() {
		
	}
	
	static Ch6_12_Singleton getInstance(){
		return singleton;
	}
	
}
