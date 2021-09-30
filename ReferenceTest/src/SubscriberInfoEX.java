
public class SubscriberInfoEX {
	public static void main(String[] args) {
		SubscriberInfo info1 = new SubscriberInfo("홍길동", "hong123", "hong123");
		SubscriberInfo info2 = new SubscriberInfo("홍길동", "hong123", "hong123", "010-1234-5678", "서울시 종로구");

		// 홍길동 전화번호 추가
		info1.setNumber("010-1234-1234");

		// 성춘향 주소 변경
		info2.setAddrees("서울시 성동구");
	}

}
