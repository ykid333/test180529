package ykid_Ch15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//ArrayList 예제
public class Ch15_01_ArraylistExample {

	public static void main(String[] args) {
		//ArrayList 선언
		List<String> list = new ArrayList<String>();
		//<> : 제네릭(Generic) (번거로운 타입 변환을 제거해주는 역할)
		
		/*
		 * List list = new ArrayList();
		 * list.add("홍길동");
		 * Object obj = list.get(0);
		 * String name = (String)obj;
		 */
		/*list.add("홍길동");
		String name = list.get(0);
		System.out.println(name);*/
		
		//리스트객체에 데이터 저장하는 메소드 add()
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database");
		list.add("myBatis");
		
		int size = list.size();
		System.out.println(size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2번인덱스에 담긴 데이터 : " + skill);
		
		//list에 담긴 모든 내용을 반복문 이용하여 출력
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		//list에 담긴 데이터 삭제
		list.remove(2);//Datebse
		list.remove(2);//Servlet/JSP
		list.remove("JDBC");
		for(int m=0;m<list.size();m++) {
			System.out.println(list.get(m));
		}
		System.out.println();
		
	}

}
