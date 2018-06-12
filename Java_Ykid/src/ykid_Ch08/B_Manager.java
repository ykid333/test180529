package ykid_Ch08;

public class B_Manager extends B_Employee{
	
	protected double bonus;
	
	public B_Manager(String name, double salary, double bonus) {
		super(name, salary);
		this.bonus=bonus;
	}
	
	public double getBonus() {
		return bonus;
	}//
	
	@Override
	public void raiseSalary() {
		this.salary=this.salary*1.2;
	}

}
