package lambda;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FromFileEx1 {
	public static void main(String[] args) {
		// data.txt �о ȭ�� ���
		Path path = Paths.get("src/lambda/data.txt");
		
		try { // defaultCharset�� ���ڵ� ������ ���� �������� �� (�⺻ MS949�̰� UTF-8�� �ѱ۷� �ٲٷ��� �������־�� ��)
			Files.lines(path,Charset.defaultCharset()).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();    
		}
		
	}
}
