import java.util.Scanner;

// ��Ʈ
// ���� :
// ------------
// 0000����ġ ������
// 10000�� �̻� ���Ž� ���ʽ�����Ʈ 50�� �� 

// �帧 ����
// ���ǹ�
// �ݺ���
// ���ǹ� : Ư�� ���� ���� �帧�� �̾�������

public class ConditionString {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("���� : ");
		int price = k.nextInt();
		System.out.println("-----");
		System.out.printf("%d����ġ ����\n", price);
		// �帧 ����
		// ���ǹ�
		// �ݺ���
		// ���ǹ� : Ư�� ���� ���� �帧�� �̾�������
		// if
		// switch
		int point = price / 100;
		if (price >= 10000) {
			point += 50;		
			}
		if ((price > 20000) && (price < 50000)) 
			point += 100;	
		
		else {
			point +=10;
		}
		
		System.out.printf("���� ����Ʈ : %d\n", point);

	

		}
	}
	
