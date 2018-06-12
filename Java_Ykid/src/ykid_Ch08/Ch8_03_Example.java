package ykid_Ch08;

public class Ch8_03_Example {

	public static void main(String[] args) {
		
		Ch8_03_ImplementationC impl = new Ch8_03_ImplementationC();
		
		Ch8_03_InterfaceA ia = impl;
		ia.methodA();
		
		Ch8_03_InterfaceB ib = impl;
		ib.methodB();
		
		Ch8_03_InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}
