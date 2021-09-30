package shop;

import java.security.PublicKey;
import java.util.Scanner;

public class Myshop implements Ishop {

	private String title;
	private Scanner sc = new Scanner(System.in);
	private String selUser;

	// ��ٱ��� �迭
	private Product[] carts = new Product[10];

	// ȸ������ �迪 - ȸ���̸�, ����Ÿ��
	private User users[] = new User[2];

	// ��ǰ���� �迭 - ��ǰ�̸�, ����, ������
	private Product products[] = new Product[5];

	@Override
	public void SetTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		// �� 2�� ����
		users[0] = new User("ȫ�浿", PayType.CARD);
		users[1] = new User("������", PayType.CASH);
	}

	@Override
	public void genProduct() {
		// ��ǰ 5�� ����
		// SmartTv(2��), Cellphone(3��)

		products[0] = new Cellphone("ZǮ��", 1500000, "SKT");
		products[1] = new Cellphone("������ 14", 1520000, "KT");
		products[2] = new Cellphone("�Ｚ 3D TV", 3500000, "4K");
		products[3] = new Cellphone("LG ����Ʈ TV", 3000000, "4K");
		products[4] = new Cellphone("�Ｚ ��Ʈ�� TV", 2800000, "Full HD");

	}

	@Override
	public void start() {
		System.out.println(title + " : ����ȭ�� - ��������");
		System.out.println("=============================");

		for (int i = 0; i < users.length; i++) {
			System.out.printf("[%d] %s(%s)\n", i, users[i].getName(), users[i].getPayType());
		}
		System.out.println("[x] ����");
		System.out.print("���� : ");

		String input = sc.next();
		System.out.println("### " + input + " ���� ###");

		// ����ڰ� 0,1 ������ ���
		// x �� �Է��� ��� => ����
		switch (input) {
		case "x":
			System.exit(0);
			break;
		default: // 0,1
			selUser = input;
			productlist();
			break;
		}
	}

	private void productlist() {
		System.out.println(title + " : ��ǰ ��� - ��ǰ ����");
		System.out.println("===============================");

		// ��ǰ���� ��� =>

		for (int i = 0; i < products.length; i++) {
			System.out.printf("[%d]", i);
			products[i].printDetail();

		}
		System.out.print("[h] ����ȭ��");
		System.out.print("[c] üũ�ƿ�");
		System.out.print("���� : ");

		// ����� �Է� => ��ǰ���� 0~4(��ٱ��Ͽ� ���� ������ ��ǰ ���, h(����ȭ��), c(üũ�ƿ�)
		String input = sc.next();

		switch (input) {
		case "h":
			// ����ȭ�� �����ֱ�
			start();
			break;
		case "c":
			checkOut();
			break;
		default: // "0","1","2","3","4"
			// ����ڰ� ������ ��ǰ�� carts�� ���
			for (int i = 0; i < carts.length; i++) {
				if (carts[i] == null) {
					carts[i] = products[Integer.parseInt(input)];
					break;
				}
			}
			// ��ǰ ��� �����ֱ�
			productlist();
			break;
		}

	}

	private void checkOut() {
		// TODO Auto-generated method stub
		
	}

	private void checkOut(Integer Integar) {
		System.out.println(title + " : üũ�ƿ�");
		System.out.println("============================");

		int total = 0;

		// ��ٱ��� ��� ���
		for (int i = 0; i < carts.length; i++) {
			if (carts[i] != null) {
				System.out.printf("[%d] $s (%s)\n", i, carts[i].getPname(), carts[i].getPrice());
				total += carts[i].getPrice(); // �����ݾ�
			}
		}
		System.out.println("============================");
		System.out.println("���� ��� : " + users[Integar.parseInt(selUser)].getPayType());
		System.out.println("�հ� :  " + total);
		System.out.println("[p] ����, [q] : �����Ϸ� ");
		System.out.println("���� : ");

		String input = sc.next();

		// p(��ǰ��� ȭ��), q("������ �Ϸ�Ǿ����ϴ�. �����մϴ�.")

		switch (input) {
		case "p":
			productlist();
			break;
		case "q":
			System.out.println("������ �Ϸ�Ǿ����ϴ�. �����մϴ�.");
			break;
		default:
			break;
		}
	}
}