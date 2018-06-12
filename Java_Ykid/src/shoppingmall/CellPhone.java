package shoppingmall;

public class CellPhone extends Product {
	
	String carrier;
	
	public CellPhone(String pName, int price, String carrier) {
		this.pName=pName;
		this.price=price;
		this.carrier=carrier;
	}

	@Override
	public void printExtra() {
		System.out.println("통신사 : "+carrier);
	}

}
