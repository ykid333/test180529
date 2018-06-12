package ykid_Ch06;

import java.util.Scanner;

class Ch6_23_QuestionExample {

	public static void main(String[] args) {
		
		Ch6_23_Question question = new Ch6_23_Question();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println();
			System.out.println("수행할 내용을 선택해주세요.");
			System.out.println("1.두점 사이의 거리 구하기\n2.절대값 구하기\n3.종료");
			System.out.print(">");
			int select = scan.nextInt();
			
			question.solve(select);
			
			if(select==3) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
	}
}




