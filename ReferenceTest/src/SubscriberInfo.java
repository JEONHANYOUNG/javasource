
public class SubscriberInfo {
	// �Ӽ� - �̸�,���̵�,�н�����,��ȭ��ȣ,�ּ�
	private String name;
	private String id;
	private String password;
	private String number;
	private String addrees;

	// ������ - �̸�,���̵�,�н����常 �ʱ�ȭ�� �� �� ��ü ����
	public SubscriberInfo(String name, String id, String password) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
	}

	// - �̸�,���̵�,�н�����,��ȭ��ȣ,�ּҸ� �ʱ�ȭ �� �� ��ü ����
	public SubscriberInfo(String name, String id, String password, String number, String addrees) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.number = number;
		this.addrees = addrees;
	}

//��� - ��й�ȣ ����, ��ȭ��ȣ ����, �ּ� ����
	// setter �޼ҵ�
	public void setPassword(String password) {
		this.password = password;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setAddrees(String addrees) {
		this.addrees = addrees;
	}

}
