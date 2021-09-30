package afterschool;

import java.util.Iterator;
import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		// 1+2+3+4+5+6+7+8+9+10=55
		
		int sum = 0;
		
		for (int i = 1; i < 11; i++) {
			sum+=i;
			
			System.out.print(i);
		if (i<=9) {
			System.out.print("+");
		} else {
			System.out.print("=");
			System.out.print(sum);
		}
			
		}
	    	

	

}

}
