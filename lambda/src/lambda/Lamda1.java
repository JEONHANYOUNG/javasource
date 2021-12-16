package lambda;

public class Lamda1 {
	
	int max(int a, int b) {
		return a > b ? a : b;
	}
	
	//람다식으로 전환(아래로 내려 갈수록 단순해
	//(int a, int b) -> {return a > b ? a : b;}
	//(int a, int b) -> a > b ? a : b;
	//(a,b) -> a > b ;
	
	void printVar(String name, int i) {
		System.out.println(name + "=" + i);
	}
	
	//(String name, int i) -> {System.out.println(name + "=" + i); }
	//(String name, int i) -> System.out.println(name + "=" + i); 
	//(name, i) -> System.out.println(name + "=" + i); 
	
	int square(int x) {
		return x * x;
	}
	//(int x) -> {return x * x ; }
	//(int x) -> x * x; 
	// x-> x * x

	
	//괄호안에 두개면 무조건 해주고 하나면 생략 가능
	
	int roll() {
		return (int)(Math.random() * 6);
	}
	// () -> { return (int)(Math.random() * 6); }
	// () -> (int)(Math.random() * 6);

}





