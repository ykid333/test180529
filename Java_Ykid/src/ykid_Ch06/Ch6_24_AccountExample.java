package ykid_Ch06;

public class Ch6_24_AccountExample {

	public static void main(String[] args) {
		Ch6_24_Account account = new Ch6_24_Account();
		
		account.setBalance(10000);
		System.out.println("현재잔고 : " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재잔고 : " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재잔고 : " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재잔고 : " + account.getBalance());

	}

}
