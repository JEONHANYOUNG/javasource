package lambda;

public class LamdaEx5 {
	// 매개변수로 전달하는 람다식
	public static void execute(LamdaTest5 lambda) {
		lambda.run();
	}
	
	//반환 값으로 쓰이는 람다식
	public static LamdaTest5 getRun() {
		LamdaTest5 obj1 = () -> System.out.println("함수형 인터페이스 리턴");
		return obj1;
	}
	
	public static void main(String[] args) {
		//람다식
		LamdaTest5 lambda = () -> System.out.println("Lamda!!!! run");
		lambda.run();
		
		System.out.println("--------------------------");
		execute(getRun());
		System.out.println("--------------------------");
	
	}
	
	
}
