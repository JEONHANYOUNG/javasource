package test;

public class ForTest1 {

	public static void main(String[] args) {
		// ;

		// for ���� ����
		// �� int i = 0;
		// �� i <10;
		// �� �ݺ��ؾ��� �۾� ���� => System.out.println("�ȳ��ϼ���");
		// �� i++(i=i+1) => i=1
		// �� i <10;
		// �� �ݺ��ؾ��� �۾� ���� => System.out.println("�ȳ��ϼ���");
		// �� i++(i=i+1) => i=2
		// �� i <10;
		// �� �ݺ��ؾ��� �۾� ���� => System.out.println("�ȳ��ϼ���");
		// �ݺ�...
		// i=9
		// i <10;
		// �ݺ��ؾ��� �۾� ����=> System.out.println("�ȳ��ϼ���");
		// i=10
		// i <10; ���� �Ҹ��� =>for ������ �������� => for ����

		for (int i = 0; i < 10; i++) {
			System.out.println("�ȳ��ϼ���");
		}

		System.out.println();

		// 1~10���� ���
		// �� int i = 1;
		// �� i <11;
		// �� �ݺ��ؾ��� �۾� ���� => System.out.println(i);
		// �� i++ => 2
		// �� i <11;
        // int i
		for (int i = 1; i < 11; i++) {
			System.out.println(i);

			
		}
		//i=i+1 => i++;
		//i=i+2 => i+=2;
		// 0~10���� ¦���� ���
		for (int i =0;i < 11; i+=2) {
			System.out.print(i+"\t");
		}

		System.out.println();
		
			
		// 1~100������ ���� �߿��� 3�� ������� ���ϴ� ���α׷� �ۼ�
		// ��, 9�� ����� ������ �ʱ�
			
		
			int sum = 0;
			for (int i = 1; i < 100; i++){
				if(i%3 == 0 && i%9!=0) {
					sum = sum + i;
				}
			}
			System.out.println("3�� ��� 9�� ����� �ƴ� �� : " +sum);
				
			System.out.println();
			
			//1~100���� ���� �߿��� 3�� ����̰ų�, 5�� ����� ���� ��
			
			int sum2 = 0;
			for (int i = 1;i<101;i++) {
				if(i%3 == 0 || i%5==0){
					sum2=sum2+i;
				}
			}
			System.out.println("3�� ����̰ų�, 5�� ����� ���� �� : " +sum2);
			
		}
		
	}

