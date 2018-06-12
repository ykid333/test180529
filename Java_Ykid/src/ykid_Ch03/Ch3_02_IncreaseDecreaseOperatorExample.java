package ykid_Ch03;

public class Ch3_02_IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-------------------");
		x++; //x=10
		//x=11
		++x; //x=11+1=12
		System.out.println("x = " + x);
		
		System.out.println("-------------------");
		y--; //y=10
		//y=9
		--y; //y=9-1
		System.out.println("y = " + y);
		
		System.out.println("-------------------");
		z = x++; //z=12 x=12 x가 가지고 있는 값을 z에 대입 후 x값을 1 증가시킴
		//z에 12를 대입하고 x=13이 된다
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("-------------------");
		z = ++x; //z=14 x=13+1
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("-------------------");
		z = ++x + y++; //z= 15 + 8 =23 x=14+1 y=8
		//y=9
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}

}
