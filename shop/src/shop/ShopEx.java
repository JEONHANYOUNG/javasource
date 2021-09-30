package shop;

public class ShopEx {
	public static void main(String[] args) {
		Myshop shop = new Myshop();

		// 상점 이름 지정
		shop.SetTitle("Java Shop");
		// 고객 생성
		shop.genUser();
		// 제품 생성
		shop.genProduct();
        //상점 시작
		shop.start();
	}

}
