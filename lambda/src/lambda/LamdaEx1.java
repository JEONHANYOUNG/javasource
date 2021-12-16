package lambda;

public class LamdaEx1 {

	public static void main(String[] args) {
		//인터페이스를 익명구현으로 사용
//		LamdaTest1 obj1 = new LamdaTest1() {
//			@Override
//			public void method1() {
//				System.out.println("함수형 인터페이스");
//				int i = 10;
//				System.out.println(i * i);
//			}
//		};
//		obj1.method1();
		
		
		LamdaTest1 obj = () -> System.out.println("함수형 인터페이스");
		obj.method1();
		
		
		obj = () -> {
			int i = 10;
			System.out.println(i * i);
		};
		obj.method1();
	}

}
