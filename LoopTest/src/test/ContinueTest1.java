package test;

// continue; 반복문 안에서 사용되며, 블록 내에서 continue 문이
// 실행되면 for문의 증감식, while조건식으로 이동


public class ContinueTest1 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i%2!=0) { //홀수
				continue;
			}
			System.out.println(i);
			
		}

	}

}
