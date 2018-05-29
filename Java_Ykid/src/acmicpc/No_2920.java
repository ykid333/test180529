package acmicpc;

import java.util.Scanner;

public class No_2920 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] C = new int[8];
		
		for(int i=0;i<8;i++) {
			int c=scan.nextInt();
			C[i]=c;
		}
		if(C[0]==1 && C[1]==2 && C[2]==3 && C[3]==4 && C[4]==5 && C[5]==6 &&
		   C[6]==7 && C[7]==8) {
			System.out.println("ascending");
		}else if(C[0]==8 && C[1]==7 && C[2]==6 && C[3]==5 && C[4]==4 && C[5]==3 &&
				   C[6]==2 && C[7]==1) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
	}
}
