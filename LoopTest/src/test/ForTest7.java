package test;

public class ForTest7 {
	public static void main(String[] args) {

		for (int i=0; i<=5; i++) {
			for(int j=5;j>=1;j--) {
				System.out.print(j<=i ? "*" : " ");
//				if(j <= i) {
//			System.out.print("*");
//		}else {
//				System.out.print(" ");
//		}
			}			
		System.out.println();
		}
	}
}