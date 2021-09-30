import java.util.Scanner;

// 중간고사 : 
// 기말고사 :
// --------
// 평균 :  
// 소수점 한 자리만
public class CSMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("중간고사 : ");
		int middle = k.nextInt();
		
		System.out.print("기말고사 : ");
		int final2 = k.nextInt();
		
		double avg = (middle + final2) / 2.0;
		System.out.printf("평균 : %.1f\n", avg);

		if(avg >= 90) {
			System.out.println("수");
		}else {
			System.out.println("뒤질래?");
		}
		if(avg >= 80) { 
			System.out.println("다음엔 잘해라");
		}
		
		if(avg >= 90) {
			System.out.println("수");
		} else if(avg >= 80) {
			System.out.println("우");
		} else if(avg >= 70) {
			System.out.println("미");
		} else if(avg >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}
		}
	}
		