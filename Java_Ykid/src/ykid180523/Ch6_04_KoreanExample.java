package ykid180523;

public class Ch6_04_KoreanExample {

	public static void main(String[] args) {
		//본인의 이름과 주민번호 앞자리로 k1, k2 객체를 각각 생성해서
		//필드값을 출력해보시오
		
		Ch6_04_Korean k1 = new Ch6_04_Korean("양기두","1");
		Ch6_04_Korean k2 = new Ch6_04_Korean("양기두","2");
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		System.out.println(k2.nation);
		System.out.println(k2.name);
		System.out.println(k2.ssn);
	}	

}
