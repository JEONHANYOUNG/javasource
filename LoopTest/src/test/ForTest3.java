package test;

public class ForTest3 {
	public static void main(String[] args) {
		// 2*1=2 2*2=4 2*3=6
		// 2*2=4
		// 2*3=6
		// .....
		// 2*9=18

		for (int i = 0; i < 10; i++) {
			// System.out.println("2* "+i+" = "+(2*i));
			System.out.printf("2* %d = %d\t", i, (2 * i));
		}

	}

}
