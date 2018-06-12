package ykid_Ch04;

import java.util.Scanner;

public class Ch4_ForMultipleicationTableExample {

	public static void main(String[] args) {
		
		
		for(int i=1; i<=9; i++) {
			System.out.println();
			for(int j=2;j<=9;j++) {
				System.out.print(j+" * "+i +" = " + i*j);
				System.out.print("\t");
			}
			
			
		}

	}

}
