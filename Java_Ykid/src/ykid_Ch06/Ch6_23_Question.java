package ykid_Ch06;

import java.util.Scanner;

public class Ch6_23_Question {
	
	Scanner scan = new Scanner(System.in);
	
	void solve(int k) {
		if(k==1) {
			System.out.println("두 점을 (X, Y) 순으로 입력해주세요.");
			System.out.print("첫번째 X좌표 :");
			double x1 = scan.nextDouble();
			System.out.print("첫번째 Y좌표 :");
			double y1 = scan.nextDouble();
			System.out.print("두번째 X좌표 :");
			double x2 = scan.nextDouble();
			System.out.print("두번째 Y좌표 :");
			double y2 = scan.nextDouble();
	
			double sdistance=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
			double distance = Math.sqrt(sdistance);
			System.out.println("두 점 사이의 거리는 "+distance+" 입니다.");
		}
		if(k==2) {
			System.out.println("정수를 입력해 주세요.");
			System.out.print(">>");
			int n = scan.nextInt();
			if(n<0) {
				System.out.println(n*(-1));
			}else {
				System.out.println(n);
			}
		}
	}
}
