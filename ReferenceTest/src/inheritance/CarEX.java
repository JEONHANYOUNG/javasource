package inheritance;

public class CarEX {

	public static void main(String[] args) {
		FireEngine f;
		Ambulance a;
		
		//f =a; 상속관계가 아닌 클래스간의 형변환 불가
	
		f = new FireEngine();
		// Car car = new FireEngine();
		Car car = f; //상속관계는 형변환 가능	//업캐스팅(형변환 생략가능)
		
		FireEngine f2;
		f2 = (FireEngine) car; //다운 캐스팅(형변환 생략 불가)
		f2.water();
		
		
		
		
		
	}

}
