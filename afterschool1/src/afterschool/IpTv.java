package afterschool;

public class IpTv extends ColorTv{

	private String ip;

	public IpTv(int size, int color, String ip) {
		super(size, color);
		this.ip = ip;
	}

	//오버라이딩
	@Override
	public void printProperty() {
		System.out.printf("나의 IPTV는 %s," + " 주소의 %d인치 %d컬러",ip,getSize(),getColor());
	}
}
