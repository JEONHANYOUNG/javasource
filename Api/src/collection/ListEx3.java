package collection;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import java.util.List;
import java.util.List;
import java.util.List;

public class ListEx3 {
	public static void main(String[] args) {
	
	//����
	List<Member> list = new ArrayList<Member>();
	
	//�߰�
	list.add(new Member("hong", "hong1234", "ȫ�浿"));
	list.add(new Member("hong1", "hong12345", "��浿"));
	list.add(new Member("hong2", "hong12346", "�ֱ浿"));
	list.add(new Member("hong3", "hong12347", "��浿"));
	list.add(new Member("hong4", "hong12348", "�ڱ浿"));

	// ��������
	System.out.println(list); //collection.Member@
	
	System.out.println();
	
	for(Member member:list) {
		System.out.println(member);
}
}
}