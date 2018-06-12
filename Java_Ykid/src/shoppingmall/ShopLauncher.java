package shoppingmall;
//쇼핑몰을 실행하기 위한 메인 메소드 클래스
public class ShopLauncher {

	public static void main(String[] args) {
		IShop shop = new myShop();
		shop.setTitle("myShop");
		shop.genUser();
		shop.genProduct();
		shop.start();
	}

}
