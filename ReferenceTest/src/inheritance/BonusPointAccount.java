package inheritance;

public class BonusPointAccount extends Account2 {
//계좌번호, 계좌주, 잔액, 보너스 포인트 / 입금하다(보너스 포인트 추가). 출금하다. 

	private int bonusPoint;

	public BonusPointAccount(String accountNo, int balance, String name, int bonusPoint) {
		super(accountNo, balance, name);
		this.bonusPoint = bonusPoint;
	}

	// 입금하다(보너스 포인트 추가). 출금하다.
	@Override
	void deposit(int amount) {
		// 예금하다,
		// setBalance(getBalance()+amount);
		super.deposit(amount);

		// 보너스포인트 += 예금액의 0.1% 보너스 포인트
		bonusPoint += amount * 0.001;

	}

	public int getBonusPoint() {
		return bonusPoint;
	}
}