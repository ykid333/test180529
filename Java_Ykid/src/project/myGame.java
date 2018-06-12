package project;

import java.util.*;

public class myGame implements BaseballGame{
	
	public static void delay(int temp){
		  try { Thread.sleep(temp); } catch (Exception e) { System.out.println("딜레이 함수 오류\n원인:"+e); }
		 }
	
	int delaytime = 1;
	
	public static int total=0; //아웃카운트를 세기 위한
	int ytotal=0;
	int i=1;//우리팀 타순
	int j=1;//상대팀 타순
	int k=0;//안타
	int e=0;//몇회
	int mscore=0;//총 점수
	int yscore=0;//상대 총 점수
	int score=0;//이닝당 점수를 위한 변수
	int[] mmscore = new int[9]; //이닝당 점수
	int[] yyscore = new int[9];
	int inning=0;
	
	MyTeam[] myteams = new MyTeam[10]; //팀 선수 입력을 위한 배열 생성

	yourTeam[] yourteams = new yourTeam[10];//상대팀 선수 입을 위한 배열 생성
	
	//ArrayList<yourTeam> cart = new ArrayList<yourTeam>();
	
	Scanner scan = new Scanner(System.in);
	
	@Override
	public void myTeam() { //선수 입력
		MyTeam myteam = new MyTeam(1,"티오피");
		myteams[0]=myteam;
		myteam = new MyTeam(2,"칸타타");
		myteams[1]=myteam;
		myteam = new MyTeam(3,"고티카");
		myteams[2]=myteam;
		myteam = new MyTeam(4,"스타벅");
		myteams[3]=myteam;
		myteam = new MyTeam(5,"레스비");
		myteams[4]=myteam;
		myteam = new MyTeam(6,"조지아");
		myteams[5]=myteam;
		myteam = new MyTeam(7,"카누");
		myteams[6]=myteam;
		myteam = new MyTeam(8,"맥심");
		myteams[7]=myteam;
		myteam = new MyTeam(9,"자판기");
		myteams[8]=myteam;
		myteam = new MyTeam(0,"투수");
		myteams[9]=myteam;
	}

	@Override
	public void otherTeam() { //상대 선수 입력
		yourTeam youteam = new yourTeam(1,"샘슨");
		yourteams[0]=youteam;
		youteam = new yourTeam(2,"22");
		yourteams[1]=youteam;
		youteam = new yourTeam(3,"33");
		yourteams[2]=youteam;
		youteam = new yourTeam(4,"44");
		yourteams[3]=youteam;
		youteam = new yourTeam(5,"55");
		yourteams[4]=youteam;
		youteam = new yourTeam(6,"66");
		yourteams[5]=youteam;
		youteam = new yourTeam(7,"77");
		yourteams[6]=youteam;
		youteam = new yourTeam(8,"88");
		yourteams[7]=youteam;
		youteam = new yourTeam(9,"99");
		yourteams[8]=youteam;
		youteam = new yourTeam(0,"00");
		yourteams[9]=youteam;
		
		
	}

	@Override
	public void start() { //게임 시작 메소드
		
		System.out.println("=======================");
		System.out.println("메인화면");
		System.out.println("=======================");
		
		System.out.println("[1]팀선수목록");
		System.out.println("[n]상대팀선수정보");
		System.out.println("[s]게임시작");
		System.out.println("[x]종료");
		
		System.out.print("선택 : ");
		String bsel = scan.next(); //메뉴 선택을 위한 
		System.out.println("## "+bsel + "선택 ##");
		switch(bsel) {
		case "x" : 
			
			break;
		case "n" : pitcherList();
			break;
		case "s" : inning();
			break;
		default :
			int i=0;
			for(MyTeam b : myteams) {
				b.printDetail();
			}
			start();
		}
		
	}
	
	public void pitcherList() {
		System.out.println("=======================");
		System.out.println("선수목록");
		System.out.println("=======================");
		int i=0;
		for(yourTeam p : yourteams) {
		
		p.printDetail();
		}
		start();
	}
	public void inning() { //이닝 선택을 위한 메소드
		inning=0;
		e=0;//몇회
		mscore=0;
		yscore=0;
		System.out.println("몇이닝 게임을 진행하시겠습니까? ");
		System.out.print("1~9이닝 입력.>>");
		inning = scan.nextInt();
		sgame();
	}
	public void sgame() {
		
		if(e==inning) {	//e회차 게임 종료를 위한 if문
			endgame();
		}
		e++;		//+1회차 증가
		System.out.println("\n#######  현재 점수    #######");
		System.out.println("[우리팀 : "+mscore+"] || ["+yscore+" : 상대팀]");
		System.out.println("## "+e+"회초 공격 ##");
		System.out.println("\n우리팀 공격");
		System.out.println();
		game();
	}

	public void game() {
		//delay(3000);
		for(int i = 0 ; i <= 10; i ++) {
			  System.out.print("■ ");
			  delay(5);
		  }
		//delay(5000);
		int count=0;
		int num=0;
		
		System.out.println("\n"+i+" 번 타자 : "+myteams[i-1].name);
		System.out.println("상대 투수");
		System.out.println("["+(0)+"]"+yourteams[9].num+"번, "+yourteams[9].name);
			
		while (true) {
			int b=0;
			num = (int)(Math.random()*(3) + 1); //투수가 공을 던지는 방향에 대한 랜덤 함수
			System.out.println("==================");
			System.out.println("투수가 공을 던졌다. ");
			System.out.println("어느쪽으로 방망이를 휘두를까");
			
			System.out.println("1.왼쪽 2.중앙 3.오른쪽");
			b = scan.nextInt();
			if(b==1) {
				System.out.println("왼쪽으로 휘두른다.");
			}else if(b==2){
				System.out.println("중앙으로 휘두른다.");
			}else {
				System.out.println("오른쪽으로 휘두른다.");
			}
			//delay(3000);
			switch (num) {
			case (1):
				
				System.out.println("투수는 왼쪽으로 공을 던졌다.");
				//delay(3000);
				if(num==b) {
					System.out.println("맞았다.");
					System.out.println("안타");
					k++;
					if(k>=4) {
						System.out.println(myteams[i-1].name+" 1점 추가 획득");
						mscore++;
						score++;
					}
					if(i==9) {
						i=1;
					}else {
						i++;
					}
					game();
					break;
				}else {
					count++;
					System.out.println();
					System.out.println(count + "스트라이크");
					break;
				}
				
			case (2):
				
				System.out.println("투수는 중앙으로 공을 던졌다.");
				//delay(3000);
			if(num==b) {
				System.out.println("맞았다.");
				System.out.println("안타");
				k++;
				if(k>=4) {
					System.out.println(myteams[i-1].name+"1점 추가 획득");
					mscore++;
					score++;
				}
				if(i==9) {
					i=1;
				}else {
					i++;
				}
				game();
				break;
			}else {
				count++;
				System.out.println("==============");
				System.out.println(count +"스트라이크");
				break;
			}
			case (3):
				
				System.out.println("투수는 오른쪽으로 공을 던졌다.");
				//delay(3000);
			if(num==b) {
				System.out.println("맞았다.");
				System.out.println("안타");
				k++;
				if(k>=4) {
					System.out.println(myteams[i-1].name+"1점 추가 획득");
					mscore++;
					score++;
				}
				if(i==9) {
					i=1;
				}else {
					i++;
				}
				game();
				break;
			}else {
				count++;
				System.out.println("==============");
				System.out.println(count +"스트라이크");
				break;
			}
			}
			if(count==1) {
				System.out.println(count+"스트라이크 타자 아웃!!");
				if(i==9) {
					i=1;
				}else {
					i++;
				}
				total++;
				
			
			if(total==3) {
					System.out.println(total+" 아웃. 공수 교대");
					System.out.println("안타를 친 개수 : "+k);
					System.out.println(e+"회 현재 점수 : "+mscore);
					mmscore[e-1]=score;
					delay(5000);
					total=0;
					k=0;
					syourgame();
					break;
			}else {
				System.out.println(total+" 아웃");
				game();
				break;
			}
			}
			
		}
	}
	
	public void syourgame() {
		System.out.println("#######  현재 점수    #######");
		System.out.println("[우리팀 : "+mscore+"] || ["+yscore+" : 상대팀]");
		System.out.println("## "+e+"회말 공격 ##");
		System.out.println("\n상대팀 공격");
		System.out.println();
		k=0;
		score=0;
		yourgame();
	}
	public void yourgame() {
		System.out.println("=======================");
		System.out.println("타자준비");
		System.out.println("=======================");
		
		int count=0;
		int num=0;
		
		System.out.println(j+" 번 타자 : "+yourteams[j-1].name);
		
			System.out.println("상대할 투수");
			System.out.println("["+(0)+"]"+myteams[9].num+"번, "+myteams[9].name);
			
		while (true) {
			
			num = (int)(Math.random()*(3) + 1);
			System.out.println("==================");
			System.out.println("투수가 공을 던졌다. ");
			//delay(5000);
			//System.out.println("1에서"+(int)(pitchers[selPit].control*10)+"중 숫자 하나를 고르세요.");
			
			int b = (int) (Math.random()*(3) + 1);
			if(b==1) {
				System.out.println(j+" 번 타자 : "+yourteams[j-1].name+"는 왼쪽으로 방망이를 휘두른다.");
			}else if(b==2) {
				System.out.println(j+" 번 타자 : "+yourteams[j-1].name+"는 중앙으로 방망이를 휘두른다.");
			}else {
				System.out.println(j+" 번 타자 : "+yourteams[j-1].name+"는 오른쪽으로 방망이를 휘두른다.");
			}
			
		//	delay(5000);
			switch (num) {
			case (1):
				System.out.println("투수는 왼쪽으로 공을 던졌다.");
				if(num==b) {
					System.out.println("맞았다.");
					System.out.println("안타");
					k++;
					if(k>=4) {
						System.out.println(yourteams[j-1].name+" 1점 추가 획득");
						yscore++;
						score++;
					}
					if(j==9) {
						j=1;
					}else {
						j++;
					}
					//delay(3000);
					yourgame();
					break;
				}else {
					count++;
					System.out.println(count + "스트라이크");
					//delay(3000);
					break;
				}
				
			case (2):
				System.out.println("투수는 중앙으로 공을 던졌다.");
			if(num==b) {
				System.out.println("맞았다.");
				System.out.println("안타");
				//delay(3000);
				k++;
				if(k>=4) {
					System.out.println(yourteams[j-1].name+" 1점 추가 획득");
					yscore++;
					score++;
				}
				if(j==9) {
					j=1;
				}else {
					j++;
				}
				yourgame();
				break;
			}else {
				count++;
				System.out.println(count +"스트라이크");
				//delay(3000);
				break;
			}
			case (3):
				System.out.println("투수는 오른쪽으로 공을 던졌다.");
			if(num==b) {
				System.out.println("맞았다.");
				System.out.println("안타");
				//delay(3000);
				k++;
				if(k>=4) {
					System.out.println(yourteams[j-1].name+" 1점 추가 획득");
					yscore++;
					score++;
				}
				if(j==9) {
					j=1;
				}else {
					j++;
				}
				yourgame();
				break;
			}else {
				count++;
				System.out.println(count +"스트라이크");
				//delay(3000);
				break;
			}
			}
			if(count==1) {
				System.out.println(count+"스트라이크 타자 아웃!!");
				//delay(3000);
				if(j==9) {
					j=1;
				}else {
					j++;
				}
				
				total++;
			}	
			
			if(total==3) {
				System.out.println(total+" 아웃. 공수 교대");
				System.out.println("안타를 친 개수 : "+k);
				System.out.println(e+"회 현재 점수 : "+yscore);
				yyscore[e-1]=score;
				//delay(3000);
				k=0;
				//delay(3000);
				total=0;
				sgame();
			}else {
				System.out.println(total+" 아웃");
				//delay(3000);
				yourgame();
				break;
			}
			
		}
	}
	public void endgame() {
		System.out.println("######################################");
		System.out.println(e+"회 경기끝");
		System.out.println("[우리팀 : "+mscore+"] || ["+yscore+" : 상대팀]");
		if(mscore>yscore) {
			System.out.println("우리팀 승리");
		}else if(mscore<yscore) {
			System.out.println("상대팀 승리");
		}else {
			System.out.println("무승부");
		}
		
		restart();
	}
	
	public void restart() {
		System.out.println("\n[1]회차별 상세 점수");
		System.out.println("[2]다시하기");
		System.out.println("[3]메인");
		System.out.print("선택>>");
		int select= scan.nextInt();
		switch (select) {
		case 1:
			System.out.println("구현중...");
			System.out.print("       ");
			for(int i=1;i<=inning;i++) {
				System.out.print(i+"회\t");
			}
			
			System.out.print("\n우리팀\t");
			for(int i=0;i<inning;i++) {
				System.out.print("["+mmscore[i]+"]\t");
			}
			System.out.print("\n상대팀\t");
			for(int i=0;i<inning;i++) {
				System.out.print("["+yyscore[i]+"]\t");
			}
			restart();
			break;
		case 2:
			inning();
			break;
		case 3:
			start();
			break;
		}
		
		
	}
	
}
