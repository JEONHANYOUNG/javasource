package io;

import java.io.FileReader;
import java.io.Reader;

/* 처리할 파일이 문자라면 Reader, Writer가 편함
 * 
 * char 형태로 처리
 * 
 */

public class FileReaderEx2 {
	public static void main(String[] args) {
		// 문자면 read나 reader 사용 가능
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
