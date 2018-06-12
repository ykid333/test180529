package ykid_Ch08;

public class Ch8_04_Tank implements Ch8_04_Car, Ch8_04_Cannon{

	@Override
	public void fire() {
		System.out.println("탱크가 대포를 발사합니다.");
	}

	@Override
	public void work() {
		System.out.println("탱크가 앞으로 전진합니다.");
		
	}

}
