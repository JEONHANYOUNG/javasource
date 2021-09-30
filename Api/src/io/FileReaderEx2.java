package io;

import java.io.FileReader;
import java.io.Reader;

/* ó���� ������ ���ڶ�� Reader, Writer�� ����
 * 
 * char ���·� ó��
 * 
 */

public class FileReaderEx2 {
	public static void main(String[] args) {
		// ���ڸ� read�� reader ��� ����
		try(Reader reader = new FileReader("c:\\temp\\file1.txt")) {
			
			char[] cbuf = new char[100];
			
			int readcharNo;
			
			while ((readcharNo= reader.read(cbuf)) != -1) {
				String data = new String(cbuf, 0 ,readcharNo);				
				System.out.println(data);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}