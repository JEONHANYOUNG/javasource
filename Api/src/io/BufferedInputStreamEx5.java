package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx5 {
	public static void main(String[] args) {
	
		
		//FillInputStream만 사용하는 경우 + byte 배열 (빨라질려면 byte를 사용 해야함)
		//FilloutputStream
		try(FileInputStream fis = new FileInputStream("c:\\temp\\Rolling.mp3")) {
			FileOutputStream fos = new FileOutputStream("c:\\temp\\Rolling_copy4.mp3");
			
			byte data[]=new byte[1024];
			
			long start = System.currentTimeMillis();
			while (fis.read(data)!=-1) {
				fos.write(data);
			}
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream + byte + FilloutputStream 사용시 " +(end-start));
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		//FillInputStream + BufferedInputStream + byte 배열  사용하는 경우, 속도가 더 빨라짐(3개 다쓰면)
		//FilloutputStream + BufferedoutputStream
		 try(FileInputStream fis = new FileInputStream("c:\\temp\\Rolling.mp3");
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream("c:\\temp\\Rolling_copy5.mp3");
			BufferedOutputStream bos = new BufferedOutputStream(fos)) {
						
			byte data[]=new byte[1024];
			
			long start = System.currentTimeMillis();
			while (bis.read(data)!=-1) {
				bos.write(data);
			}
			bos.flush();
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream + BufferedInputStream + byte 사용시 " +(end-start));
			} catch (Exception e) {
				e.printStackTrace();
		}
	}
}
