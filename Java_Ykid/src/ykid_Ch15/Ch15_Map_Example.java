package ykid_Ch15;

import java.util.*;

//Map 예제
public class Ch15_Map_Example {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("학생1", 100);
		map.put("학생2", 90);
		map.put("학생3", 60);
		map.put("학생4", 80);
		map.put("학생5", 30);
		
		System.out.println("Map에 저장한 데이터 수 : "+map.size());
		
		
		//특정 데이터 찾기
		System.out.println(map.get("학생1"));
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + " : "+value);
		}
	}

}
