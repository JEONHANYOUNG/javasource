package inheritance;

public class TV {
	// �Ӽ�(�ʵ�, �������, ������Ƽ): ����,��������,ä�� ect...

	String color; // red, blue, green...
	boolean power; // on, off
	int channel;

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
}
