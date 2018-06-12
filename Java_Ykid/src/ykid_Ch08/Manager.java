package ykid_Ch08;

public class Manager extends Employee {
	

	public int bonus;
	
	public Manager(String name, double sal, int bonus) {
		super(name, sal);
		this.bonus=bonus;
		
		
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	@Override
	public void salUp() {
		System.out.println(name+" 의 급여를 20% 인상합니다.");
		this.sal=sal*1.2;
		System.out.println(name+" 의 인상된 급여는 "+ sal+" 입니다.");
	
	}
}
