package interfaceTest;

public class SoundableEx {

	public static void main(String[] args) {
		printSound(new Cat()); // <- 1) class 생성
		printSound(new Dog());
	}
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	// 총 4개를 만들어야 함
	
}
