package interfaceTest;

public class PlayEx {
	public static void main(String[] args) {
		// Cannot instantiate the type PlayingCard
		// 객체 생성 불가
		// PlayingCard card = new PlayingCard();

		// PlayingCard.DIAMOND;

		PlayingCard card = new Playing();
		card.getCardkind();

	}
}
