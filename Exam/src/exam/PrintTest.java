package exam;

public class PrintTest {

	public static void main(String[] args) {

		int a = 3;
		int b = 4;

		System.out.print(true);
		// +: 문자열과 같이 사용을 하게되면 연결의 의미로 사용됨
		System.out.println("아무거나" + (a+1)); // 공백허용 => 엔터한번
		System.out.println(a + b);

		// System.out.prinf();
		String str = "abc" + 3;
		System.out.println(str);
	}

}
