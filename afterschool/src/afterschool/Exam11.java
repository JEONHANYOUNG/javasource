package afterschool;

public class Exam11 {

	public static void main(String[] args) {
		// 배열 => 힙(new)
		
		// 배열 선언과 생성, 초기화
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
	
		// 사용
        for(int i=0;i<arr.length;i++) {
		        	System.out.print(arr[i]+ " ");
		        	
		        	
		}
         System.out.println();
		        
	        
        //향상된 for문 
        //for (int j:arr<- 항상 고정) {
     		//System.out.print(j+" ");
	    //				
		//}

        for (int j:arr) {
      	    System.out.print(j+" ");
 		
        }
         
	}

}
