
public class TriangleEX {

	public static void main(String[] args) {
		// �ﰢ�� ���� ���ϱ�
		Triangle triangle1 = new Triangle();
		triangle1.baseline = 10;
		triangle1.height = 15;
		System.out.println("���� " + triangle1.getArea());

		Triangle triangle2 = new Triangle();
		triangle2.baseline = 15;
		triangle2.height = 25;
		System.out.println("���� " + triangle2.getArea());

	}

}
