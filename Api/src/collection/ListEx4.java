package collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/* ArrayList vs LinkedList
 * - ���������� �߰�/���� �� ArrayList �� �� ����
 * - �߰� �����͸� �߰�/���� �� LinkedList�� �� �� ����
 */

public class ListEx4 {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
	
		//�߰� 
		list.add("���");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("�ٳ���");  
		list.add("������");

		System.out.println(list);
	}
}
