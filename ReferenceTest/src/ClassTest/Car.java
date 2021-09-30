package ClassTest;

public class Car {
	//속성:제조회사,모델
	String company;
	String model;
	String color;
	int maxSpeed;
	
	//Car()[] -> 기본생성자(default)
	//클래스 내에 선언된 생성자가 하나도 없으면
	//컴파일러가 자동으로 기본 생성자를 만들어줌

	
	
	//동작-메소드
	//리턴타입 ex) 메소드명(){}
	void forward() {
		System.out.println("전진하다");
	}
		void backward() {
		System.out.println("후진하다");
	}
	
}
