package afterschool;

public class IpTv extends ColorTv{

	private String ip;

	public IpTv(int size, int color, String ip) {
		super(size, color);
		this.ip = ip;
	}

	//�������̵�
	@Override
	public void printProperty() {
		System.out.printf("���� IPTV�� %s," + " �ּ��� %d��ġ %d�÷�",ip,getSize(),getColor());
	}
}
