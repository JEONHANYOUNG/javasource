package shop;

public class ShopEx {
	public static void main(String[] args) {
		Myshop shop = new Myshop();

		// ���� �̸� ����
		shop.SetTitle("Java Shop");
		// �� ����
		shop.genUser();
		// ��ǰ ����
		shop.genProduct();
        //���� ����
		shop.start();
	}

}
