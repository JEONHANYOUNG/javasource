package ClassTest;

public class CarEx {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.company = "����";
		car.model = "KONA";
		car.color = "RED";
		car.maxSpeed = 200;
		
		car.forward();
		car.backward();
		System.out.print(car.company);

	}

}
