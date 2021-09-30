
public class SubscriberInfo {
	// 속성 - 이름,아이디,패스워드,전화번호,주소
	private String name;
	private String id;
	private String password;
	private String number;
	private String addrees;

	// 생성자 - 이름,아이디,패스워드만 초기화를 한 후 객체 생성
	public SubscriberInfo(String name, String id, String password) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
	}

	// - 이름,아이디,패스워드,전화번호,주소를 초기화 한 후 객체 생성
	public SubscriberInfo(String name, String id, String password, String number, String addrees) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.number = number;
		this.addrees = addrees;
	}

//기능 - 비밀번호 변경, 전화번호 변경, 주소 변경
	// setter 메소드
	public void setPassword(String password) {
		this.password = password;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setAddrees(String addrees) {
		this.addrees = addrees;
	}

}
