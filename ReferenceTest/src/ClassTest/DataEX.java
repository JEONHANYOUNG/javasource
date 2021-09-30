package ClassTest;

public class DataEX {

	public static void main(String[] args) {
		Data data = new Data();
		System.out.println("data:" + data); // classTest.Data@2a139a55;

		// x의 값 10으로 지정
		//data.x = 10;
		//change(data.x); // data 객체 안의 x멤버변수가 가지는 값을 보냄
		//System.out.println("after change () x = " + data.x);

		System.out.println();

		change(data);
		System.out.println("after change () x = " + data.x);
	}

	static void change(int x) {
		x = 10000;
		System.out.println("change () x = " + x);
	}

	static void change(Data d) {
		// d=> 2a139a55
		System.out.println(d);

		d.x = 10000;
		
	}

}
