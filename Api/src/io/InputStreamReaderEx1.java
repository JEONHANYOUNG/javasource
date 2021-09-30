package io;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

// 문자 변환 보조 스트림
// 바이트 기반 스트림 => Reader or writer로 변환해서 사용
// 인코딩 방식 지정(utf-8,euc-kr,ms949,ascii...)


public class InputStreamReaderEx1 {
	public static void main(String[] args) {
		
		try(InputStreamReader reader = new InputStreamReader // <- 인코딩을 지정해야한다면(제공) 
				(new FileInputStream("c:\\temp\\file1.txt"),"ms949"); // ms949가 필요하다면 InputStreamReader 사용할 수 있다.
			FileWriter writer = new FileWriter("c:\\temp\\test3.txt")){
		
			char cbuf[]=new char[100];
			
			while (reader.read(cbuf)!=-1) {
				writer.write(cbuf);
			}
		
		} catch (Exception e) {
			e.printStackTrace();

	}
  }
}

