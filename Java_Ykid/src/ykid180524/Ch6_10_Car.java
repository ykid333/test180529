package ykid180524;

import java.util.Scanner;

public class Ch6_10_Car {
	Scanner scan = new Scanner(System.in);
	
	String model;
	int acc;
	int maxSpeed;
	
	Ch6_10_Car(){
		
	}
	
	Ch6_10_Car(String model, int acc, int maxSpeed){
		this.model=model;
		this.acc=acc;
		this.maxSpeed=maxSpeed;
	}
	
	void run() {
		
		int sum=10;
		
		while(true) {
			System.out.println(model+ "가 달립니다."+"(시속 : "+sum+" km/h)");
			sum = sum + acc;
			if(sum>maxSpeed) {
				System.out.println(model+"의 최고속도 입니다."+"(시속 : "+maxSpeed+" km/h)");
				break;
			}
		}
		/*for(int i =1;i<=5;i++) {
			System.out.println(model+ "가 달립니다."+"(시속 : "+sum+" km/h)");
			sum = sum + acc;
		}*/
	}
}
