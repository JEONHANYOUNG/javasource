package afterschool;

public class Exam13 {

	public static void main(String[] args) {
		int arr[][]= new int[3][2];
      
		System.out.println("행의 길이 "+arr.length);
		System.out.println("열의 길이 "+arr[0].length);
		System.out.println("열의 길이 "+arr[1].length);
		
		
		for (int i = 0; i < arr.length; i++) {//행의 길이
			for (int j = 0; j < arr[i].length; j++) {//열의 길이
				arr[i][j]=j+1;
				
			}
		}
		
		for (int i = 0; i < arr.length; i++) {//행의 길이
			for (int j = 0; j < arr[i].length; j++) {//열의 길이
				System.out.printf("%2d",arr[i][j]);
				
			}
			System.out.println();
		}

  }

}
