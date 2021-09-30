package exception;
// Exception(예외사항)
// CheckedException : compile 시 나타나는 예외
// UnCheckedException : run 타임시 나타나는 예외
public class CheckedException {

	public static void main(String[] args)  { // <- 빨간색이 발생한 후 첫번째 방법  (throws ClassNotFoundException)
		//ClassNotFoundException
		try {// <- 빨간색이 발생한 후 en번째 방법
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
