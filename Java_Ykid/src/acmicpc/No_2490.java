package acmicpc;

import java.util.Scanner;

public class No_2490 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] S = new int[3];
		for (int i=0;i<3;i++) {
			int sum=0;
			int count=1;
			
			while(true) {
				int N = scan.nextInt();
				sum=sum+N;
				if(count==4) {
					break;
				}
				count++;
			}
			S[i]=sum;
			
		}
		for (int j=0;j<3;j++) {
			if(S[j]==0) {
				System.out.println("D");
			}else if(S[j]==1) {
				System.out.println("C");
			}else if(S[j]==2) {
				System.out.println("B");
			}else if(S[j]==3){
				System.out.println("A");
			}else {
				System.out.println("E");
			}
		}
	}

}
