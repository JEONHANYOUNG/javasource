package afterschool;

public class SenderMain {

	public static void main(String[] args) {
	 //	MessageSender messageSender = new MessageSender(); (x)
		
	 // 객체 생성 => 아래의 두가지 방식을 허용하는 형태는 extends, implements
	 MessageSender messageSender = new EmailSender("홍길동", "안녕하세요", "성춘향", "안녕");
	 EmailSender emailSender =new EmailSender("홍길동", "안녕하세요", "성춘향", "안녕");
				
	}

}
