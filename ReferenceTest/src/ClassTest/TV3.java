package ClassTest;

public class TV3 {
	// �Ӽ�(�ʵ�, �������, ������Ƽ): ����,��������,ä�� ect...
	private String color; 
	private boolean power; 
	private int channel;

	// ������
	TV3() {
		// default(�⺻) ������
		// ��������� �����ڰ� �ϳ��� ������� �ʾҴٸ� �����Ϸ��� �ڵ����� ����
		
	}
	TV3(String color,int channel){
	    this.color = color;
	    this.channel = channel;
	}
	public TV3(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
	}

	
	// ����(�޼ҵ�): ä���� ����(����/����)�ϴ�, ������ �Ѵ�/���� ect...

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	void channelUp() {
		// channelUp �� �ؾ� �ϴ� �۾� �ۼ�
		channel++;
	}

	void channelDown() {
		// channelDown �� �ؾ� �ϴ� �۾� �ۼ�
		channel--;
	}

	void power() {
		// power �� �ؾ� �ϴ� �۾� �ۼ� 
		power = !power; 
	}
}
