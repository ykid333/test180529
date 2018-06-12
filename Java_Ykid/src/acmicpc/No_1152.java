package acmicpc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No_1152 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*String N = scan.next();
		
		int num = N.indexOf("Button");
		System.out.println(num);
		
		
		//indexOf() 메소드
		String subject = "자바 프로그래머 자바 프로그래머  ";
				
		int location = subject.indexOf("프로그래머");
		System.out.println("location 값 : "+location);
				
		//length() 메소드
		int length =subject.length();
		System.out.println("length : "+length);
				
		//replace() 메소드
		String newStr = subject.replace("자바", "java");
		System.out.println(newStr);		
		*/
		List<String> list = new ArrayList<String>();
		
		int i=0;
		int size=0;
		while(true) {
			
			String str = scan.next();
			list.add(str);
			
			if(i>list.size()) {
				break;
			}
			System.out.println(list.size());
			
			i++;
			
			
		}
		
	}

}
