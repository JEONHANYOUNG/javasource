package exam;

import java.util.Scanner;

public class Degrees {

	public static void main(String[] args) {
		// ȭ�� �µ� => �����µ�
		
		//���� 
		//ȭ���µ� �Է¹ޱ�(����)
		Scanner k = new Scanner(System.in);

	    System.out.println("ȭ���µ� : ");
        int degrees = k.nextInt();
                	    
		//���� ȭ���µ�=> �����µ��� ��ȯ �� ����ϱ�
		//(ȭ���µ�-32)*5/9
        double cels =(degrees-32)*5/9.0;
        System.out.println("���� �µ� : "+cels);
        System.out.printf("���� �µ� : %.4f", cels);
	}

}
