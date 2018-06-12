package ykid_Ch08;

public class EmployeeExample {

	public static void main(String[] args) {
		Employee emp = new Employee("맥심",10000);
		Manager man = new Manager("카누",15000,1500);
		Executive exe = new Executive("티오피",20000,2000,false);
		
		System.out.println(emp.getName()+" 의 급여는 "+emp.getSal()+" 입니다.");
		System.out.println(man.getName()+" 의 급여는 "+man.getSal()+" 보너스는 "+man.getBonus()+ " 입니다.");
		System.out.println(exe.getName()+" 의 급여는 "+exe.getSal()+" 보너스는 "+exe.getBonus()
						   +" 스톡옵션은 "+exe.isStock());
		
		System.out.println();
		
		emp.salUp();
		System.out.println(emp.getName()+" 의 급여는 "+emp.getSal()+" 입니다.");
		System.out.println();

		man.salUp();
		System.out.println(man.getName()+" 의 급여는 "+man.getSal()+" 보너스는 "+man.getBonus()+ " 입니다.");
		System.out.println();

		exe.salUp();
		System.out.println(exe.getName()+" 의 급여는 "+exe.getSal()+" 보너스는 "+exe.getBonus()
		   +" 스톡옵션은 "+exe.isStock());

	}

}
