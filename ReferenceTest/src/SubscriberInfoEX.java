
public class SubscriberInfoEX {
	public static void main(String[] args) {
		SubscriberInfo info1 = new SubscriberInfo("ȫ�浿", "hong123", "hong123");
		SubscriberInfo info2 = new SubscriberInfo("ȫ�浿", "hong123", "hong123", "010-1234-5678", "����� ���α�");

		// ȫ�浿 ��ȭ��ȣ �߰�
		info1.setNumber("010-1234-1234");

		// ������ �ּ� ����
		info2.setAddrees("����� ������");
	}

}
