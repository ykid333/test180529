package ykid_Ch15;

import java.util.*;

public class Ch15_Map_Ex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("apple", "사과");
		map.put("banana", "바나나");
		map.put("cherry", "체리");
		map.put("durian", "두리안");
		map.put("elderberry", "딱총나무 열매");
		
		System.out.print("영단어를 입력하세요 : ");
		String word = scan.next();
		int i=1;
		
		System.out.println(map.get(word));
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			String value = map.get(key);
			System.out.println(i+". "+key + " : "+value);
			i++;
		}
		
		
		
	}

}
