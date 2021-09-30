package abstractTest;

public class AiCarEx {

	public static void main(String[] args) {
		AiCar ai = new AiCar("black");
		
		ai.start();
		ai.drive();
		ai.stop();
		
		// Cannot instantiate the type Car
		// 추상 클래스는 객체 생성 불가
		// Car car = new Car();
		Car car = new AiCar("white");
        car.stop();
        car.drive();
        car.stop();
	}
}
