package ykid_Ch06;

public class Ch6_22_MemberService {
	
	static final String mid = "yourid";
	static final String mpw = "12345";
	
	boolean login(String id, String pw) {
		if(id.equals(mid) && pw.equals(mpw)) {
			return true;
		}
		return false;
	}
	void logout(String id) {
		System.out.println(id+" 사용자가 로그아웃 되었습니다.");
	}

}
