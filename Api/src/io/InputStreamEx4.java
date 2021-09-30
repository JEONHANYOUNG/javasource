package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx4 {

	public static void main(String[] args, byte[] datas) {
		InputStream in = System.in;
		OutputStream out = System.out;
		
		byte[] dates=new byte[100];
		
		//사용자로부터 데이터를 이름과 하고 싶은 말을 입력받은 후에
		//String 객체로 변환
		
		System.out.println("이름  : ");
		try {
		int nameBytes= in.read(datas); // 홍길동 엔터는 두개의 연결되어져 있음
		//Enter : carriage return => 13번 , line feed : 10 번
		String name = new String(dates,0,nameBytes-2); 
		
		
		System.out.println("하고 싶은 말  : ");
		int commentsBytes= in.read(datas); // 홍길동엔터는 두개의 연결되어져 있음
		String comment = new String(dates, 0, commentsBytes);
	
		System.out.println("입력한 이름 : "+name);
		System.out.println("입력하고 싶은 말 : "+comment);
	
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
