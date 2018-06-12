package ykid_Ch05;

import java.util.Scanner;

public class Excercise5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[][] words= {
				{"chair", "의자"},
				{"desk", "책상"},
				{"water", "물"},
				{"monitor","모니터"},
				{"mouse","마우스"}
		};
		int count=0;
		for(int i=0;i<words.length;i++) {
			System.out.print("문제 "+(i+1)+" "+words[i][0]+"의 뜻은 무엇인가요?  ");
			
			String N = scan.next();
			if(words[i][1].equals(N)) {
				System.out.println("정답입니다.");
				count++;
			}else {
				System.out.println("오답입니다.");
			}
		}System.out.println("총 "+count+"개를 맞췄습니다." );
		System.out.println("정답률은 "+((double)(count)/(double)words.length)*100+"%입니다." );
	}
}


