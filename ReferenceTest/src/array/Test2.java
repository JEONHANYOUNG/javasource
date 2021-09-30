package array;

public class Test2 {

	public static void main(String[] args) {
		int oldArr[] = {10,20,30};
		
		int newArr[] = new int[4];
		
		//기존 값 새로운 값으로 복사
//		for(int i=0;i<oldArr.length;i++) {
//			
//		}
		
		System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);
		
		
		newArr[3] = 40;
		
		for(int i:newArr) {
			System.out.print(i+" ");
		}
	}

}
