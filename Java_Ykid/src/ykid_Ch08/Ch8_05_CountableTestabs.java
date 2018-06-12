package ykid_Ch08;

public class Ch8_05_CountableTestabs {

	public static void main(String[] args) {
		Ch8_05_CountableAbs[] a = {new Ch8_05_Birdabs("뻐꾸기",5), new Ch8_05_Birdabs("독수리",2),
				new Ch8_05_Treeabs("사과나무",5), new Ch8_05_Treeabs("밤나무",3)};
		
		for (Ch8_05_CountableAbs e :a)
			/*
			 * 첫번째 반복문
			 * e = a[0]
			 * 	 = new Ch8_05_Bird("뻐꾸기")
			 * 뻐꾸기를 매개변수로 하는 Bird의 객체를 생성해서 e에 대입
			 * 
			 * 두번재 반복문
			 * ...
			 */
			e.count();
			
		for(int i = 0; i< a.length;i++) {
			//타입에 따라 Fly() 또는 rlpen()메소드를 호출 => instanceof 사용
			//조건문을 이용해서 배열에 저장한 각 요소가 Bird클래스 타입인지 확인
			if(a[i] instanceof Ch8_05_Birdabs) {
				((Ch8_05_Birdabs) a[i]).fly();//Bird클래스 타입으로 강제 형변환 해서 fly()호출
			}else {
				((Ch8_05_Treeabs) a[i]).ripe();//Tree클래스 타입으로 강제 형변환 해서 ripe()호출
			}
			
		}
		
		}

	

	}


