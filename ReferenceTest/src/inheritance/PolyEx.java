package inheritance;


public class PolyEx {

	public static void main(String[] args) {
		
		Parent2 p2 = new Child3();
		p2.field="";
		p2.method1();
		p2.method2(); // 오버라이딩 된 상태라면 자식클래스의 메소드가 실행
		
		//methode3 실행;
		Child3 c = (Child3)p2;
		c.method3();
		
		
		//Parent2 obj = new Parent2();
		//Child3 c2 = (Child3) obj; //
		//c2.method3();
		
	}

	
}
