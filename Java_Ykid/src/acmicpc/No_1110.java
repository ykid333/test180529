package acmicpc;

import java.util.Scanner;

public class No_1110 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*int N = scan.nextInt();
		int num[]=new int[2];
		int temp;
		int count=1;
		int c=0;
		if(N<=10) {
			num[1]=N;
			num[0]=0;
		}else {
			num[0]=N/10;
			num[1]=N%10;
		}
		System.out.print(num[0]);
		System.out.println(num[1]);
		
		while(true) {
			if(num[0]+num[1]<10) {
				temp=num[0];
				num[0]=num[1];
				num[1]=temp+num[1];
			}else {
				temp=num[1];
				num[1]=(num[0]+num[1])%10;
				num[0]=temp;
				
			}
			System.out.print(num[0]);
			System.out.println(num[1]);
			c=(num[0]*10)+num[1];
			//System.out.println(c);
			if(c==N) {
				System.out.println("count : "+count);
				break;
			}
			count++;
		}*/
		int N = scan.nextInt();//N=78
		int M=N;
		int count=1;
		while(true) {
			int A = N/10;
			int B = N%10;
			N=(B*10)+((A+B)%10);
			if(M==N) {
				System.out.println(count);
				break;
			}
			count++;
		}
	}
}

