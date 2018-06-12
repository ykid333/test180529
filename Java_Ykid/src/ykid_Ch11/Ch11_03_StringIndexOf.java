package ykid_Ch11;

public class Ch11_03_StringIndexOf {

	public static void main(String[] args) {
		//indexOf() 메소드
		String subject = "자바 프로그래머";
		
		int location = subject.indexOf("프로그래머");
		System.out.println("location 값 : "+location);
		
		//length() 메소드
		int length =subject.length();
		System.out.println("length : "+length);
		
		//replace() 메소드
		String newStr = subject.replace("자바", "java");
		System.out.println(newStr);
		
		//substring() 메소드
		String ssn = "180531-3456789";
		String firstNum = ssn.substring(0, 6);
		String secondNum = ssn.substring(7);
		System.out.println("first 값 : "+firstNum);
		System.out.println("second 값 : "+secondNum);
		
		//toLowerCase(),toUpperCase() 메소드
		String str1 = "adCdefghijKLMnopQRStuvWxyZ";
		String strLower = str1.toLowerCase();
		String strUpper = str1.toUpperCase();
		System.out.println("strLower 값 : "+strLower);
		System.out.println("strUpper 값 : "+strUpper);
		
		
		//trim() 메소드
		String tel1 = "      02";
		String tel2 = "1234    ";
		String tel3 = "    5555     ";
		
		String tel = tel1.trim()+tel2.trim()+tel3.trim();
		System.out.println("tel 값 : "+tel);

		
		if(subject.indexOf("자바") !=-1) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련이 없는 책이군요");
		}
	}

}
