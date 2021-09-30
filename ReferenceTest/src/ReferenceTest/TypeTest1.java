package ReferenceTest;

public class TypeTest1 {

	public static void main(String[] args) {
		// 타입 - 1)기본타입 2)참조타입
		// 변수의 메모리가 사용되는 방식이 달라짐

		// 기본 타입의 형태(stack 영역 안에 생성 된다)
		int age = 25;
		double price = 200.3;
		
		// 참조 타입의 형태(heap 영역 안에 생성 된다)/null 초기화 가능
		// 문자열 생성 : String name= new String("java")
		String name = "java";
		String name2 = new String("java");
		String hobby = null; //아직 heap 영역이 할당되지 않은 것을 의미
		
		// 값 비교 ==, !=
		// But, String 비교 시 equals();
		
		System.out.println(name==name2 ? "동일함" : "다름");
		System.out.println(name.equals(name2) ? "동일함" : "다름");
		System.out.println(hobby);
		//java.lang.NullPointerException 앞으로 자주 만날 오류 상황
		//기본 타입을 벗어나기 때문에 엄청나게 많이 만날 거임
		//멈추는 상황
		//어디서 오류가 났는지 알려준다
		
		System.out.println(hobby.length());
	}

}
