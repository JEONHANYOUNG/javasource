package interfaceTest;

public class Cat implements Soundable{ // <- 2) implements Soundable �Է�

	@Override// <- 3) sound �Է� �� �ڵ� ����
	public String sound() {
		return "�߿�"; // <- 4) return ���� ū����ǥ ���� �� �Է� 
	}

}
