package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamEx3 {

	public static void main(String[] args) {
//		FileInputStream fis = null;
//		FileOutputStream fos = null;
//				
//		try {
//			fis = new FileInputStream(new File("C:\\temp\\picture.jpg"));
//			fos = new FileOutputStream("C:\\temp\\copy.jpg");
//		
//			byte[] datas =new byte[1024];
//			while (fis.read(datas)!=-1) {
//				fos.write(datas);				
//			}
//		
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				fis.close();
//				fos.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}

				//간단하게 방법
				try(FileInputStream fis = new FileInputStream(new File("C:\\temp\\picture.jpg"));
						FileOutputStream fos = new FileOutputStream("C:\\temp\\copy.jpg")) {
				
					byte[] datas =new byte[1024];
					while (fis.read(datas)!=-1) {
						fos.write(datas);				
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
	}

}
