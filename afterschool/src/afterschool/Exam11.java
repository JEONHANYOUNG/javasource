package afterschool;

public class Exam11 {

	public static void main(String[] args) {
		// �迭 => ��(new)
		
		// �迭 ����� ����, �ʱ�ȭ
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
	
		// ���
        for(int i=0;i<arr.length;i++) {
		        	System.out.print(arr[i]+ " ");
		        	
		        	
		}
         System.out.println();
		        
	        
        //���� for�� 
        //for (int j:arr<- �׻� ����) {
     		//System.out.print(j+" ");
	    //				
		//}

        for (int j:arr) {
      	    System.out.print(j+" ");
 		
        }
         
	}

}
