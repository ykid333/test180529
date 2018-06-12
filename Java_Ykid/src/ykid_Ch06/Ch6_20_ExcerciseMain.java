package ykid_Ch06;

public class Ch6_20_ExcerciseMain {

	public static void main(String[] args) {
		
		Ch6_20_Excercise acct = new Ch6_20_Excercise();

		//계좌의 예금주를 '홍길동' 으로 한다.
		acct.setOwnerName("홍길동");
		
		//계좌번호는 101로 한다.
		acct.setAccountNumber(101);
		
		//계좌의 초기 입금액은 10,000원 이다.
		acct.setBalance(10000);
		
		//계좌에 3,000원을 입금한다.
		acct.Deposit(3000);
		
		//계좌에서 5,000원을 출금한다.
		acct.Widthdraw(5000);
		
		//계좌의 내역을 출력한다.
		acct.result();

	}

}
