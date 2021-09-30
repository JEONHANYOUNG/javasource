package inheritance;

public class TV2  {
	// 속성(필드, 멤버변수, 프로퍼티): 색상,전원상태,채널 ect...

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
	
	// 동작(메소드): 채널을 변경(증가/감소)하다, 전원을 켜다/끄다 ect...

	void channelUp() {
		//channelUp 가 해야 하는 작업 작성
		channel++;
	}

	void channelDown() {
		//channelDown 이 해야 하는 작업 작성
		channel--;
	}
	void power() {
		//power 가 해야 하는 작업 작성
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


