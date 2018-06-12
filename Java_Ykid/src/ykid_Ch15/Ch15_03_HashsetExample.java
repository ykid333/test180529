package ykid_Ch15;

import java.util.*;

public class Ch15_03_HashsetExample {

	public static void main(String[] args) {
		Set<String> set= new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Database");
		set.add("myBatis");
		
		int size = set.size();
		System.out.println("Set에 담긴 총 데이터 수 : "+size);
		
		//Set에 들어있는 모든 데이터 가져오기
		//반복자(Iterator) 사용
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		
		set.remove("JDBC");
		
		//set에 있는 내용을 전체 삭제
		set.clear();
		//비어있는지 확인
		set.isEmpty();

	}

}
