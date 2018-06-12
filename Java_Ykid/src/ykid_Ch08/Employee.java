package ykid_Ch08;

public class Employee {
	//A.직원의 이름 급여 정보를 가지고 있음
	//B.급여 인상에 대한 메소드를 가짐(인상률은10%)
	
	public String name;
	double sal;
	
	public Employee(String name, double sal) {
		this.name=name;
		this.sal=sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public void salUp() {
		System.out.println(name+" 의 급여를 10% 인상합니다.");
		this.sal=sal*1.1;
		System.out.println(name+" 의 인상된 급여는 "+ sal+" 입니다.");
	}
	
}
