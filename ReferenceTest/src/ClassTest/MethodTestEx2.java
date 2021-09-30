package ClassTest;

public class MethodTestEx2 {

	public static void main(String[] args) {
		MethodTest2 obj = new MethodTest2();
	    
		//구구단 출력 기능
		obj.print99dan();

		//덧셈 기능
		//메소드를 호출하는 쪽에서 입력값을 넣어주기
		obj.sum(11, 15);

		//obj.sum(10.5, 11.5);
		
		byte b1=3;
		byte b2=5;
		
		
		obj.sum(b1, b2);

		
		
	}

}
