import java.util.Scanner;

public class Body_mass_index {
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);

		System.out.println("ü���� ���� �˻�"); 
		
		System.out.println("�̸� : "); 
		String name = k.next();
		
		System.out.println("Ű : "); 
		double height = k.nextDouble();
		
		if (height >= 3) {
			height /= 100;
		}
		
		System.out.println("������ : "); 
		double weight = k.nextDouble();
		
		System.out.println("�� �� �� �� �� �� �� �� �� �� ��");
		double bmi = weight / (height * height);
		System.out.printf("BMI : %.1f\n", bmi);
		if(bmi >= 35) {
			System.out.println("���񸸤�_�б����ƿ�!");
		}else if(bmi >= 30) { 
			System.out.println("��ü�ߵ� ���� �ǰ��ؿ�!");
		} else if(bmi >= 25) { 
			System.out.println("�浵���� �Ϳ�����.");
		} else if(bmi >= 23) { 
			System.out.println("��ü���� ����..�׳� �����ؿ�.");
		} else if(bmi >= 18.5) { 
			System.out.println("���� �� �弼��!");
		} else {
			System.out.println("��ü���̿����_��");
		}
	}
}
