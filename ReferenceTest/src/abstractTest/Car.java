package abstractTest;

/* 추상클래스 :
 * 추상 : 구체적인 내용 배제하고 공통된 부분만을 만들어 주는 작업 , 중괄호 => 구체화 작업
 * 
 * 
 * 
 */


public abstract class Car {
	
	//멤버변수
	private String color;
	
	//생성자 
	public Car(String color) {
		super();
		this.color = color;
	}
	
	//일반 메소드
	public void start() {
		System.out.println("자동차 출발");
		
	}
    
	//추상 메소드
	abstract void drive();
	abstract void stop();
	
}
