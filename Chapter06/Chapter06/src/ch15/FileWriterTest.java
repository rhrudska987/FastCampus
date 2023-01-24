package ch15;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	
	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("writer.txt")){
			fw.write('A');
			char buf[] = {'B','C','D','E','F'};
			fw.write(buf);
			fw.write("�ȳ��ϼ���, �� �����׿�");
			fw.write(76);
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("��");
	}
}
