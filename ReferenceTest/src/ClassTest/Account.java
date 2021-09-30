package ClassTest;

public class Account {
	// 속성 : 계좌번호(122-01-12222),잔액,이름
	String accountNo;
	int balance;
	String name;

	// 기본 생성자
	Account() {
	};

	// 기능 : 입금한다. (입력값: 입금액, 반환값: 없음) 현재잔액 += 입금액
	void deposit(int amount) {
		balance += amount;
	}

	// 출금한다. (입력값: 입금액, 반환값: 없음) 현재잔액 -= 출금액
	int withdraw(int amount) {
		if (balance > amount) {
			balance -= amount;
		}
		return balance;
	}
}
