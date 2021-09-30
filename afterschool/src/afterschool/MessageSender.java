package afterschool;

public abstract class MessageSender {
	// 1) 받는 사람,내용,보내는 사람
	private String receiverName;
	private String message;
	private String senderName;

	// 2) 생성자 만들기
	public MessageSender() {
		super();
	}

	public MessageSender(String receiverName, String message, String senderName) {
		super();
		this.receiverName = receiverName;
		this.message = message;
		this.senderName = senderName;
	}

	// 보낸다 => 1번 방식
	//public void sendMessage() {
	//	System.out.println("보낸다");
	//}

	//2번 방식 : MessageSender 객체 생성 x
	//       : MessageSender 는 자식클래스를 통해서만 사용하겠다.
	public abstract void sendMessage();

}
