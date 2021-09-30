package afterschool;

public class CarEx {

	public static void main(String[] args) {
		Car car =new Car();
		
		for (int i=1;i<6;i++) {
			int problemLocation = car.run();
			
			
			switch (problemLocation) {
			case 1: // 앞 왼쪽
				System.out.println("앞 왼쪽 펑크 - 한국타이어 교체");
				// 앞 왼쪽 타이어 교체
				car.frontLeftTire = new HankookTire(15, "앞 왼쪽");
				break;
			case 2: // 앞 오른쪽
				car.frontRightTire =new HankookTire(10, "앞 오른쪽 - 금호타이어 교체");
				System.out.println("앞 뒤쪽 펑크");
				break;
			case 3: // 뒤 왼쪽
				System.out.println("뒤 왼쪽 펑크");
				break;
			case 4: // 뒤 오른쪽
				System.out.println("뒤 오른쪽 펑크");
				break;
			default:
				break;
			}
			System.out.println();
		}

	}

}
