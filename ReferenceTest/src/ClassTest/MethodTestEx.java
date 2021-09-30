package ClassTest;

public class MethodTestEx {

	public static void main(String[] args) {
		MethodTest1 obj = new MethodTest1();
		
		
		//메소드 호출시 리턴되는 값이 있는 경우
		//print() 하기
		System.out.print(obj.isRedirect());
		//리턴되는 값 받기 --->이걸 더 많이 사용
		boolean result=obj.isRedirect();
		//result를 이용해서 코드 작성
		
		int var1=obj.num();
	
		System.out.println(obj.add(25, 35));
	}

}
