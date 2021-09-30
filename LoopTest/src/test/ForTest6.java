package test;

public class ForTest6 {

	public static void main(String[] args) {
		//구구단 반복
		
		
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.printf("%d * %d = %2d\t",i,j,i*j);
				
			}
	//행과 열을 가진 for 문은 필연적으로 두 개의 for 문이 필요하다. 
	//다만 행과 열이 여러개 있는 형태에는 for 문이 세 개까지 필요하다.
		}
		System.out.println();

		
	}
}
