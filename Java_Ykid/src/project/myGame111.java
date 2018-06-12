package project;

import java.util.*;

public class myGame111 implements BaseballGame{
	
	public static int total=0; //아웃카운트를 세기 위한
	
	MyTeam[] batters = new MyTeam[2];

	yourTeam[] pitchers = new yourTeam[2];
	
	ArrayList<yourTeam> cart = new ArrayList<yourTeam>();
	
	Scanner scan = new Scanner(System.in);
	
	int selBat;
	int selPit;
	
	@Override
	public void myTeam() {
		MyTeam batter = new MyTeam(5,"양의지");
		batters[0]=batter;
		batter = new MyTeam(2,"김현수");
		batters[1]=batter;
		
	}

	@Override
	public void otherTeam() {
		yourTeam pitcher = new yourTeam(3,"샘슨");
		pitchers[0]=pitcher;
		pitcher = new yourTeam(2,"김");
		pitchers[1]=pitcher;
		
	}

	@Override
	public void start() {
		
		System.out.println("메인화면 - 타자선택");
		System.out.println("=======================");
		int i=0;
		for(MyTeam b : batters) {
			System.out.print("["+(i++)+"]");
			b.printDetail();
		}
		System.out.println("[x]종료");
		System.out.print("선택 : ");
		String bsel = scan.next();
		System.out.println("## "+bsel + "선택 ##");
		switch(bsel) {
		case "x" : System.exit(0);
		break;
		default :
			selBat = Integer.parseInt(bsel);
			pitcherList();
	}
		
	}
	public void pitcherList() {
		System.out.println("투수목록 - 투수선택");
		System.out.println("=======================");
		int i=0;
		for(yourTeam p : pitchers) {
		System.out.print("["+(i++)+"]");
		p.printDetail();
		}
		System.out.println("[h]메인화면");
		System.out.println("[s]게임시작");
		System.out.print("선택 : ");
		String pisel = scan.next();
		System.out.println("## "+pisel + "선택 ##");
		switch(pisel) {
			case "h" : start();
			break;
			case "s" : game();
			break;
			default :
				selPit = Integer.parseInt(pisel);
				cart.add(pitchers[selPit]);
				pitcherList();
			
	}
}
	public void game() {
		System.out.println("게임시작");
		System.out.println("=======================");
		int count=0;
		int num=0;
		System.out.println("선택한 타자 : "+batters[selBat].name);
		
			System.out.println("상대할 투수");
			System.out.println("["+(selPit)+"]"+pitchers[selPit].num+"번, "+pitchers[selPit].name+", 피안타율 : "+pitchers[selPit].control);
			
		while (true) {
			num = (int)(Math.random()*(pitchers[selPit].control*10)) + 1;
			System.out.println("==================");
			System.out.println("투수가 공을 던졌다. "+num);
			System.out.println("어느쪽으로 방망이를 휘두를까");
			//System.out.println("1에서"+(int)(pitchers[selPit].control*10)+"중 숫자 하나를 고르세요.");
			System.out.println("1.왼쪽 2.중앙 3.오른쪽");
			int b = scan.nextInt();
			
			switch (num) {
			case (1):
				System.out.println("투수는 왼쪽으로 공을 던졌다.");
				if(num==b) {
					System.out.println("맞았다.");
					System.out.println("안타");
					break;
				}else {
					count++;
					System.out.println(count + "스트라이크");
					break;
				}
				
			case (2):
				System.out.println("투수는 중앙으로 공을 던졌다.");
			if(num==b) {
				System.out.println("맞았다.");
				System.out.println("안타");
				break;
			}else {
				count++;
				System.out.println(count +"스트라이크");
				break;
			}
			case (3):
				System.out.println("투수는 오른쪽으로 공을 던졌다.");
			if(num==b) {
				System.out.println("맞았다.");
				System.out.println("안타");
				break;
			}else {
				count++;
				System.out.println(count +"스트라이크");
				
			}
			
			}
			if(count==3) {
				System.out.println(count+"스트라이크 타자 아웃!!");
				total++;
				
				if(total==3) {
					System.out.println(total+" 아웃. 공수 교대");
					total=0;
					
				}else {
					System.out.println(total+" 아웃");
				}
				start();
				break;
			}
			
		}
	}

}
