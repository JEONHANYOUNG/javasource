package ClassTest;

public class Triangle3 {
	// �ﰢ�� ���� ���ϱ�

	// �غ�*����/2

	// �Ӽ� : �غ�, ����
	private int baseline;
	private int height;

	// �����ڴ� �⺻ ������
	// Triangle2(){};

	// Triangle2() is undefined

	Triangle3(int baseLine, int height) {
		this.baseline = baseline;
		this.height = height;
	}

	// ���(�޼ҵ�) : �غ�*����/2 ��� ����
	int getArea() {
		return baseline * height / 2;
	}
}
