package afterschool;

public class EmailSender extends MessageSender{
	private String title;
	
	public EmailSender(String receiverName, String message, String senderName, String title) {
		super(receiverName,message,senderName);
		this.title = title;
	}

	@Override //�����ޱ�
	public void sendMessage() {
	System.out.println("�̸����� ������.");	
	}
	
	
}
