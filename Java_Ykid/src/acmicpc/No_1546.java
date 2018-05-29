package acmicpc;

import java.util.Scanner;

public class No_1546 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		double[] arr = new double[N];
		double max=0;
		double sum=0;
		int i=0;
		for(i=0;i<N;i++) {
			arr[i]=scan.nextInt();
			max=max>arr[i]?max:arr[i];
		}
		for(i=0; i<arr.length;i++) {
		arr[i]=arr[i]/max*100;
		sum=sum+arr[i];
		}
		System.out.printf("%.2f\n", sum/N);
		


	}

}
