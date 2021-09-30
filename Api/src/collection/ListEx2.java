package collection;

import java.util.ArrayList;
import java.util.Comparator;


public class ListEx2 {
	public static void main(String[] args) {
		ArrayList<String> List = new ArrayList<>();
		
		List.add("java");
		List.add("JDBC");
		List.add("Servlet");
		List.add("jsp");
		List.add("java");

		System.out.println(List);
		
		List.add(2, "Oracle");
		
		System.out.println(List);
	
		//삭제
		List.remove(1); // JDBC 제거
		System.out.println(List);

		//정렬
		List.sort(Comparator.reverseOrder()); //내림차순, naturalOrder() : 오름차순
		System.out.println(List);  
	}

}
