package ykid180515;

public class Ch2_Promotionexample {

	public static void main(String[] args) {
		byte bytevalue = 10 ;
		int intValue = bytevalue ;
		//기존 byte 타입의 변수가 int 타입으로 자동 타입변환
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드는=" + intValue);
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);

	}

}
