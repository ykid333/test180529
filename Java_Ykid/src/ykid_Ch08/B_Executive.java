package ykid_Ch08;

public class B_Executive extends B_Manager {
	
	protected double stockOption;
	
	//생성자 선언
	public B_Executive(String name, double salary, double bonus,double stockOption) {
		super(name, salary,bonus);
		this.stockOption=stockOption;
	}
	//스톡옵션 반환용 메소드
	public double getStockOption() {
		return stockOption;
	}
	//급여 인상을 위한 메소드
	@Override
	
	public void raiseSalary() {
		
		this.salary=salary*1.3;
		
	}
}
