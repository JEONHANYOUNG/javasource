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
	
		//����
		List.remove(1); // JDBC ����
		System.out.println(List);

		//����
		List.sort(Comparator.reverseOrder()); //��������, naturalOrder() : ��������
		System.out.println(List);  
	}

}
