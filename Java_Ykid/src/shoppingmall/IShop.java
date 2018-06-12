package shoppingmall;
//쇼핑몰의 기본 구조를 정의한 인터페이스
public interface IShop {
	//추상메소드 선언
	
	//쇼핑몰의 이름
	public void setTitle(String title);
	//사용자 등록
	public void genUser();
	//상품 등록
	public void genProduct();
	//쇼핑몰 실행
	public void start();
}
