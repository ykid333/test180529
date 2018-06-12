package ykid_Ch08;

public class Executive extends Manager{
	boolean stock;
	public Executive(String name, double sal, int bonus, boolean stock) {
		super(name, sal,bonus);
		this.stock=stock;
	}
	@Override
	public void salUp() {
		System.out.println(name+" 의 급여를 30% 인상합니다.");
		this.sal=sal*1.3;
		System.out.println(name+" 의 인상된 급여는 "+ sal+" 입니다.");
	}

	public String isStock() {
		if(stock) {
		
		return "있습니다";
		}
		
		return "없습니다.";
	}
	
	public void setStock(boolean stock) {
		this.stock = stock;
	}
	
	
}
