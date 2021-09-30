package ClassTest;

public class TV3 {
	// 속성(필드, 멤버변수, 프로퍼티): 색상,전원상태,채널 ect...
	private String color; 
	private boolean power; 
	private int channel;

	// 생성자
	TV3() {
		// default(기본) 생성자
		// 명시적으로 생성자가 하나도 선언되지 않았다면 컴파일러사 자동으로 만들어냄
		
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

	
	// 동작(메소드): 채널을 변경(증가/감소)하다, 전원을 켜다/끄다 ect...

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
		// channelUp 가 해야 하는 작업 작성
		channel++;
	}

	void channelDown() {
		// channelDown 이 해야 하는 작업 작성
		channel--;
	}

	void power() {
		// power 가 해야 하는 작업 작성 
		power = !power; 
	}
}
