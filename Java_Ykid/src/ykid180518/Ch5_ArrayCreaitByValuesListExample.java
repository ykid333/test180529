package ykid180518;

public class Ch5_ArrayCreaitByValuesListExample {

	public static void main(String[] args) {
		/*
		 * 
		 * 배열선언 : int 타입의 score라는 배열 변 수 선언
		 * int[] score
		 */
		 int[] scores = {83,90,87};
		 
		 //배열 값 접근(출력)
		 
		 System.out.println("scores [0]의 값 : "+scores[0]);
		
		 //배열 요소들의 합 구하기
		 int sum=0;
		 for(int i=0; i<=2;i++) {
			 sum = sum + scores[i];
		 }
		 System.out.println("총합  = "+sum);
		 double avg = sum/scores.length;
		 System.out.println("평균  = "+avg);
	}

}
