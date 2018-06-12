package ykid_Ch10;

public class Ch10_01_NullPointer {

	public static void main(String[] args) {
		/*try {
			String data = null;
			System.out.println("예외발생 전..................");
			System.out.println(data.toString());
			System.out.println("예외발생 전..................");
			System.out.println(data);
		}catch(NullPointerException e) {
			System.out.println("예외가 발생 했으니 코드를 확인해 봄");
		}*/
		
		try {
			/*int[] asdf = new int[2];
			System.out.println("어디냐0000000000000000");
			asdf[3]=1;*/
			System.out.println("어디냐1111111111111111");
			String data1 = args[0];
			System.out.println("어디냐2222222222222222");
			String data2 = args[1];
			
			System.out.println("data1 : "+args[0]);
			System.out.println("data2 : "+args[1]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외가 발생 했으니 코드를 확인해 봄");
		}finally {
			System.out.println("finally는 무조건 실행됩니다.");
		}
	}

}
