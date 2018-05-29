package acmicpc;

import java.util.Scanner;

public class No_10871 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();
		
		int num;
		//int[] b = null;
		int i=0;
		do {
			num = scan.nextInt();
			//num = b[i];
			i++;
			 if(num<X) {
				 System.out.print(num+" ");
			 }
		} while( ! (N==i));
		
		scan.close();
		//System.out.println(b);
	}

}
