package ykid180515;

public class Ch3_08_SrtongEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "양기두";
		String strVar2 = "양기두";
		//new 연산자 : 새로운 객체를 생성할 때 사용하는 연산자
		String strVar3 = new String("양기두");
		
		System.out.println( strVar1 == strVar2);
		System.out.println( strVar1 == strVar3);
		//false
		System.out.println();
		//.equals()
		System.out.println( strVar1.equals(strVar2));
		System.out.println( strVar1.equals("양기두"));
		System.out.println( strVar1.equals(strVar3));
	}

}
