package test;

import java.util.Scanner;

public class ForTest5 {
	public static void main(String[] args) {
		// **********
		// **********
		// **********
		// **********
		// **********

		// 이중 for 실행 순서
		// ① int i=0;
		// ② i<3;
		// ③ 안쪽 for 문의 int j=0;
		// ④ j,3;
		// ⑤ System.out.print("*"); *
		// ⑥ j++ => j=1
        // ⑦ j<3;
		// ⑧ System.out.print("*"); **
		// ⑨ j++ => j=2
		// ⑩ j<3;
		// ⑪ System.out.print("*"); ***
		// ⑫ j++ => j=3 
		// ⑬ j<3; => 안쪽 for 문 종료
        // ⑭ System.out.println();
		
		
		// ① i++; i=1
		// ② i<3;
        // ③ 안쪽 for 문의 int j=0;
		// ***
		// ***

		
		// ① i++; i=2
		// ② i<3;
        // ③ 안쪽 for 문의 int j=0; ~~~ ⑭ 실행
		// ***
		// ***
		// ***

		// ① i++; i=3
		// ② i<3; => 바깥 for 문 종료
        

		
	//	for (int i = 0; i < 1; i++) {
	//		for (int j = 0; j < 10; j++) {
	//			System.out.print("*");
	//		}
	//		System.out.println();
	//		
	//		for (int j=1;j<=1;j++) {
	//			System.out.print("*");	
	//		}
	//		System.out.println();
	//		
	//		for (int j=1;j<=2;j++) {
	//			System.out.print("*");	
	//		}
	//		System.out.println();
			
	//		for (int j=1;j<=3;j++) {
	//			System.out.print("*");	
//			}
//			System.out.println();
			
//			for (int j=1;j<=4;j++) {
//				System.out.print("*");	
//			}
//			System.out.println();
			
//			for (int j=1;j<=5;j++) {
//				System.out.print("*");	
//			}
//			System.out.println();
			
//			for (int j=1;j<=6;j++) {
//				System.out.print("*");	
//			}
//			System.out.println();
			
				for(int i=0;i<=10;i++) {
					for(int j=1;j<=i;j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				
				
				
		}
	}


