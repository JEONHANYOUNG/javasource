package interfaceTest;

public class Cat implements Soundable{ // <- 2) implements Soundable 입력

	@Override// <- 3) sound 입력 후 자동 생성
	public String sound() {
		return "야옹"; // <- 4) return 옆에 큰따옴표 생성 후 입력 
	}

}
