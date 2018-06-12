package ykid_Ch08;

public class Ch8_05_CountableTest {

	public static void main(String[] args) {
		Ch8_05_Countable[] a = {new Ch8_05_Bird("뻐꾸기"), new Ch8_05_Bird("독수리"),
								new Ch8_05_Tree("사과나무"), new Ch8_05_Tree("밤나무")};
		/*
		 * a[0] = new Ch8_05_Bird("뻐꾸기")
		 * a[1] = new Ch8_05_Bird("독수리")
		 * a[2] = new Ch8_05_Tree("사과나무")
		 * a[3] = new Ch8_05_Tree("밤나무")
		 */
		for (Ch8_05_Countable e :a)
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
			if(a[i] instanceof Ch8_05_Bird) {
				((Ch8_05_Bird) a[i]).fly();//Bird클래스 타입으로 강제 형변환 해서 fly()호출
			}else {
				((Ch8_05_Tree) a[i]).ripe();//Tree클래스 타입으로 강제 형변환 해서 ripe()호출
			}
			
		}
		
		}

	}

/*
 * 출력문
 * 뻐구기가 2마리 있다.
 * 독수리가 2마리 있다
 * 사과나무가 5그루 있다
 * 밤나무가 5그루 있다
 * 2마리 뻐꾸기가 날아간다
 * 2마리 독수리가 날아간다
 * 사과나무에 열매가 잘 익었다
 * 밤나무에 열매가 잘 익었다
 */

