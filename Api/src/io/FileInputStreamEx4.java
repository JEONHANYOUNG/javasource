package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStreamEx4 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(new File("C:\\temp\\Rolling.mp3"));
			fos = new FileOutputStream("C:\\temp\\Rolling_copy.mp3");
			byte[] datas = new byte[1024];
				
			while (fis.read(datas)!=-1) {
			fos.write(datas);
		}	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
		

	}

