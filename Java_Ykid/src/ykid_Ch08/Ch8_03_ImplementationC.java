package ykid_Ch08;

public class Ch8_03_ImplementationC implements Ch8_03_InterfaceC{

	@Override
	public void methodA() {
		//interfaceA의 메소드
		System.out.println("Ch8_03_ImplementationC.methodA() 실행");
	}

	@Override
	public void methodB() {
		//interfaceB의 메소드
		System.out.println("Ch8_03_ImplementationC.methodB() 실행");
	}

	@Override
	public void methodC() {
		//interfaceC의 메소드
		System.out.println("Ch8_03_ImplementationC.methodC() 실행");
	}

}
