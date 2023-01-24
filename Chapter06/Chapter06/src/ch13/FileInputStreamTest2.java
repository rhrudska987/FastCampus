package ch13;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt");
			int i;
			while((i=fis.read()) != -1) {
				System.out.println((char)i);
			}
			
		}catch(IOException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("end");
	}

}
