package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx4 {

	public static void main(String[] args, byte[] datas) {
		InputStream in = System.in;
		OutputStream out = System.out;
		
		byte[] dates=new byte[100];
		
		//����ڷκ��� �����͸� �̸��� �ϰ� ���� ���� �Է¹��� �Ŀ�
		//String ��ü�� ��ȯ
		
		System.out.println("�̸�  : ");
		try {
		int nameBytes= in.read(datas); // ȫ�浿 ���ʹ� �ΰ��� ����Ǿ��� ����
		//Enter : carriage return => 13�� , line feed : 10 ��
		String name = new String(dates,0,nameBytes-2); 
		
		
		System.out.println("�ϰ� ���� ��  : ");
		int commentsBytes= in.read(datas); // ȫ�浿���ʹ� �ΰ��� ����Ǿ��� ����
		String comment = new String(dates, 0, commentsBytes);
	
		System.out.println("�Է��� �̸� : "+name);
		System.out.println("�Է��ϰ� ���� �� : "+comment);
	
	} catch(IOException e) {
		e.printStackTrace();
    } finally {
		try {
			in.close();
			out.close();
	  } catch (Exception e2) {
			e2.printStackTrace();
	  }
	}
  }
}