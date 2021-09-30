package ClassTest;

public class CardEX {

	public static void main(String[] args) {
		Card card1 = new Card("space", 7);
		cardprint(card1);

		// static field Card.width should be accessed in a static way
		// card1.width =10;
		// card1.height= 7;

		Card card2 = new Card("heart", 2);
		cardprint(card2);
	}

	static void cardprint(Card card) {
		System.out.println("���� : " + card.getNumber());
		System.out.println("��� : " + card.getKind());
		System.out.printf("ī�� ũ��(%d,%d)\n", card.width, card.height);
		System.out.println();
	}
}
