package afterschool;

public class Exam7 {

	public static void main(String[] args) {
		// a ~ z ���
		// for��
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
		
		//while ��
		//char ch='a';
		//while (ch<='z');
		//System.out.print(ch + " ");
		//ch++;
	}

}
