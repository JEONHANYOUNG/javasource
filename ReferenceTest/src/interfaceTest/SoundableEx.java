package interfaceTest;

public class SoundableEx {

	public static void main(String[] args) {
		printSound(new Cat()); // <- 1) class ����
		printSound(new Dog());
	}
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	// �� 4���� ������ ��
	
}
