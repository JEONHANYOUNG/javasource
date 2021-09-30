package exception;

public class LoginEx {

	public static void main(String[] args) {
		try { 
			login("white", "12345");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			login("blue", "54321");
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
	}
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		//id�� "blue"�� �ƴ϶�� NotExistIDException �߻���Ŵ
		if(!id.contentEquals("blue")) {
		throw new NotExistIDException("���̵� �������� �ʽ��ϴ�.");
		}
		
		//password�� "12345"�� �ƴ϶�� WrongPasswordException �߻�
		if(!password.equals("12345")) {
			throw new WrongPasswordException("��й�ȣ�� Ʋ���ϴ�.");
		}
	}

}