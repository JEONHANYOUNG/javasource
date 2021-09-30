
public class TriangleEX3 {

	public static void main(String[] args) {
		// 길이가 서로 다른 삼각형 5개를 가지고 있다.
		// 넓이 구하기
		Triangle3 triArr[] = new Triangle3[5];

		triArr[0] = new Triangle3(10, 15);
		triArr[1] = new Triangle3(9, 14);
		triArr[2] = new Triangle3(5, 3);
		triArr[3] = new Triangle3(8, 6);
		triArr[4] = new Triangle3(11, 7);

		triArr(triArr);
	}

	static void triArr(Triangle3 triArr[]) {
		// 면적 구하기
		for (int i = 0; i < triArr.length; i++) {
			System.out.println("면적 " + triArr[i].getArea());
		}
	}

}
