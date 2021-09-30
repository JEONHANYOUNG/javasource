package afterschool;

public class Exam7 {

	public static void main(String[] args) {
		// a ~ z 출력
		// for문
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
		
		// do ~ while
		char ch='a';
		do {System.out.print(ch + " ");
			ch++;
		} while (ch<='z');
		
		System.out.println();
		
		//while 문
		//char ch='a';
		//while (ch<='z');
		//System.out.print(ch + " ");
		//ch++;
	}

}
