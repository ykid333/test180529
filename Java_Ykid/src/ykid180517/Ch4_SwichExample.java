package ykid180517;

public class Ch4_SwichExample {
	
	public static void main(String[] args) {
		
		int num = (int)(Math.random()*6)+1;
		switch(num) {
		case 1: //num==1인 경우
			System.out.println("1번 나왔습니다.");
			break;
		case 2: //num==2인 경우
			System.out.println("2번 나왔습니다.");
			break;
		case 3: //num==3인 경우
			System.out.println("3번 나왔습니다.");
			break;
		case 4: //num==4인 경우
			System.out.println("4번 나왔습니다.");
			break;
		case 5: //num==5인 경우
			System.out.println("5번 나왔습니다.");
			break;
		default: //case가 없는 경우
			System.out.println("6번 나왔습니다.");
			break;
		
		}
	}

}
