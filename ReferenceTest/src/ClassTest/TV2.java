package ClassTest;

public class TV2 {
	// �Ӽ�(�ʵ�, �������, ������Ƽ): ����,��������,ä�� ect...
	String color; // red, blue, green...
	boolean power; // on, off
	int channel;

	// ������
	TV2() {
		// default(�⺻) ������
		// ��������� �����ڰ� �ϳ��� ������� �ʾҴٸ� �����Ϸ��� �ڵ����� ����
		
	}
	TV2(String color,int channel){
	    this.color = color;
	    this.channel = channel;
	}

	// ����(�޼ҵ�): ä���� ����(����/����)�ϴ�, ������ �Ѵ�/���� ect...

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
