package afterschool;

public abstract class MessageSender {
	// 1) �޴� ���,����,������ ���
	private String receiverName;
	private String message;
	private String senderName;

	// 2) ������ �����
	public MessageSender() {
		super();
	}

	public MessageSender(String receiverName, String message, String senderName) {
		super();
		this.receiverName = receiverName;
		this.message = message;
		this.senderName = senderName;
	}

	// ������ => 1�� ���
	//public void sendMessage() {
	//	System.out.println("������");
	//}

	//2�� ��� : MessageSender ��ü ���� x
	//       : MessageSender �� �ڽ�Ŭ������ ���ؼ��� ����ϰڴ�.
	public abstract void sendMessage();

}
