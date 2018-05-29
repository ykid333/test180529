package ykid180525;

import java.util.Scanner;

public class BankApplication_t {

	private static Account[] accountArray = new Account[100];
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean run = true;
		while (run) {
			System.out.println("---------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------");
			
			System.out.print("선택>> ");
			
			int selectNo = scan.nextInt();
			
			if(selectNo==1) {
				createAccount();
			}else if(selectNo==2) {
				accountList();
			}else if(selectNo==3) {
				deposit();
			}else if(selectNo==4) {
				withdraw();
			}else if(selectNo==5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	//계좌생성하기
	//계좌번호, 계좌주, 초기입금액을 입력받고 계좌가 생성되었습니다. 출력
	//입력이 끝나면 다시 선택하는 내용이 출력되어 추가로 계좌생성하기 가능함
		private static void createAccount() {
			
			System.out.println("--------");
			System.out.println("계좌생성");
			System.out.println("--------");
			System.out.print("계좌번호 : ");
			String ano = scan.next();		//계좌번호 입력을 위한 변수
			System.out.print("계좌주 : ");
			String owner = scan.next();		//계좌주 입력을 위한 변수
			System.out.print("초기입금액 : ");
			int balance = scan.nextInt();	//초기 입금액을 위한 변수
			
			
			Account account = new Account(ano, owner, balance);
			//입력 받은 값을 배열 변수에 하나씩 저장
			for(int i=0;i<accountArray.length;i++) {
				if(accountArray[i]==null) {
					accountArray[i]=account;  
					//account.getAno(), account.getOwner(), account.getBalance()
					System.out.print("결과: 계좌가 생성되었습니다.\n");
					break;
				}
			}
			
			
		}
		//계좌 목록보기
		//입력된 고객의 계좌번호 계좌주 입금액을 모두 보여줌.
		private static void accountList() {
			System.out.println("--------");
			System.out.println("계좌목록");
			System.out.println("--------");
			for(int i=0;i<accountArray.length;i++) {
				
				Account account = accountArray[i];
				if(account!=null) {
				System.out.print(account.getAno()+"\t");
				System.out.print(account.getOwner()+"\t");
				System.out.print(account.getBalance()+"\t");
				System.out.println();
				}
			}
		}
		
		//예금하기
		//입금하고자 하는 계좌의 게좌번호, 입금액을 입력받아서
		//계좌번호 일치여부를 판단하고 기존 잔액에 입금액을 더해서 잔액으로 만든다.
		private static void deposit() {
			System.out.println("--------");
			System.out.println("입금");
			System.out.println("--------");
			System.out.print("계좌번호 : ");
			String ano = scan.next();
			System.out.print("입금액 : ");
			int money = scan.nextInt();
			//우변의 내용 : findAccount 메소드를 호출하면서 매개변수는 ano로 넘김.
			Account account = findAccount(ano);
			if(account==null) {
				System.out.println("계좌가 없습니다.");
				return;
			}
			int balance= account.getBalance()+ money;
			account.setBalance(balance);
			System.out.println(money+ " 원 입금 되었습니다.");
		}
		
		//출금하기
		//출금하고자 하는 계좌의 게좌번호, 출금액을 입력받아서
		//계좌번호 일치여부를 판단하고 기존 잔액에 출금액을 빼서 잔액으로 만든다.
		private static void withdraw() {
			System.out.println("--------");
			System.out.println("출금");
			System.out.println("--------");
			System.out.print("계좌번호 : ");
			String ano = scan.next();
			System.out.print("출금액 : ");
			int money = scan.nextInt();
			//우변의 내용 : findAccount 메소드를 호출하면서 매개변수는 ano로 넘김.
			Account account = findAccount(ano);
			if(account==null) {
				System.out.println("계좌가 없습니다.");
				return;
			}
			int balance= account.getBalance()- money;
			account.setBalance(balance);
			System.out.println(money+ " 원 출금 되었습니다.");
		
		}
		
		//Account 배열에서 ano와 동일한 Account 객체 찾기
		//고객이 입력한 계좌번호와 저장되어 있는 계좌번호에 대해 일치여부를 판단하는 메소드
		//매개변수 ano
		//리턴타입 Account 클래스
		private static Account findAccount(String ano) {
			//Account 클래스 타입의 변수 선언 (처리가 끝난후 값을 주기 위해)
			Account account = null;
			//ano와 일치하는 계좌번호를 찾기 위해 배열의 모든 내용을 반복문을 통해 검색
			for(int i=0;i<accountArray.length;i++) {
				if(accountArray[i]!=null) {
					//배열에 저장되어 있는 계좌번호를 임시로 저장하기 위한 변수
					String dbAno = accountArray[i].getAno();
					//검색된 계좌번호와 매개값으로 받은 ano가 일치하는지 판단
					if(dbAno.equals(ano)) {
						//일치하면 해당 인덱스를 있는 내용을 account 변수에 저장
						account = accountArray[i];
						break;
					}
				}
			}
			return account;
		}

}
