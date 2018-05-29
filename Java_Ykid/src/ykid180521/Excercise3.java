package ykid180521;

import java.util.Scanner;

public class Excercise3 {

	public static void main(String[] args) {
		/*
		 * 거스름돈 문제
		 * 어떤 금액을 입력하게 되면 각 동전이 몇 개씩 필요한지 출력 하는 문제
		 * 예를 들어
		 * 2680원 이면
		 * 500원 5개
		 * 100원 1개
		 * 50원 1개
		 * 10원 3개
		 */
		Scanner scan = new Scanner(System.in);
		/*int Money = scan.nextInt();
		int F = Money/500;
		int O = (Money%500);
		System.out.println("500원 "+F+" 개");
		System.out.println("100원 "+O/100+" 개");
		System.out.println("50원 "+(O%100)/50+" 개");
		System.out.println("10원 "+(O%100%50)/10+" 개");*/
		
		int[] coinUnit = {500, 100, 50, 10};
		
		System.out.println("얼마?");
		
		int change = scan.nextInt();
		
		for (int i=0;i<coinUnit.length;i++) {
			int coinCount=change/coinUnit[i];
			System.out.println(coinUnit[i]+"원 동전"+ coinCount+"개");
			
			change=change%coinUnit[i];
		}
	}
}
