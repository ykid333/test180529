package ykid_Ch10;

public class Ch10_03_Numberformat {

	public static void main(String[] args) {
		//NumberformatException
		//문자열을 숫자로 변활 할때 발생하는 예외
		
		String data1 = "100";
		String data2 = "a100";
		
		//문자열을 숫자로 변환
		int value1 = Integer.parseInt(data1);
		System.out.println(value1);
		int value2 = Integer.parseInt(data2);
		System.out.println(value2);
		
		int result = value1 + value2;
		System.out.println(data1+"+"+data2+"+"+result);
		

	}

}
