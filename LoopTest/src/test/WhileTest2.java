package test;

public class WhileTest2 {

	public static void main(String[] args) {
		
		int sum = 0, i=1;
		while (i < 101) {
			sum = sum + i;
			i++;
		}
		System.out.println("1~100±îÁö ÇÕ" + sum);
	
	i=1;
	while (i < 10) {
		System.out.println("2* "+i+" = "+(2*i));
		i++;
	}
	

	}
}

