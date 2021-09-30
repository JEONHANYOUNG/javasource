package ClassTest;

public class AccountEX {

	public static void main(String[] args) {
		Account account1 = new Account();
		account1.accountNo = "122-01-12222";
		account1.balance = 10000;
		account1.name = "홍길동";

		// 입금
		account1.deposit(50000);

		// 출금
		System.out.println("현재 잔액: " + account1.withdraw(30000));

	}

}
