package lambda;

public class Lamda1 {
	
	int max(int a, int b) {
		return a > b ? a : b;
	}
	
	//���ٽ����� ��ȯ(�Ʒ��� ���� ������ �ܼ���
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

	
	//��ȣ�ȿ� �ΰ��� ������ ���ְ� �ϳ��� ���� ����
	
	int roll() {
		return (int)(Math.random() * 6);
	}
	// () -> { return (int)(Math.random() * 6); }
	// () -> (int)(Math.random() * 6);

}





