package ykid180525;

import java.util.Scanner;

public class Ch6_22_MemberServiceExample {
	
	public static void main(String[] args) {
		Ch6_22_MemberService memberService = new Ch6_22_MemberService();
		
		Scanner scan = new Scanner(System.in);
		String id = null;
		String pw;
		while(true) {
			System.out.println();
			System.out.println("사용할 서비스를 선택해주세요.");
			System.out.println("1.로그인 || 2. 로그아웃  || 3. 종료");
			System.out.print(">");
			int select = scan.nextInt();
			
			switch (select) {
			case (1):
				System.out.print("id를 입력하세요 : "); //yourid
				id = scan.next();
				System.out.print("pw를 입력하세요 : "); //12345
				pw = scan.next();
				boolean result = memberService.login(id, pw);
				if(result) {
					System.out.println("로그인 되었습니다.");
				}else {
					System.out.println("id 또는 password가 올바르지 않습니다.");
					id=null;
				}
				break;
			case (2):
				if(id==null) {
					System.out.println("로그인한 사용자가 없습니다.");
				}else {
				memberService.logout(id);
				}
			}
			if(select==3) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
		
	}

}
