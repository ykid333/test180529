package ykid_Ch11;

public class Ch11_01_StringCharAt {
	public static void main(String[] args) {
		//charAt()메소드
		String ssn = "180531-456789";
		char gender = ssn.charAt(7);
		
		switch(gender) {
			case '1':
				System.out.println("남자입니다. ");
				break;
			case '2':
				System.out.println("여자입니다. ");
				break;
			case '3':
				System.out.println("남자입니다. ");
				break;
			case '4':
				System.out.println("여자입니다. ");
				break;
			default :
				System.out.println("중성입니다.");
			}
		
		}

}
