package afterschool;

public class SenderMain {

	public static void main(String[] args) {
	 //	MessageSender messageSender = new MessageSender(); (x)
		
	 // ��ü ���� => �Ʒ��� �ΰ��� ����� ����ϴ� ���´� extends, implements
	 MessageSender messageSender = new EmailSender("ȫ�浿", "�ȳ��ϼ���", "������", "�ȳ�");
	 EmailSender emailSender =new EmailSender("ȫ�浿", "�ȳ��ϼ���", "������", "�ȳ�");
				
	}

}
