package afterschool;

public class Exam14 {

	public static void main(String[] args) {
		int arr[][]= {
				{45,55},
				{65,95,85},
				{78,88,88,56}
		};
      
		System.out.println("행의 길이 "+arr.length);
		System.out.println("열의 길이 "+arr[0].length);
		System.out.println("열의 길이 "+arr[1].length);
		System.out.println("열의 길이 "+arr[2].length);		
		
				
		for (int i=0;i<arr.length;i++) {//행의 길이
			for (int j=0;j<arr[i].length;j++) {//열의 길이
				System.out.printf("%d ",arr[i][j]);
				
			}
			System.out.println();
		}

  }

}
