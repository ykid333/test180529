package ykid_Ch11;

import java.util.Arrays;
import java.util.Collections;

public class Ch11_04_ArrayMethod {

	public static void main(String[] args) {
		//int[] score = {100,80,50};
		String[] score = {"나","가","다","a"};
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}
		
		System.out.println();
		//Arrays.sort(score);							//오름차순
		Arrays.sort(score, Collections.reverseOrder());	//내림차순

		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}

	}

}
