package ClassTest;

public class Triangle3 {
	// 삼각형 넓이 구하기

	// 밑변*높이/2

	// 속성 : 밑변, 높이
	private int baseline;
	private int height;

	// 생성자는 기본 생성자
	// Triangle2(){};

	// Triangle2() is undefined

	Triangle3(int baseLine, int height) {
		this.baseline = baseline;
		this.height = height;
	}

	// 기능(메소드) : 밑변*높이/2 결과 리턴
	int getArea() {
		return baseline * height / 2;
	}
}
