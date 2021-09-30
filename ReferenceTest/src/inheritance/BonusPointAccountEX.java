package inheritance;

public class BonusPointAccountEX {

	public static void main(String[] args) {
		BonusPointAccount bonus = new BonusPointAccount("122-12", 10000, "홍길동", 100);
		bonus.deposit(10000);
		
		System.out.println("현재잔액 : "+bonus.getBalance());
		System.out.println("현재보너스포인트 : "+bonus.getBonusPoint());
	}

}
