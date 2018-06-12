package ykid_Ch02;

public class FloatDoubleExample {

	public static void main(String[] args) {
		
		/*
		 * 실수형 변수를 선언하는 타입 double(8 byte), float(4 byte)
		 * 자바는 기본 실수값을 double 타입으로 인지하기 때문에 float 타입의 변수에
		 * 실수를 담기 위해선 값의 끝에 F를 붙여야 함.
		 */
		double var1 = 3.14 ;
		//int var2 = 3.14 ;
		float var3 = 3.14F;
				
		double var7 = 3e6; //3x10^6
		float var8 = 3e6F;
		double var9 = 2e-3; //2x10^-3
		System.out.println("var1 :" + "더연결하면"+ var1);
		System.out.println("var3 :" + var3);
		System.out.println("var4 :" + var7);
		System.out.println("var8 :" + var8);
		System.out.println("var9 :" + var9);
		
	}

}
