package shoppingmall;

public class SmartTv extends Product {
	
	String resulution;
	
	public SmartTv(String pName, int price,String resulution) {
		this.pName=pName;
		this.price=price;
		this.resulution=resulution;
	}

	@Override
	public void printExtra() {
		System.out.println("해상도 : "+resulution);
	}
}

