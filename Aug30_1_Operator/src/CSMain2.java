import java.util.Scanner;

// �߰���� : 
// �⸻��� :
// --------
// ��� :  
// �Ҽ��� �� �ڸ���
public class CSMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("�߰���� : ");
		int middle = k.nextInt();
		
		System.out.print("�⸻��� : ");
		int final2 = k.nextInt();
		
		double avg = (middle + final2) / 2.0;
		System.out.printf("��� : %.1f\n", avg);

		if(avg >= 90) {
			System.out.println("��");
		}else {
			System.out.println("������?");
		}
		if(avg >= 80) { 
			System.out.println("������ ���ض�");
		}
		
		if(avg >= 90) {
			System.out.println("��");
		} else if(avg >= 80) {
			System.out.println("��");
		} else if(avg >= 70) {
			System.out.println("��");
		} else if(avg >= 60) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}
		}
	}
		