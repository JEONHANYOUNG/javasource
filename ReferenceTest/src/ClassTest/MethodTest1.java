package ClassTest;

public class MethodTest1 {
	// 리턴값 true 혹은 false를 리턴하는 메소드
	
	boolean isRedirect() {
		return false;
	}
	
	// 리턴값이 int 타입인 메소드
	
	int num () {
		return 10;
	}
	
	// 리턴값이 int 타입, 두 개의 전달인자(int)를 받기

	int multiply (int num1, int num2) {
		return num1+num2;
	}
	
	// 리턴값: long, 두 개의 전달인자(int)를 받기
	
	long add (long num1, long num2) {
		return num1+num2;
	}
	
	
	// 리턴값: char 메소드
	
	
	char method () {
		return 'c';
	}
		
	// 아무것도 return하지 않을 때 메소드 void(넘기는 값이 없다)
		
		void method1() {
				
		}
		//리턴타입: int형 1차원 배열
		//전달인자: int형 1차원 배열
		int[] print(int arr[]) {
			return arr;		
	}
		
		//리턴타입 : double, 매개변수 : 두개의 double
		//method가 해야할 일: 받은 두개의 매개변수를 나누기한 결과 리턴
		
		double divide(double a, double b) {
			return a/b;
			
		}
		
}
