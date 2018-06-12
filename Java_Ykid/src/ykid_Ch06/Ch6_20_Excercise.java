package ykid_Ch06;

public class Ch6_20_Excercise {
	
	private String ownerName;
	private int accountNumber;
	private int balance;
	int deposit;
	int widthdraw;
	public String getOwnerName() {
		return ownerName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public int getDeposit() {
		return deposit;
	}
	public int getWidthdraw() {
		return widthdraw;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	void Deposit(int deposit) {
		this.balance = balance+deposit;
	}
	
	void Widthdraw(int widthdraw) {
		this.balance = balance-widthdraw;
	}
	
	void result() {
		System.out.println("예금주 이름 : " +ownerName);
		System.out.println("계좌번호 : " +this.accountNumber);
		System.out.println("잔고 : " +this.balance);
	}
	

}
