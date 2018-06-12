package ykid_Ch05;

public class Ch5_AdvancedForExample {

	public static void main(String[] args) {
		/*
		 * 향상된 for문(foe each문)
		 */
		
		int []scores = {95, 85, 90, 66, 88};
		int sum=0;
		//for -each문
		for(int score : scores) {
			sum = sum + score;
			System.out.println(score);
		}
		System.out.println("정수 총합 : "+sum);
	}

}
