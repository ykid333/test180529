package ykid180517;

import java.util.Scanner;

public class Ch4_Example {

	public static void main(String[] args) {
		/*
		 * 문제 1+(-2)+3+(-4)+.........형태로 더했을 때 
		 * 얼마까지 더했을 때 총합이 100이상이 되는지 구해보시오.
		 * //무한 반복문
		 * */
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();    //N에 100 넣음
		int sum=0;
		int num=1;
		int i=1;
		int j=1;
		
		while(true) {
			sum=sum+num;
			if(sum>=N) {
				break;
			}
			i++;
			j=-j;
			num=j*i;
		}
			System.out.println(i);
		/*do {
			sum=sum+num;
			i++;
			j=-j;
			num=j*i;
			System.out.println("$$$$"+sum);
			System.out.println(num);
		
		} while( ! (sum>=N));
		
		System.out.println(i-1);*/
		scan.close();
		}
	}


