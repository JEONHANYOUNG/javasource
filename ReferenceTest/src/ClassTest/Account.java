package ClassTest;

public class Account {
	// �Ӽ� : ���¹�ȣ(122-01-12222),�ܾ�,�̸�
	String accountNo;
	int balance;
	String name;

	// �⺻ ������
	Account() {
	};

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
