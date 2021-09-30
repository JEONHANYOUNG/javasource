package afterschool;

import java.util.Scanner;

public abstract class Converter {
	abstract protected double convert(double src); // �߻�޼ҵ�
	abstract protected String getSrcString(); // �߻�޼ҵ�
	abstract protected String getDestString(); // �߻�޼ҵ�
	protected void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString()+ "�� " + getDestString() + " �� �ٲߴϴ�.");
		System.out.println(getSrcString() + "�� �Է��ϼ���>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ��� : "+ res+getDestString()+ "�Դϴ�");
        scanner.close();
         }
}

