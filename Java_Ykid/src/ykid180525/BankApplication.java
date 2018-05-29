package ykid180525;

import java.util.Scanner;

public class BankApplication {
	
	private static int i = 0;
	private static int k;
	private static Account[] accountArray = new Account[100];
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean run = true;
		while (run) {
			System.out.println("---------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------");
			System.out.print(k);
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
		private static void createAccount() {
			
			System.out.println("--------");
			System.out.println("계좌생성");
			System.out.println("--------");
			System.out.print("계좌번호 : ");
			String ano = scan.next(); //계좌번호 입력을 위한 변수
			System.out.print("계좌주 : ");
			String owner = scan.next();//계좌주
			System.out.print("초기입금액 : ");
			int balance = scan.nextInt();
			System.out.print("결과: 계좌가 생성되었습니다.\n");
			
			Account account = new Account(ano, owner, balance);
			
			accountArray[i]=account;  
			i++;
		}
		//계좌 목록보기
		private static void accountList() {
			for(int j=0;j<i;j++) {
			System.out.print(accountArray[j].getAno());
			System.out.print("	");
			System.out.print(accountArray[j].getOwner());
			System.out.print("	");
			System.out.print(accountArray[j].getBalance());
			System.out.println();
			}
			System.out.println();
		}
		
		//예금하기
		private static void deposit() {
			System.out.print("계좌번호 : ");
			String ano = scan.next();
			BankApplication.findAccount(ano);
			
			System.out.println("계좌번호 : "+accountArray[k].getAno()+" 가 확인 되었습니다.");
			System.out.print("예금액 : ");
			int deposit = scan.nextInt();
			int balance= accountArray[k].getBalance()+ deposit;
			accountArray[k].setBalance(balance);
			System.out.println(deposit+ " 원 예금 되었습니다.");
		}
		
		//출금하기
		private static void withdraw() {
			System.out.print("계좌번호 : ");
			String ano = scan.next();
			BankApplication.findAccount(ano);
			System.out.println("계좌번호 : "+accountArray[k].getAno()+" 가 확인 되었습니다.");
			System.out.print("출금액 : ");
			int withdraw = scan.nextInt();
			int balance= accountArray[k].getBalance() - withdraw;
			accountArray[k].setBalance(balance);
			System.out.println(withdraw + " 원 출금 되었습니다.");
		
		}
		
		//Account 배열에서 ano와 동일한 Account 객체 찾기
		
		private static Account findAccount(String ano) {
			k=0;
			while(true) {
				
				if(ano.equals(accountArray[k].getAno())) { 
					return accountArray[k]; //찾은 객체 값을  리턴한다.
				}
				k++;
			}
		}

}
