package ch18;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAcessFileTest {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		
		rf.writeInt(100);
		System.out.println("pos: " + rf.getFilePointer());
		rf.writeDouble(3.14);
		System.out.println("pos: " + rf.getFilePointer());
		rf.writeUTF("�ȳ��ϼ���");//�ѱ��ڴ� 3byte�׸��� ���������� newLine 2byte
		System.out.println("pos: " + rf.getFilePointer());
		
		rf.seek(0);
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}

}
