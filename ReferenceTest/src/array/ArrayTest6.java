package array;

public class ArrayTest6 {

	public static void main(String[] args) {
		// 이차원 배열
		int scores[][]	= new int [2][3];
		
		//초기화
		
		scores[0][0] = 15;
		scores[0][1] = 25;
		scores[0][2] = 35;
		
		scores[1][0] = 45;
		scores[1][1] = 55;
		scores[1][2] = 65;

		//확인
		System.out.println("배열 길이(행) : "+scores.length);
		System.out.println("배열 길이(열) : "+scores[0].length);
		
		
		for (int i=0;i<scores.length;i++) {
			for(int j=0;j<scores[i].length;j++) {
				System.out.print(scores[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int score[]:scores) {
			for(int j:score) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		int arr[][] = {
				{15, 25},
				{65, 85, 95}
		};
		for(int i[]:arr) {
			for(int j:i) {
				System.out.print(j+" ");
			}
		}
			System.out.println();
	
			//배열명 출력
		System.out.println(scores); //[[I@2a139a55
		System.out.println(arr); //[[I@15db9742
	}
}

