package project2;

import java.util.*;

public class PlayGame implements RacingDevGame {
	
	public static void delay(int temp){
		  try { Thread.sleep(temp); } catch (Exception e) { System.out.println("딜레이 함수 오류\n원인:"+e); }
		 }
	
	int lTime;//플레이어완주시간변수
	int l1Time;//npc1
	int l2Time;//npc2
	int l3Time;//npc3
	lapTime[] laptime = new lapTime[4];//완주순서를 위한 배열
	Npc[] racingNpc = new Npc[3];//경기 참가 npc 등록 배열
	
	int rmselect;//경기에 사용할 기체 선택변수
	int win;//우승변수
	int wincount=0; //우승횟수
	
	int npc1win;//npc1 우승 카운트
	int npc2win;
	int npc3win;
	int intro=0;//메뉴별 첫 설명을 위한 변수
	
	int rsel;//대회선택 변수
	int allskill;//총기술력 변수
	int mmasel;//기체선택 변수
	int developStart=-1;//개발일 변수
	
	int money; //초기자금
	int costs;//유지비 변수
	int turn;//게임일수 변수
	
	//직원등록을 위한 배열
	Character[] myTeamMember = new Character[4];
	
	//기체개발을 위한 배열
	Machine[] myMach = new Machine[4];
	
	Scanner scan = new Scanner(System.in);
	
	//엔지니어 등록 배열
	Engineer[] engList = new Engineer[10]; 
	
	
	@Override
	public void engineer() {//이름 기술 급여 계약금
		Engineer engineer = new Engineer("초보기술자", 1, 30, 100);
		engList[0]=engineer;
		engineer = new Engineer("중급기술자", 2, 60,200);
		engList[1]=engineer;
		engineer = new Engineer("고급기술자", 3, 90,300);
		engList[2]=engineer;
		engineer = new Engineer("몽키스패너", 4, 120,500);
		engList[3]=engineer;
		engineer = new Engineer("동네고물상", 5, 150,700);
		engList[4]=engineer;
		
		//경주 10회 우승시 고용가능 배열
		engineer = new Engineer("배관공", 6, 180,1000);
		engList[5]=engineer;
		engineer = new Engineer("동네백수", 7, 300,2000);
		engList[6]=engineer;
		engineer = new Engineer("징징이", 8, 360,2500);
		engList[7]=engineer;
		engineer = new Engineer("신의손", 9, 600,3000);
		engList[8]=engineer;
		engineer = new Engineer("사이보그",10 ,1000,5000);
		engList[9]=engineer;
	}
	
	Driver[] driList = new Driver[8]; //드라이버 등록 배열
	
	@Override
	public void driver() {
		Driver driver = new Driver("초보운전자", 10, 30, 1000);//이름 운전기술 급여 계약금
		driList[0] = driver;
		driver = new Driver("중급운전자", 15, 90, 1500);
		driList[1] = driver;
		driver = new Driver("고급운전자", 30, 150, 3000);
		driList[2] = driver;
		driver = new Driver("김여사", 25, 200, 2000);
		driList[3] = driver;
		driver = new Driver("김사장", 60, 400, 6000);
		
		//경주 10회 우승시 고용가능배열
		driList[4] = driver;
		driver = new Driver("막달리나", 80, 600, 9000);
		driList[5] = driver;
		driver = new Driver("슈마허", 70, 450, 10000);
		driList[6] = driver;
		driver = new Driver("카트라이더", 100, 1000, 15000);
		driList[7] = driver;
	}
	Machine[] mach = new Machine[6];//기체 등록 배열
	
	@Override
	public void machine() {			//이름 속도 개발비 개발시간
		Machine machine = new Machine("로드스터",100,1000,2);
		mach[0]=machine;
		machine = new Machine("버기버기",150,1500,10);
		mach[1]=machine;
		machine = new Machine("슈슈퍼카",200,2000,20);
		mach[2]=machine;
		
		//경주 10회 우승시 개발가능
		machine = new Machine("윙카윙카",220,3500,35);
		mach[3] = machine;
		machine = new Machine("바나나카",250,5000,30);
		mach[4] = machine;
		machine = new Machine("킥킥보드",300,7000,50);
		mach[5] = machine;
		
	}
	Npc[] n = new Npc[10];
	@Override
	public void npc() { //npc 이름 머신이름 속도
		Npc npc = new Npc("알파",mach[0].name,mach[0].speed);
		n[0] = npc;
		npc = new Npc("브라보",mach[0].name,110);
		n[1] = npc;
		npc = new Npc("찰리",mach[1].name,160);
		n[2] = npc;
		npc = new Npc("델타",mach[1].name,175);
		n[3] = npc;
		npc = new Npc("에코",mach[2].name,215);
		n[4] = npc;
		npc = new Npc("폭스트롯",mach[3].name,240);
		n[5] = npc;
		npc = new Npc("실버서퍼","슈퍼보드",285);
		n[6] = npc;
		npc = new Npc("퀵실버","달리기",300);
		n[7] = npc;
		npc = new Npc("플래쉬","달리기",310);
		n[8] = npc;
		npc = new Npc("슈퍼맨","날아가기",350);
		n[9] = npc;
	}
	
	Racing[] rlist = new Racing[10];
	
	
	@Override //경주대회 목록 작성
	public void racing() {//대회이름 상금 경주거리
		Racing rl = new Racing("동네돌기",800,1000);
		rlist[0] = rl;
		rl = new Racing("시내돌기1",1000,1500);
		rlist[1] = rl;
		rl = new Racing("시내돌기2",1300,2000);
		rlist[2] = rl;
		rl = new Racing("작은트랙",1600,2500);
		rlist[3] = rl;
		rl = new Racing("중간트랙",1800,3000);
		rlist[4] = rl;
		rl = new Racing("좀큰트랙",2100,3500);
		rlist[5] = rl;
		rl = new Racing("일본대회",2200,4000);
		rlist[6] = rl;
		rl = new Racing("미국대회",2300,6000);
		rlist[7] = rl;
		rl = new Racing("스페인대회",2500,8000);
		rlist[8] = rl;
		rl = new Racing("세계대회",3000,10000);
		rlist[9] = rl;
		
	}
	
	public void fstart() {
		myTeamMember[0]=driList[0]; 	//시작시 초기 드라이버 등록
		myTeamMember[1]=engList[0];	//시작시 초기 엔지니어 등록
		money=1000;		//초기 자금 지급
		turn=1;		//시작 1일
		start();		//시작 메소드로
	}
	@Override
	public void start() {//게임 시작 메소드
		if(intro==0) { //튜토리얼을 위한 설명
			intro++;
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
			System.out.println("안녕하세요!!");
			delay(700);
			System.out.println("게임도우미 '김자바'입니다.");
			delay(700);
			System.out.println("게임 튜토리얼을 진행하기 위해 왔습니다.");
			delay(700);
			System.out.println("잘 부탁드립니다.");
			delay(700);
			System.out.println("우리 팁은 설립된지 얼마 안 됐지만, 우승을 위해 노력해보아요.");
			delay(700);
			System.out.println("우선, 레이스에 나갈 머신을 개발해봅시다.");
			delay(700);
			System.out.println("메뉴에서 '[3]기체개발'을 선택해주세요!!");
			delay(700);
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
		}
		if(intro==3) {//튜토리얼...
			intro++;
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
			System.out.println("기체개발을 위해 다음턴으로 넘어가 봅시다.");
			delay(700);
			System.out.println("'[5]다음턴으로' 를 선택해주세요!!!");
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
		}
		System.out.println();
		System.out.println("###########################################################");
		System.out.println("#                                                         #");
		System.out.println("#                          메인화면                                                          #");
		System.out.println("#                                                         #");
		System.out.println("###########################################################");
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		System.out.print("□   [1]현재상황");
		System.out.print("\t\t[2]직원목록");
		System.out.println("\t\t[3]기체개발   □");
		System.out.print("□   [4]대회참가");
		System.out.print("\t\t[5]다음턴으로");
		System.out.println("\t\t[6]게임종료   □");
		
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		
		
		System.out.print("선택 : ");
		int bsel = scan.nextInt(); //메뉴 선택을 위한 입력변수
		System.out.println("## "+bsel + "선택 ##");
		switch(bsel) {
		case 1 : 
			state();
			break;
			
		case 2 : //직원목록 메소드
			empolyeeList();
			start();
			break;
		case 3 : //기체개발 메소드
			develop();	
			start();
			break;
		case 4 : //경주대회 리스트 메소드
			racingList();	
			start();
			break;
		case 5 : //다음턴으로 메소드
			nextTurn();	
			break;
		case 6	:	//게임종료
			System.out.println("게임을 종료합니다.");
			break;
		default :	
			start();
			break;
		}
	}
	
	public void state() { //현재상황 메소드
		if(intro==1) {	//튜토리얼 진행을 위한
			for(int i = 0;i<=100;i++) {
				System.out.println();
			}
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
			System.out.println("[3]기체개발을 선택해주세요!!!!!!!");
			delay(700);
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
			start();
		}else if(intro==4) {//튜토리얼 진행을 위한
			for(int i =0;i<=100;i++) {
				System.out.println();
			}
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
			System.out.println("'[5]다음턴으로' 를 선택해주세요!!!");
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
			start();
		}else if(intro==5) {//튜토리얼 진행을 위한
			for(int i =0;i<=100;i++) {
				System.out.println();
			}
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
			System.out.println("'[4]대회참가' 를 선택해주세요!!!");
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
			start();
		}else{
		costs=0;
		allskill=0;
		
		for(int i = 0;i<=100;i++) {
			System.out.println();
		}
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		delay(800);
		System.out.println("현재  : "+turn+" 일 입니다");//게임진행 중 현재 일
		delay(700);
		System.out.println("현재 자금은 : "+money+" 만원이 있습니다.");//현재 자금 상황
		delay(700);
		try {
			for(int i=0;i<myTeamMember.length;i++) {
			costs=costs+myTeamMember[i].sal;
			}
		}catch(java.lang.NullPointerException e) {
		}
		System.out.println("현재 유지비 : "+costs+" 만원 입니다.");//현재 유지비 상황
		delay(700);
		System.out.println("현재 직원은 ");
		delay(700);
		
		for(int i=0;i<myTeamMember.length;i++) {//현재 보유중인 직원 목록 출력
			if(myTeamMember[i]==null) {
				System.out.println("["+(i+1)+"] 직원이 없습니다.");
				delay(500);
			}else if(i==0){			//직원 배열의 0번째는 드라이버
				System.out.println("[드라이버] "+myTeamMember[i].name+"\t운전기술 : "+myTeamMember[i].driveskill+"\t월급 : "+myTeamMember[i].sal);
				delay(500);
			}else {					//그 이후는 엔지니어
				System.out.println("[엔지니어] "+myTeamMember[i].name+"\t기술 : "+myTeamMember[i].mech+"\t월급 : "+myTeamMember[i].sal);
				delay(500);
			}
		}
		System.out.println();	
		for(int i=0;i<myMach.length;i++) {		//현재 보유중인 기체 목록 출력
			if(myMach[i]==null) {
				System.out.println("["+(i+1)+"] 기체가 없습니다.");
				delay(500);
			}else {				
				System.out.println("[이름] "+myMach[i].name+" 속도 : "+myMach[i].speed+" 개발비 : "+myMach[i].devMoney);
				delay(500);
			}
		}
		try {
			for(int i =1;i<myTeamMember.length;i++) {
				allskill=allskill+myTeamMember[i].mech; //팀 기술력합
			}
		}catch(java.lang.NullPointerException e) {}
		if(developStart==-1) {		//개발중인 기체 정보 출력
			System.out.println("개발중인 기체가 없습니다.");
			delay(700);
		}else {
			System.out.println(mach[mmasel-1].name+"개발중...");
			delay(700);
			System.out.println("남은 개발일은 "+(mach[mmasel-1].time-developStart-allskill)+" 일 입니다.");
		}
		System.out.println("현재 까지 우승 횟수는 "+wincount+" 회 입니다.");		//우승횟수 출력
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		delay(700);
		start();
		}
	}
	
	public void empolyeeList() {		//직원목록 메소드
		for(int i = 0;i<100;i++) {
			System.out.println();
		}
		if(intro==1) {		//튜토리얼 진행을 위한
			for(int i = 0;i<=100;i++) {
				System.out.println();
			}
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
			System.out.println("[3]기체개발을 선택해주세요!!!!!!!");
			delay(700);
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
			start();
		}else if(intro==4) {		//튜토리얼 진행을 위한
			for(int i = 0;i<=100;i++) {
				System.out.println();
			}
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
			System.out.println("'[5]다음턴으로' 를 선택해주세요!!!");
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
			start();
		}else if(intro==5) {		//튜토리얼 진행을 위한
			for(int i = 0;i<=100;i++) {
				System.out.println();
			}
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
			System.out.println("'[4]대회참가' 를 선택해주세요!!!");
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
			start();
		}else{
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		System.out.print("□\t[1]드라이버 목록");
		System.out.print("\t[2]엔지니어 목록");
		System.out.println("\t[3]메인으로 돌아가기\t  □");
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		System.out.print("선택 : ");
		int sel = scan.nextInt();
		System.out.println("## "+sel + "선택 ##");
		switch (sel) {
		case 1:
			driverList();		//드라이버 목록 메소드
			break;
		case 2:
			engineerList();		//직원 목록 메소드
			break;
		case 3:
			start();			//메인으로 
			break;
		}
		}
	}
	public void driverList() {
		for(int i = 0;i<100;i++) {
			System.out.println();
		}
		System.out.println("### 드라이버 목록 ###");
		System.out.println("10회 이상 우승하면 새로운 드라이버가 나타납니다.");
		System.out.println("현재 까지 우승 횟수는 "+wincount+" 회 입니다.");
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		
		for(int i = 0 ; i<driList.length;i++) {	//고용할 수 있는 드라이버 목록 출력
			System.out.println("["+(i+1)+"] 이름 : "+driList[i].name+"\t운전기술 : "+driList[i].driveskill+"\t급여 : "+driList[i].sal+"만원"+" \t계약금 : "+driList[i].payment+"만원");
			delay(600);
			if(wincount<10) {			
				if(i>=4) {				//driList[0]~driList[4] 번째 까지 출력 했다면 이 이후는 중단...
					break;
				}
			}
		}
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		System.out.println("현재 자금은 : "+money+" 만원이 있습니다.");
		System.out.println("드라이버를 교체하시겠습니까?");
		delay(100);
		System.out.println("1.예\t2.아니오");
		System.out.print("선택 : ");
		String sel = scan.next();
		System.out.println("## "+sel + "선택 ##");
		delay(700);
		switch(sel) {
			case "1" : driverChange();		//드라이버 고용 및 교체를 위한 메소드
			break;
			case "2" :
				System.out.println("메인화면으로 돌아간다.");
				delay(1200);
				start();
			break;
		}
	}
	public void driverChange() {			//드라이버 고용 및 교체를 위한 메소드
		
		//현재 자금 상황
		delay(600);
		System.out.println("누구로 교체 하시겠습니까?");
		delay(700);
		System.out.print("선택 : ");
		String dsel = scan.next();
		System.out.println("## "+dsel + "선택 ##");
		delay(700);
		int psel = Integer.parseInt(dsel);
		
		if(wincount<10) {
			if(psel>5) {
				System.out.println("목록에 없습니다.");
				System.out.println("다시 선택해 주세요.");
				engineerChange();
			}else if(money>driList[psel-1].payment) {		//현재 자금이 개발비 보다 많을 경우
				switch(dsel) {
				default :
				
				myTeamMember[0]=driList[psel-1];		//선택한 드라이버를 내 직원배열의 0번째로 저장
				money=money-driList[psel-1].payment;	//현재 자금에서 드라이버 계약금을 지불
				System.out.println("현재자금 : "+money+" 만원이 되었습니다.");
				delay(700);
				System.out.println(driList[psel-1].name+" 으로 교체되었습니다.");
				delay(700);
				start();
				break;
				}
			}else {		//자금이 부족할 경우
				System.out.println("자금이 부족합니다.");
				delay(700);
				System.out.println("메인화면으로 돌아갑니다.");
				delay(700);
				start();
			}
		}else if(money>driList[psel-1].payment) {		//현재 자금이 개발비 보다 많을 경우
			switch(dsel) {
			default :
			
			myTeamMember[0]=driList[psel-1];		//선택한 드라이버를 내 직원배열의 0번째로 저장
			money=money-driList[psel-1].payment;	//현재 자금에서 드라이버 계약금을 지불
			System.out.println("현재자금 : "+money+" 만원이 되었습니다.");
			delay(700);
			System.out.println(driList[psel-1].name+" 으로 교체되었습니다.");
			delay(700);
			start();
			break;
			}
		}else {		//자금이 부족할 경우
			System.out.println("자금이 부족합니다.");
			delay(700);
			System.out.println("메인화면으로 돌아갑니다.");
			delay(700);
			start();
		}
		
	}
	public void engineerList() {			//고용할 수 있는 엔지니어 목록 출력 메소드
		for(int i = 0;i<100;i++) {
			System.out.println();
		}
		
		System.out.println("엔지니어 목록");
		System.out.println("10회 이상 우승하면 새로운 엔지니어가 나타납니다.");
		System.out.println("현재 까지 우승 횟수는 "+wincount+" 회 입니다.");
		delay(700);
		allskill=0;//팀기술력
		
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		
		for(int i = 0 ; i<engList.length;i++) {	//고용할 수 있는 엔지니어 목록 출력
			System.out.println("["+(i+1)+"]이름 : "+engList[i].name+"\t기술 : "+engList[i].mech+"\t급여 : "+engList[i].sal+"만원"+"\t   계약금 : "+engList[i].payment+"만원");
			delay(600);
			if(wincount<10) {		//우승 10회 미만일 때
				if(i>=4) {			//engList[0]~engList[4] 번째 까지 출력 했다면 이 이후는 중단...
					break;
				}
			}	//우승 10회 이상일 때는 전부 출력
		}
		
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		System.out.println("현재자금 : "+money+" 만원이 있습니다.");
		System.out.println("엔지니어를 고용하시겠습니까?");
		delay(700);
		System.out.println("1.예\t2.아니오");
		System.out.print("선택 : ");
		String sel = scan.next();
		System.out.println("## "+sel + "선택 ##");
		delay(700);
		switch(sel) {
			case "1" : engineerChange();
			break;
			case "2" :
				System.out.println("메인화면으로 돌아간다.");
				delay(700);
				start();
			break;
			default :
		}
		
	}
	public void engineerChange() {		//엔지니어 고용 및 교체를 위한 메소드
		System.out.println("현재자금 : "+money+" 만원이 있습니다.");
		delay(650);
		System.out.println("누구를 고용 하시겠습니까?");
		delay(700);
		System.out.print("선택 : ");
		String esel = scan.next();
		int psel = Integer.parseInt(esel);
		System.out.println("## "+esel + "선택 ##");
		delay(700);
		
		if(wincount<10) {		//우승횟수가 10보다 작을 때
			if(psel>5) { //5이상의 번호를 고른다면
				System.out.println("목록에 없습니다.");
				System.out.println("다시 선택해 주세요.");
				engineerChange();							//우승횟수가 10보다 작고 4이하의 숫자
			}else if(money>engList[psel-1].payment) {		//현재 자금이 개발비 보다 많을 경우
				switch(esel) {
				default :
				
				if(myTeamMember[3]==null) {		//myTeamMember[3]번째 배열이 비어있다면
					for(int i=1;i<myTeamMember.length;i++) {
						if(myTeamMember[i]==null) {	//비어있는 자리부터 선택한 엔지니어를 채워넣고
							myTeamMember[i]=engList[psel-1];
							money=money-engList[psel-1].payment;	//그에 따른 게약금 지불
							System.out.println("현재자금 : "+money+" 만원이 되었습니다.");
							delay(700);
							break;
						}
					}
				}else {	//배열이 차있다면
					for(int i=1;i<myTeamMember.length;i++) {		//현재 엔지니어 목록을 출력하고
						System.out.println("["+i+"] [엔지니어] "+myTeamMember[i].name+" 기술 : "+myTeamMember[i].mech+" 월급 : "+myTeamMember[i].sal);
						delay(700);
					}
					System.out.println("직원 가득 합니다.누구 해고하시겠습니까?");
					delay(700);
					System.out.print("선택 : ");
					int csel = scan.nextInt();
					System.out.println("## "+csel + "선택 ##");
					delay(700);
					System.out.println(myTeamMember[csel].name+" 를 해고하였습니다.");
					delay(700);
					myTeamMember[csel]=engList[psel-1];		//선택한 기존 엔지니어를 새로운 엔지니어로 변경 저장
					money=money-engList[psel-1].payment;	//계약금 지불
					System.out.println("계약금 "+engList[psel-1].payment+" 만원을 지불하였습니다.");
					System.out.println("현재자금 : "+money+" 만원이 되었습니다.");
				}
				
				System.out.println(engList[psel-1].name+" 를 고용하였습니다.");	//새로운 엔지니어 출력
				delay(700);
				start();
				break;
				}
			}else {		//자금이 부족할 경우
				System.out.println("자금이 부족합니다.");
				delay(700);
				System.out.println("메인화면으로 돌아갑니다.");
				delay(700);
				start();
			}
		}else if(money>engList[psel-1].payment) {		//현재 자금이 개발비 보다 많을 경우
			switch(esel) {
			default :
			
			if(myTeamMember[3]==null) {		//myTeamMember[3]번째 배열이 비어있다면
				for(int i=1;i<myTeamMember.length;i++) {
					if(myTeamMember[i]==null) {	//비어있는 자리부터 선택한 엔지니어를 채워넣고
						myTeamMember[i]=engList[psel-1];
						money=money-engList[psel-1].payment;	//그에 따른 게약금 지불
						System.out.println("현재자금 : "+money+" 만원이 되었습니다.");
						delay(700);
						break;
					}
				}
				
			}else {	//배열이 차있다면
				for(int i=1;i<myTeamMember.length;i++) {		//현재 엔지니어 목록을 출력하고
					System.out.println("["+i+"] [엔지니어] "+myTeamMember[i].name+" 기술 : "+myTeamMember[i].mech+" 월급 : "+myTeamMember[i].sal);
					delay(700);
				}
				System.out.println("직원 가득 합니다.누구 해고하시겠습니까?");
				delay(700);
				System.out.print("선택 : ");
				int csel = scan.nextInt();
				System.out.println("## "+csel + "선택 ##");
				delay(700);
				System.out.println(myTeamMember[csel].name+" 를 해고하였습니다.");
				delay(700);
				myTeamMember[csel]=engList[psel-1];		//선택한 기존 엔지니어를 새로운 엔지니어로 변경 저장
				money=money-engList[psel-1].payment;	//계약금 지불
				System.out.println("계약금 "+engList[psel-1].payment+" 만원을 지불하였습니다.");
				System.out.println("현재자금 : "+money+" 만원이 되었습니다.");
			}
			
			System.out.println(engList[psel-1].name+" 를 고용하였습니다.");	//새로운 엔지니어 출력
			delay(700);
			start();
			break;
			}
		}else {		//자금이 부족할 경우
			System.out.println("자금이 부족합니다.");
			delay(700);
			System.out.println("메인화면으로 돌아갑니다.");
			delay(700);
			start();
		}
		
	}
	public void develop(){		//기체개발 메소드
		for(int i =0 ; i<=100;i++) {
			System.out.println();
		}
		if(intro==1) {	//튜토리얼을 위한...
			
			intro++;
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
			System.out.println(mach[0].name+"을 만들어 봅시다.");
			delay(700);
			System.out.println("게임을 진행하면서 더 다양한 멋진 머신들을 만들 수 있게 됩니다.");
			delay(700);
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
		}
		if(intro==4) {		//튜토리얼을 위한...
			
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
			System.out.println("'[5]다음턴으로' 를 선택해주세요!!!");
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
			start();
		}else if(intro==5) {		//튜토리얼을 위한...
			
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
			System.out.println("'[4]대회참가' 를 선택해주세요!!!");
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
			start();
		}else{
		if(developStart==-1) {		//developStart 변수가 -1일 경우 개발이 가능하다.
			developStart=0;			//개발시작일을 0일로 초기화 한다.
			System.out.println("개발 가능 기체 리스트");
			delay(700);
			System.out.println("10회 이상 우승하면 새로운 리스트가 나타납니다.");
			delay(700);
			System.out.println("현재 까지 우승 횟수는 "+wincount+" 회 입니다.");
			delay(700);
			allskill=0;//팀기술력
			
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			
			for(int e = 0 ; e<mach.length;e++) {	//개발가능 기체 목록 출력
				System.out.println("["+(e+1)+"]"+mach[e].name+"\t속도 : "+mach[e].speed+"\t개발비 : "+mach[e].devMoney+" 만원"+"\t개발시간 : "+mach[e].time+"일");
				delay(600);
				if(wincount<10) {
					if(e>=2) {		//10회우승 미만일 때는 mach[4]번 까지만 출력.
						break;
					}
				}
			}
			
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			try {
				for(int i =1;i<myTeamMember.length;i++) {
					allskill=allskill+myTeamMember[i].mech; //보유 엔지니어들의 기술력합
				}
			}catch(java.lang.NullPointerException e) {}
			
			System.out.println("현재 자금은 : "+money+" 만원이 있습니다.");
			delay(700);
			System.out.println("팀 기술력에 따라 개발기간을 " +allskill+" 일 단축 가능합니다. ");
			delay(700);
			System.out.println("무엇을 개발 하시겠습니까?");
			delay(700);
			System.out.print("선택 : ");
			String masel = scan.next();
			System.out.println("## "+masel + "선택 ##");
			mmasel = Integer.parseInt(masel);
			
			if(wincount<10) {
				if(mmasel>3) {
					System.out.println("목록에 없습니다.");
					System.out.println("다시 선택해 주세요.");
					developStart=-1;
					develop();
				}else if(money>=mach[mmasel-1].devMoney) {		//현재 자금이 개발비 보다 많을 경우
					System.out.println(mach[mmasel-1].name+" 을 개발합니다.");
					money=money-mach[mmasel-1].devMoney;
					delay(700);
					System.out.println(mach[mmasel-1].name+" 개발비 "+mach[mmasel-1].devMoney+" 만원을 소비합니다.");
					delay(700);
					System.out.println("현재 보유 자금은 : "+money+" 만원 입니다.");
					delay(700);
					System.out.println("팀 기술력에 따른 개발기간은 "+(mach[mmasel-1].time-developStart-allskill)+" 일 입니다.");
					delay(700);
				}else {		//자금이 부족할 경우
					System.out.println("개발비가 부족합니다.");
					delay(700);
					System.out.println("메인화면으로 돌아갑니다.");
					delay(700);
					developStart=-1;
					start();
				}
			}else if(money>=mach[mmasel-1].devMoney) {		//현재 자금이 개발비 보다 많을 경우
				System.out.println(mach[mmasel-1].name+" 을 개발합니다.");
				money=money-mach[mmasel-1].devMoney;
				delay(700);
				System.out.println(mach[mmasel-1].name+" 개발비 "+mach[mmasel-1].devMoney+" 만원을 소비합니다.");
				delay(700);
				System.out.println("현재 보유 자금은 : "+money+" 만원 입니다.");
				delay(700);
				System.out.println("팀 기술력에 따른 개발기간은 "+(mach[mmasel-1].time-developStart-allskill)+" 일 입니다.");
				delay(700);
			}else {		//자금이 부족할 경우
				System.out.println("개발비가 부족합니다.");
				delay(700);
				System.out.println("메인화면으로 돌아갑니다.");
				delay(700);
				developStart=-1;
				start();
			}
			
			if(intro==2) {		//튜토리얼을 위한 설명
				intro++;
				delay(700);
				System.out.println("신차 개발을 시작했습니다. 어떤 머신이 나올지 정말 기대되네요.");
				delay(700);
			}
		}else {		//developStart가 -1이 아지니만 다시 메뉴를 들어왔을 경우
			System.out.println("개발중인 기체가 취소 됩니다 계속 하시겠습니까?");
			System.out.println("[y]예");
			System.out.println("[n]아니오");
			System.out.print("선택 : ");
			String ynsel = scan.next();
			System.out.println("## "+ynsel + "선택 ##");
			switch (ynsel) {
			case "y" :		//현재 개발중이 기체를 취소
				developStart=-1;	//개발시작일을 -1로 하고 
				develop();			//다시 개발 메소드를 실행
				break;
			case "n" :
				start();		//메인으로 돌아간다
				break;
			}
			
		}
		}
	}
	
	public void racingList() {		//경주 대회 목록 리스트 출력 메소드
		for(int i = 0;i<100;i++) {
			System.out.println();
		}
		if(intro==1) {		//튜토리얼 진행을 위한
			for(int i = 0;i<=100;i++) {
				System.out.println();
			}
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
			System.out.println("[3]기체개발을 선택해주세요!!!!!!!");
			delay(700);
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
			start();
		}else if(intro==4) {	//튜토리얼 진행을 위한
			for(int i = 0;i<=100;i++) {
				System.out.println();
			}
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
			System.out.println("'[5]다음턴으로' 를 선택해주세요!!!");
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
			start();
		}else{
		if(intro==5) {	//튜토리얼 진행을 위한
			intro++;
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
			System.out.println("대회에 참여해 봅시다.");
			delay(700);
			System.out.println("게임을 진행하면서 더 다양한 대회들을 참여할 수 있게 됩니다.");
			delay(700);
			System.out.println("[1]"+rlist[0].name +"를 선택해주세요!!!");
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
		}
		System.out.println("### 레이싱 대회 목록 ###");
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		
		for(int e = 0 ; e<rlist.length;e++) {	//출전가능 대회 목록 출력
			System.out.println("["+(e+1)+"]"+"대회이름 : "+rlist[e].name+"\t대회상금 : "+rlist[e].prize+"만원"+"\t경기장길이 : "+rlist[e].length+" km");
			delay(500);
			if(wincount<10) {
				if(wincount<2) {
					if(e<1) {	//2회우승 미만일 때는 rlist[0]번 까지만 출력.
						break;
					}
				}else if(wincount<5) {
					if(e>=3) {		//5회우승 미만일 때는 rlist[3]번 까지만 출력.
						break;
					}
				}
				if(e>=5) {		//5회우승 이상일 때는 rlist[5]번 까지만 출력.
					break;
				}
			}
		}
		System.out.println("["+(rlist.length+1)+"]메인으로 가기");
		
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		delay(500);
		System.out.println("현재 까지 우승 횟수는 "+wincount+" 회 입니다.");
		delay(500);
		System.out.println("어떤 대회에 참가하시겠습니까?");
		delay(500);
		System.out.print("선택 : ");
		rsel = scan.nextInt();
		
		if(rsel==(rlist.length+1)) {
			start();
		}else if(myMach[0]==null){		//보유중인 기체가 없을 경우
			System.out.println("기체가 없어 대회에 참가 할 수 없습니다.");
			System.out.println("기체를 개발해 주세요.");
			start();
		}else if(wincount<2){	//우승카운트가 2미만일 때
			if(rsel>1) {		//1 초과하는 숫자를 골랐을 경우
				System.out.println("목록에 없습니다.");
				System.out.println("다시 선택해 주세요.");
				racingList();
			}else {				//1보다 작은 수... 
				System.out.println(rlist[rsel-1].name+" 대회가 선택 되었습니다.");
				for(int s=0;s<myMach.length;s++) {		//대회에 사용할 기체 선택
					if(myMach[s]==null) {		//없을 경우 출력
						System.out.println("["+(s+1)+"] 기체가 없습니다.");
						delay(500);
					}else {			//있을 경우 보유 기체 정보 출력
						System.out.println("["+(s+1)+"] "+myMach[s].name+" 속도 : "+myMach[s].speed+" km/h");
						delay(500);
					}
				}
			}
			
		}else if(wincount<5){
			if(rsel>4) {
				System.out.println("목록에 없습니다.");
				System.out.println("다시 선택해 주세요.");
				racingList();
			}else{
				System.out.println(rlist[rsel-1].name+" 대회가 선택 되었습니다.");
				for(int s=0;s<myMach.length;s++) {		//대회에 사용할 기체 선택
					if(myMach[s]==null) {		//없을 경우 출력
						System.out.println("["+(s+1)+"] 기체가 없습니다.");
						delay(500);
					}else {			//있을 경우 보유 기체 정보 출력
						System.out.println("["+(s+1)+"] "+myMach[s].name+" 속도 : "+myMach[s].speed+" km/h");
						delay(500);
					}
				}
			}
		}else if(wincount<10){
			if(rsel>6) {
				System.out.println("목록에 없습니다.");
				System.out.println("다시 선택해 주세요.");
				racingList();
			}else{
				System.out.println(rlist[rsel-1].name+" 대회가 선택 되었습니다.");
				for(int s=0;s<myMach.length;s++) {		//대회에 사용할 기체 선택
					if(myMach[s]==null) {		//없을 경우 출력
						System.out.println("["+(s+1)+"] 기체가 없습니다.");
						delay(500);
					}else {			//있을 경우 보유 기체 정보 출력
						System.out.println("["+(s+1)+"] "+myMach[s].name+" 속도 : "+myMach[s].speed+" km/h");
						delay(500);
					}
				}
			}
		}else {
			System.out.println(rlist[rsel-1].name+" 대회가 선택 되었습니다.");
				delay(1200);
				
				for(int s=0;s<myMach.length;s++) {		//대회에 사용할 기체 선택
					if(myMach[s]==null) {		//없을 경우 출력
						System.out.println("["+(s+1)+"] 기체가 없습니다.");
						delay(500);
					}else {			//있을 경우 보유 기체 정보 출력
						System.out.println("["+(s+1)+"] "+myMach[s].name+" 속도 : "+myMach[s].speed+" km/h");
						delay(500);
					}
				}
		}
			System.out.println("어떤 기체를 타고 나가시겠습니까?");
			System.out.print("선택 : ");
			delay(700);
			String rmsel = scan.next();
			
			System.out.println("## "+rmsel + "선택 ##");
			rmselect = Integer.parseInt(rmsel);
		try {
			System.out.println(myMach[rmselect-1].name+" 을 선택합니다.");
		}catch(java.lang.NullPointerException e) {
			System.out.println("기체가 없습니다.");
			delay(1000);
			System.out.println("다시 확인해 주세요.");
			delay(1000);
			racingList();
			
		}
			
			delay(700);
			racingStart();
			
		
		}
	}
	
	public void racingStart() {
		System.out.println(rlist[rsel-1].name+" 대회가 시작되었습니다 .");
		delay(700);
		System.out.println("참가자 리스트");
		System.out.println("5회, 10회 이상 우승하면 새로운 참가자들이 나타납니다.");
		delay(700);
		System.out.println("[1] "+myTeamMember[0].name+" ["+myMach[rmselect-1].name+"]");
		delay(800);
		
		if(wincount>=10) { //우승회수 10회 이상일 경우 npc 참가자수 증가
			if(rlist[rsel-1].name.equals("세계대회")) {
				for(int i=0;i<3;i++) {		//세계대회 일경우 가장 능력치 좋은 3명의 npc만 출전
					int npcNum = (int)(Math.random()*(3) + 7);//7~9
					racingNpc[i]=new Npc(n[npcNum].name,n[npcNum].mname,n[npcNum].speed);
					System.out.println("["+(i+2)+"] "+n[npcNum].name+" ["+n[npcNum].mname+"]");
					delay(800);
				}
			}else  if(rlist[rsel-1].name.equals("스페인대회")){
				for(int i=0;i<3;i++) {
					int npcNum = (int)(Math.random()*(5) + 5);//5~9
					racingNpc[i]=new Npc(n[npcNum].name,n[npcNum].mname,n[npcNum].speed);
					System.out.println("["+(i+2)+"] "+n[npcNum].name+" ["+n[npcNum].mname+"]");
					delay(800);
				}
			}else { 
				for(int i=0;i<3;i++) {		//위의 두 대회가 아닐경우 7명중 랜덤 출전
				int npcNum = (int)(Math.random()*7);
				racingNpc[i]=new Npc(n[npcNum].name,n[npcNum].mname,n[npcNum].speed);
				System.out.println("["+(i+2)+"] "+n[npcNum].name+" ["+n[npcNum].mname+"]");
				delay(800);
				}
			}
		}else if(wincount >=5){
			for(int i=0;i<3;i++) {	//우승5회 이상일 경우 1번~5번 5명중 랜덤 출전
				int npcNum = (int)(Math.random()*(5)+1);
				racingNpc[i]=new Npc(n[npcNum].name,n[npcNum].mname,n[npcNum].speed);
				System.out.println("["+(i+2)+"] "+n[npcNum].name+" ["+n[npcNum].mname+"]");
				delay(800);
			}
		}else {
			for(int i=0;i<3;i++) {	//우승5회 미만일 경우 0~2번의 3명중 랜덤 출전
				int npcNum = (int)(Math.random()*3);
				racingNpc[i]=new Npc(n[npcNum].name,n[npcNum].mname,n[npcNum].speed);
				System.out.println("["+(i+2)+"] "+n[npcNum].name+" ["+n[npcNum].mname+"]");
				delay(800);
			}
		}
		
		System.out.println();
		System.out.println("###########################################################");
		System.out.println("#                                                         #");
		System.out.println("#                          경주시작                                                          #");
		System.out.println("#                                                         #");
		System.out.println("###########################################################");
		delay(1200);
		System.out.println();
		racingTime();
		
		System.out.println();
		System.out.println();
		if(npc1win==1) {	//우승자별 출력문
			System.out.println(racingNpc[0].name+"우승");
			delay(700);
		}else if(npc2win==1){
			System.out.println(racingNpc[1].name+" 우승");
			delay(700);
		}else if(npc3win==1) {
			System.out.println(racingNpc[2].name+" 우승");
			delay(700);
		}else if(win==1){
			System.out.println("우승하였습니다!!!!!");
			delay(700);
		}
		
		int temp=0;
		String temp1;
		for(int j=0;j<laptime.length;j++) {			//경주 시간별 오름 차순 정리
			for(int k=j+1;k<laptime.length;k++) {
				if(laptime[j].lapTime>laptime[k].lapTime) {
					temp=laptime[j].lapTime;
					temp1=laptime[j].name;
					laptime[j].lapTime=laptime[k].lapTime;
					laptime[j].name=laptime[k].name;
					laptime[k].lapTime=temp;
					laptime[k].name=temp1;
				}
				
			}
		}
		
		int rmoney=0;//순위별 상금
		int reciveMoney=0;//상금 출력 변수
		int rank=0;//순위변수
		rmoney=rlist[rsel-1].prize;
		for(int n=0; n<laptime.length;n++) {
			System.out.println("["+(n+1)+"]위 "+laptime[n].name+" 상금 : "+rmoney+" 만원");
			delay(700);
			if(laptime[n].name.equals(myTeamMember[0].name)) {		//해당 순위에 따른 상금과 보유자금 변경
				reciveMoney=rmoney;
				rank=n;
				money=money+rmoney;
			}
			rmoney=rmoney/2;	//순위에 따른 상금 변경
		}
		System.out.println(rank+1+" 위 상금 : "+reciveMoney+" 만원 획득!");
		delay(700);
		if(intro==6) {		//튜토리얼을 위한 설명
			intro++;
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
			System.out.println("첫 대회가 마무리 되었습니다.");
			delay(700);
			System.out.println(rank+1+" 위 상금 : "+reciveMoney+" 만원을 획득하셨네요.");
			delay(700);
			System.out.println("더 유능한 직원을 고용하고 더 좋은 기체를 개발해서");
			delay(700);
			System.out.println("최고의 레이싱 팀을 만들어 주세요.");
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
		}
		
		//경주 완료 후 1일이 지난 것으로 한다.
		
		allskill=0;
		int costs=0;
		try {for(int i=0;i<myTeamMember.length;i++) {
				costs=costs+myTeamMember[i].sal;
			}
		}catch(java.lang.NullPointerException e) {
		}
		try {
			for(int i =1;i<myTeamMember.length;i++) {
				allskill=allskill+myTeamMember[i].mech; //팀 기술력합
			}
		}catch(java.lang.NullPointerException e) {}
		
		System.out.println("1 일당 지출비용은   "+costs+" 만원 입니다.");
		delay(1200);
		money=money-costs;
		System.out.println("현재 보유 자금은 : "+money+" 만원 입니다.");
		delay(1200);
		turn++;
		System.out.println("현재  : "+turn+" 일 지났습니다.");
		delay(1200);
		if(developStart==-1) {
			System.out.println("개발중인 기체가 없습니다.\n");
			delay(1200);
		}else {
			developStart++;
			if(mach[mmasel-1].time-developStart-allskill<=0) {
				for(int j=0;j<myTeamMember.length;j++) {
					if(myMach[j]==null) {
						myMach[j]=mach[mmasel-1];
						for(int k=0;k<2;k++) {
							System.out.println("######################");
						}
						System.out.println();
						System.out.println(myMach[j].name+" 가 개발되었습니다.\n");
						for(int k=0;k<2;k++) {
							System.out.println("######################");
						}
						delay(700);
						developStart=-1;	//개발완료 후 개발시작 변수 -1로 변경
						break;
					}
				}
			}else {
				System.out.println(mach[mmasel-1].name+"개발중...");
				System.out.println("남은 개발일은 "+(mach[mmasel-1].time-developStart-allskill)+" 일 입니다.\n");
				delay(700);
			}
		}
		if(money<0) {		//보유 자금을 모두 소비하였을 경우
			System.out.println("현재 보유 자금은 : "+money+" 만원 입니다.");
			System.out.println("파산하였습니다.");
			System.out.println("메인으로 돌아갑니다.\n");
		}else {
			start();
		}
		
		

	}
	
	public void racingTime() { //경주 완료 시간 메소드
		lTime=rlist[rsel-1].length;		//출전 선수 각각 측정을 위한 4개의 변수
		l1Time=rlist[rsel-1].length;
		l2Time=rlist[rsel-1].length;
		l3Time=rlist[rsel-1].length;
		win=0;	//우승 변수 초기화
		npc1win=0;
		npc2win=0;
		npc3win=0;
		System.out.println("    ["+myTeamMember[0].name+"]       ["+racingNpc[0].name+"]          ["+racingNpc[1].name+"]          ["+racingNpc[2].name+"]");
		while(true) {
			if(lTime<=0) {		//남은 경주거리가 없다면
				System.out.print("골인\t");
				win=1;			//우승변수 1로 변경
				wincount++;		//우승카운트 1추가
				lapTime lapti = new lapTime(myTeamMember[0].name,lTime);	//순위를 위한 배열에 저장
				laptime[0]= lapti;
				
			}else {						//남아 있다면	
				System.out.print(lTime+"m 남았습니다.\t");		//남은 거리 출력
				lapTime lapti = new lapTime(myTeamMember[0].name,lTime);	//순위를 위한 배열에 저장
				laptime[0]= lapti;
			}
			if(l1Time<=0) {
				System.out.print("골인\t");
				npc1win=1;
				lapTime lapti = new lapTime(racingNpc[0].name,l1Time);
				laptime[1]= lapti;
				
			}else {
				System.out.print(l1Time+"m 남았습니다.\t");
				lapTime lapti = new lapTime(racingNpc[0].name,l1Time);
				laptime[1]= lapti;
			}
			if(l2Time<=0) {
				System.out.print("골인\t");
				npc2win=1;
				lapTime lapti = new lapTime(racingNpc[1].name,l2Time);
				laptime[2]= lapti;
				
			}else {
				System.out.print(l2Time+"m 남았습니다.\t");
				lapTime lapti = new lapTime(racingNpc[1].name,l2Time);
				laptime[2]= lapti;
			}
			if(l3Time<=0) {
				System.out.println("골인\t");
				npc3win=1;
				lapTime lapti = new lapTime(racingNpc[2].name,l3Time);
				laptime[3]= lapti;
				
			}else {
				System.out.println(l3Time+"m 남았습니다.");
				lapTime lapti = new lapTime(racingNpc[2].name,l3Time);
				laptime[3]= lapti;
			}
			if(lTime<=0||l1Time<=0||l2Time<=0||l3Time<=0) {
				break;
			}else {			//출전자들의 속도의 60%에서 100%까지 랜덤 적용을 위해
				int lt =(int)(Math.random()*(5) + 6);//6~10 까지 랜덤함수
				int lt1 = (int)(Math.random()*(5) + 6);
				int lt2 = (int)(Math.random()*(5) + 6);
				int lt3 = (int)(Math.random()*(5) + 6);
				lTime=lTime-myTeamMember[0].driveskill-((lt*myMach[rmselect-1].speed)/10);
				l1Time=l1Time-((lt1*racingNpc[0].speed)/10);
				l2Time=l2Time-((lt2*racingNpc[1].speed)/10);
				l3Time=l3Time-((lt3*racingNpc[2].speed)/10);
				delay(700);
			}
			
			
		}
		
	}
	public void nextTurn() {		//다른턴으로 넘어가기 위한 메소드
		if(intro==1) {		//튜토리얼을 위한 설명
			for(int i = 0;i<=100;i++) {
				System.out.println();
			}
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
			System.out.println("[3]기체개발을 선택해주세요!!!!!!!");
			delay(700);
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
			start();
		}else if(intro==5) {	//튜토리얼을 위한 설명
			for(int i = 0;i<=100;i++) {
				System.out.println();
			}
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
			System.out.println("'[4]대회참가' 를 선택해주세요!!!");
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			delay(700);
			start();
		}else{
		allskill=0;		//팀 기술력 재적용을 위한 초기화
		int costs=0;	//유지비 재적용을 위한 초기화
		try {for(int i=0;i<myTeamMember.length;i++) {
				costs=costs+myTeamMember[i].sal;
			}
		}catch(java.lang.NullPointerException e) {
		}
		try {
			for(int i =1;i<myTeamMember.length;i++) {
				allskill=allskill+myTeamMember[i].mech; //팀 기술력합
			}
		}catch(java.lang.NullPointerException e) {}
		
		System.out.println("1 일당 지출비용은   "+costs+" 만원 입니다.");
		delay(1200);
		money=money-costs;		//보유자금 에서 유지비를 제함
		System.out.println("현재 보유 자금은 : "+money+" 만원 입니다.");
		delay(1200);
		turn++;		//1일 증가
		System.out.println("현재  : "+turn+" 일 지났습니다.");
		delay(1200);
		if(developStart==-1) {
			System.out.println("개발중인 기체가 없습니다.\n");
			delay(1200);
		}else {		//developStart변수가 -1이 아닐경우
			developStart++;		//developStart 1일 추가
			if(mach[mmasel-1].time-developStart-allskill<=0) {		//기체개발일 - 개발시작부터 지난 일 - 팀기술력 = 0보다 작아질 경우
				for(int j=0;j<myTeamMember.length;j++) {
					if(myMach[j]==null) {
						myMach[j]=mach[mmasel-1];
						for(int k=0;k<3;k++) {
							System.out.println("######################");
						}
						System.out.println();
						System.out.println(myMach[j].name+" 가 개발되었습니다.\n");	//기체 개발 완료
						
						for(int k=0;k<3;k++) {
							System.out.println("######################");
						}
						delay(700);
						if(intro==4) {	//튜토리얼을 위한 설명
							for(int i = 0;i<=100;i++) {
								System.out.println();
							}
							intro++;
							System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
							delay(700);
							System.out.println("로드스터가 개발 되었습니다.");
							delay(700);
							System.out.println("이제 경주대회에 참여할 수 있습니다.");
							delay(700);
							System.out.println("'[4]대회참가' 를 선택해주세요!!!");
							System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
							delay(700);
						}
						developStart=-1;	//개발 완료 후 다시 developStart -1로 변경
						break;
					}
				}
			}else {
				System.out.println(mach[mmasel-1].name+"개발중...");
				System.out.println("남은 개발일은 "+(mach[mmasel-1].time-developStart-allskill)+" 일 입니다.\n");
				delay(700);
			}
		}
		if(money<0) {
			System.out.println("현재 보유 자금은 : "+money+" 만원 입니다.");
			delay(700);
			System.out.println("파산하였습니다.");
			delay(700);
			System.out.println("재도전하여 최고의 레이싱 팀을 만들어 주세요.");
			delay(700);
			System.out.println("종료합니다.\n");
			System.exit(0);
			
		}else if(money>1000000 || wincount>=100 || turn>=500){
			System.out.println("보유자금이 1000000만원을 넘었습니다.");
			delay(700);
			System.out.println("엔딩보상으로 어마어마한 보상을 안겨 드립니다.");
			for(int i=0;i<=10;i++) {
				System.out.println("■ ");
				delay(700);
			}
			System.out.println("https://www.acmicpc.net/");
			System.out.println("공부하세요.");
			System.exit(0);
		}
		start();
		}
	}
}
