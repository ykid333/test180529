package ykid_Ch15;

import java.util.*;

public class Ch15_ArrayList_Ex {

	public static void main(String[] args) {
		/*
		 * 5명의 이름을 영어로 입력 받아 ArrayList에 저장하고,
		 * 입력된 이름을 모두 출력하고,
		 * 입력된 이름 중 가장 긴 이름을 출력하시오
		 */
		
		Scanner scan = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		
		for(int i=0;i<5;i++) { //이름 입력 받기
			System.out.print(i+1+" 번 학생의 이름을 입력하세요 : ");
			String name = scan.next();
			list.add(name);
		}
		for(int j=0;j<list.size();j++) {//전체 이름 출력
			System.out.println(j+1+" 번 "+list.get(j));
		}
		String L = null;
		for(int k=1;k<list.size();k++) {
			if(list.get(k-1).length()<list.get(k).length()) {
				L=list.get(k);
			}else {
				L=list.get(k-1);
			}
		}
		System.out.println("이름이 가장 긴 학생은 : "+L);
		
		/*int ln=0;
		for(int k=1;k<list.size();k++) {
			if(list.get(ln).length()<list.get(k).length()) {
				ln=k;
			}
		}
		System.out.println("이름이 가장 긴 학생은 : "+list.get(ln));*/
		
		
	
		
		
	}

}
