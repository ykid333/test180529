package shoppingmall;

//상품 정의를 위한 추상클래스
public abstract class Product {
	//필드선언
	String pName;
	int price;
	
	//상품의 구체적 정보 출력을 위한 메소드
	public void printDetail() {
		System.out.print("상품명 : "+pName+", ");
		System.out.print("가격 : "+price+", ");
		printExtra();
	}
	
	//상품명, 가격정보 이외의 추가 정보 출력을 위한 메소드
	public abstract void printExtra();
}
