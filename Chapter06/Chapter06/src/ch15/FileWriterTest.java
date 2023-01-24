package ch15;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	
	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("writer.txt")){
			fw.write('A');
			char buf[] = {'B','C','D','E','F'};
			fw.write(buf);
			fw.write("안녕하세욧, 잘 써지네요");
			fw.write(76);
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("끝");
	}
}
