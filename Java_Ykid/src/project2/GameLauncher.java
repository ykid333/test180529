package project2;

import java.util.Scanner;

public class GameLauncher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("게임을 선택하세요. ");
			System.out.println("[1] 레이싱팀게임");
			System.out.println("[2] 종료");
			System.out.print("선택.>>");
			int gsel = scan.nextInt();
			switch (gsel) {
			case 1:
				RacingDevGame rdg=new PlayGame();
				rdg.driver();
				rdg.engineer();
				rdg.machine();
				rdg.npc();
				rdg.racing();
				rdg.fstart();
				break;
			case 3:
				System.out.println("종료합니다.");
				System.exit(0);
			}
		}

	}

}
