package afterschool;

public class Exam8 {

	public static void main(String[] args) {
		// 배열 => 힙(new)
		
		// 배열 선언
		int arr[];
		
		// 생성
		arr= new int[10];
		
		// 초기화 1 ~ 10 까지 값을 대입
        for(int i=0;i<arr.length;i++) {
        	//System.out.print(arr[i]+ " ");
        	arr[i]=i+1;
        }
        
        // 사용
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+ " ");
        	
		}
        
        System.out.print(arr[10]);
   }
}
