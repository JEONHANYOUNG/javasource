package inheritance;

public class TV2  {
	// �Ӽ�(�ʵ�, �������, ������Ƽ): ����,��������,ä�� ect...

	public TV2(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
	}

	private String color; // red, blue, green...
	private boolean power; // on, off
	private int channel;

	//public TV2() {
	//	super();
	//}
	
	// ����(�޼ҵ�): ä���� ����(����/����)�ϴ�, ������ �Ѵ�/���� ect...

	void channelUp() {
		//channelUp �� �ؾ� �ϴ� �۾� �ۼ�
		channel++;
	}

	void channelDown() {
		//channelDown �� �ؾ� �ϴ� �۾� �ۼ�
		channel--;
	}
	void power() {
		//power �� �ؾ� �ϴ� �۾� �ۼ�
		power = !power;
	}

	public String getColor() {
		return color;
	}

	public boolean isPower() {
		return power;
	}

	public int getChannel() {
		return channel;
	}


}


