package arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysEx4 {
	public static void main(String[] args) {
		//asList() : List�� ũ�⸦ ������ �� ����
		List<String> list = Arrays.asList("apple","���","lemon"); 
		//list.add("����"); //UnsupportedOperationException
		System.out.println(list);
		
		List<String> list1 = new ArrayList<String>();
		list1.add("apple");
		list1.add("���");
		list1.add("lemon");
		
		List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5)); // asList ������� => (Integer... a) : ũ�Ⱑ ������ ���� �ʴ�.
		list2.add(6);
		System.out.println(list2);
		
		
		
	
	
	}

}
