package ykid_Ch06;

import java.util.Scanner;

public class Student {
	Scanner scan = new Scanner(System.in);
	
	int sum=0;
	int avg=0;
	int []scores = new int[3];
	
	String name;
	int kscore;
	int escore;
	int	mscore;
	
	void result() {
		while(true){
			System.out.println("이름을 입력하세요 : ");
			System.out.print(">");
			stu.name = scan.next();
			name[i] = stu.name;
			System.out.println("국어를 입력하세요 : ");
			System.out.print(">");
			stu.kscore=scan.nextInt();
			
			System.out.println("영어를 입력하세요 : ");
			System.out.print(">");
			stu.escore=scan.nextInt();
			
			System.out.println("수학을 입력하세요 : ");
			System.out.print(">");
			stu.mscore=scan.nextInt();
			
			sum=stu.kscore+stu.escore+stu.mscore;
			avg=sum/3;
			scores[i]=sum;
			avgscores[i]=avg;
			i++;
			if(i==3) {
				break;
			}
		}
		System.out.println(name[0]+"의 평균 점수는 : "+ avgscores[0]);
		System.out.println(name[1]+"의 평균 점수는 : "+ avgscores[1]);
		System.out.println(name[2]+"의 평균 점수는 : "+ avgscores[2]);
		
		for(int j=0;j<avgscores.length;j++) {
			for(int k=j+1;k<avgscores.length;k++) {
				if(avgscores[j]>avgscores[k]) {
					temp=avgscores[j];
					avgscores[j]=avgscores[k];
					avgscores[k]=temp;
				}
				
			}
		}
		for(int n=0; n<avgscores.length;n++) {
			System.out.println(avgscores[n]);
		}
		
	}
}
