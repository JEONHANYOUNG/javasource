package io;

import java.io.File;

/* File
 * ������ �ٷ�� ���� Ŭ����
 * ����(���丮) : /,\
 * 
 * \t, \n, \b...
 */

public class FileEX1 {
	public static void main(String[] args) {
		File file1 = new File("C:\\temp\\test1.txt");
		File file2 = new File("C:\\temp","test1.txt");
		
		File file3 = new File("C:\\temp");
		File file4 = new File(file3, "test1.txt");
		
		// File file4 = new File(new File("C:\\temp"), "test1.txt");

		
	}
}
