package lambda;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FromFileEx1 {
	public static void main(String[] args) {
		// data.txt 읽어서 화면 출력
		Path path = Paths.get("src/lambda/data.txt");
		
		try { // defaultCharset은 인코딩 문제로 인해 변경해준 것 (기본 MS949이고 UTF-8인 한글로 바꾸려면 변경해주어야 함)
			Files.lines(path,Charset.defaultCharset()).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();    
		}
		
	}
}
