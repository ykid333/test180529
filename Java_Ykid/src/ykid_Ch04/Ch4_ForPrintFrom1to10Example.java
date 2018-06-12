package ykid_Ch04;

public class Ch4_ForPrintFrom1to10Example {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=10;i++) {
			System.out.print(i+" 번째 i 값은 "+i+"    ");
			sum += i; 
			System.out.println("1 에서 "+i+" 까지 합은 "+sum);
		}
		System.out.println(sum);
	}

}
