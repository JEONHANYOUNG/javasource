package inheritance;

public class Account2 {
	// 속성 : 계좌번호(122-01-12222),잔액,이름
	private String accountNo;
	private int balance;
	private String name;

	// 생성자 작성
	// [마우스 오른쪽]-[source]-[Generate Constructor using Fields...] => 일반 생성자
	// [마우스 오른쪽]-[source]-[Generate Constructor using Super class...] => default 생성자

	// 기본 생성자
	//public Account2() {
	//	super();
	//}

	public Account2(String accountNo, int balance, String name) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
		this.name = name;
	}

	//public Account2(String accountNo, String name) {
	//	super();
	//	this.accountNo = accountNo;
	//	this.name = name;
	//}

	// 외부로부터 값을 받아서 멤버변수의 값을 변경하는 작업 시
	// set~ 으로 메소드를 작성한다.

	// 멤버변수 : 계좌번호를 변경하고 싶다면?
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	// 잔액
	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 이름을 변경하고 싶다면?
	public void setName(String name) {
		this.name = name;
	}

	// 멤버 변수의 값을 리턴하고 싶다면?
	// get~~
	public int getBalance() {
		return balance;
	}

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
