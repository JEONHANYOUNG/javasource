package ClassTest;

public class CarEx2 {

	public static void main(String[] args) {
		
		//ù��° ��
		//��ü ���� �� �����ڰ� �ڵ� ȣ���
		Car2 car = new Car2();
		//�⺻ �Ӽ����� String - null, int - 0
		//boolean - false, double - 0.0
		
		
		//�ι�° ��
		//��ü ���� �� �����ڰ� �ڵ� ȣ���
		Car2 car2 = new Car2("kona");
		//����° ��
		//��ü ���� �� �����ڰ� �ڵ� ȣ���
		Car2 car3 = new Car2("kona", "black");
		//�׹�° ��
		//��ü ���� �� �����ڰ� �ڵ� ȣ���
		Car2 car4 = new Car2("����", "kona", "black",250);
		
//		car.company = "����";
//		car.model = "KONA";
//		car.color = "RED";
//		car.maxSpeed = 200;
		
		car.forward();
		car.backward();
//		System.out.print(car.company);

		//�ι�° ��
		
//		Car2 car2 = new Car2();
		
//		car2.company = "����";
//		car2.model = "��Ÿ��";
//		car2.color = "black";
//		car2.maxSpeed = 250;
		
//		car.forward();
//		car.backward();
//		System.out.print(car.company);
		

	}

}
