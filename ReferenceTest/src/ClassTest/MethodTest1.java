package ClassTest;

public class MethodTest1 {
	// ���ϰ� true Ȥ�� false�� �����ϴ� �޼ҵ�
	
	boolean isRedirect() {
		return false;
	}
	
	// ���ϰ��� int Ÿ���� �޼ҵ�
	
	int num () {
		return 10;
	}
	
	// ���ϰ��� int Ÿ��, �� ���� ��������(int)�� �ޱ�

	int multiply (int num1, int num2) {
		return num1+num2;
	}
	
	// ���ϰ�: long, �� ���� ��������(int)�� �ޱ�
	
	long add (long num1, long num2) {
		return num1+num2;
	}
	
	
	// ���ϰ�: char �޼ҵ�
	
	
	char method () {
		return 'c';
	}
		
	// �ƹ��͵� return���� ���� �� �޼ҵ� void(�ѱ�� ���� ����)
		
		void method1() {
				
		}
		//����Ÿ��: int�� 1���� �迭
		//��������: int�� 1���� �迭
		int[] print(int arr[]) {
			return arr;		
	}
		
		//����Ÿ�� : double, �Ű����� : �ΰ��� double
		//method�� �ؾ��� ��: ���� �ΰ��� �Ű������� �������� ��� ����
		
		double divide(double a, double b) {
			return a/b;
			
		}
		
}
