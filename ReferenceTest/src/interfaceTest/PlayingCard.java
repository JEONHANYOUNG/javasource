package interfaceTest;

public interface PlayingCard {
	int SPADE = 4; // public static final 생략 가능
    final int DIAMOND =3; //public static final
	static int HERAT =2;
	
	public abstract String getCardNumber();
	String getCardkind(); //public abstract 생략가능
}
