package afterschool;

import java.util.Scanner;

public abstract class Converter {
	abstract protected double convert(double src); // 추상메소드
	abstract protected String getSrcString(); // 추상메소드
	abstract protected String getDestString(); // 추상메소드
	protected void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString()+ "을 " + getDestString() + " 로 바꿉니다.");
		System.out.println(getSrcString() + "을 입력하세요>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환결과 : "+ res+getDestString()+ "입니다");
        scanner.close();
         }
}

