package acmicpc;

import java.util.Scanner;

public class No_11721 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.next();
		int i=10;
		int length=N.length();
		while(true) {
			if(i<=length) {
			System.out.println(N.substring(i-10, i));
			}else {
			System.out.println(N.substring(i-10, length));
			break;
			}
			i=i+10;
		}
	}
}
