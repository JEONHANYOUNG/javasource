package array;

public class ArrayTest9 {

	public static void main(String[] args) {
		int score[][] = { 
				{ 100, 100, 100 }, 
				{ 20, 20, 20 }, 
				{ 30, 40, 30 }, 
				{ 40, 50, 20 }, 
				{ 50, 60, 50 } };

//		int result[][]=new int[6][4];
		int result[][] = new int[score.length + 1][score[0].length + 1];

		// score 값을 result로 옮기기
		// 합계를 구해서 값을 추가

		for (int i = 0; i < score[i].length; i++) {
			for (int j = 0; j < score[j].length; j++) {
				// 옮기기
				result[i][j] = score[i][j];
				// 행합계
				result[i][result[i].length - 1] += result[i][j];
				// 전체합계
				result[result.length - 1][result[i].length - 1] += score[i][j];
			}
			result[result.length - 1][0] += result[i][0];
			result[result.length - 1][1] += result[i][1];
			result[result.length - 1][2] += result[i][2];

		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[j].length; j++) {
				System.out.printf("%5d", result[i][j]);
			}
			System.out.println();
		}

	}

}
