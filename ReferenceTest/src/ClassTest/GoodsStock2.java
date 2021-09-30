package ClassTest;

public class GoodsStock2 {
	// 속성 : 상품코드(p12345), 재고수량(100)
	private String code;
	private int stockNum; // 10

	// 기본 생성자
	GoodsStock2() {
	}

	// 생성자 오버로딩

	// 멤버변수 초기화 목적
	GoodsStock2(String code, int stockNum) {
		this.code = code;
		this.stockNum = stockNum;
	}

	// 기능 : 재고수량 증가(입력값 수량, 출력값은 없음)
	void addStock(int amount) {
		stockNum += amount;
	}

	// 재고수량 감소(입력값 수량, 출력값은 현재 재고수량)
	int subtrackStock(int amount) {
		if (stockNum > amount) {
			stockNum -= amount;
		}
		return stockNum;
	}

	// 현재 재고수량을 리턴하는 기능
	int getStockNum() {
		return stockNum;
	}

}
