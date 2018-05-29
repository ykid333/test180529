package ykid180529;

public class Ch7_06_sportsCar extends Ch7_06_Car{
	
	
	/*@Override
	public void run() {
		System.out.println("스포츠카가 달립니다.");
		System.out.println(color+"색상의"+model+" 스포츠카가 달립니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("스포츠카가 멈춥니다.");
		System.out.println(color+"색상의"+model+" 스포츠카가멈춥니다.");
	}*/
	
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	@Override
	public void stop() {
		System.out.println("스포츠카가 멈춥니다.");
		speed=0;
	}
}
