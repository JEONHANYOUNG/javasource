package ClassTest;

public class AccountEX {

	public static void main(String[] args) {
		Account account1 = new Account();
		account1.accountNo = "122-01-12222";
		account1.balance = 10000;
		account1.name = "ȫ�浿";

		// �Ա�
		account1.deposit(50000);

		// ���
		System.out.println("���� �ܾ�: " + account1.withdraw(30000));

	}

}
