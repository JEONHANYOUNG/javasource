package inheritance;

public class Account2 {
	// �Ӽ� : ���¹�ȣ(122-01-12222),�ܾ�,�̸�
	private String accountNo;
	private int balance;
	private String name;

	// ������ �ۼ�
	// [���콺 ������]-[source]-[Generate Constructor using Fields...] => �Ϲ� ������
	// [���콺 ������]-[source]-[Generate Constructor using Super class...] => default ������

	// �⺻ ������
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

	// �ܺηκ��� ���� �޾Ƽ� ��������� ���� �����ϴ� �۾� ��
	// set~ ���� �޼ҵ带 �ۼ��Ѵ�.

	// ������� : ���¹�ȣ�� �����ϰ� �ʹٸ�?
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	// �ܾ�
	public void setBalance(int balance) {
		this.balance = balance;
	}

	// �̸��� �����ϰ� �ʹٸ�?
	public void setName(String name) {
		this.name = name;
	}

	// ��� ������ ���� �����ϰ� �ʹٸ�?
	// get~~
	public int getBalance() {
		return balance;
	}

	// ��� : �Ա��Ѵ�. (�Է°�: �Աݾ�, ��ȯ��: ����) �����ܾ� += �Աݾ�
	void deposit(int amount) {
		balance += amount;
	}

	// ����Ѵ�. (�Է°�: �Աݾ�, ��ȯ��: ����) �����ܾ� -= ��ݾ�
	int withdraw(int amount) {
		if (balance > amount) {
			balance -= amount;
		}
		return balance;
	}
}