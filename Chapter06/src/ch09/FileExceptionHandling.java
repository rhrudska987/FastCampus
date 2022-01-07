package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {
		/*
		 * FileInputStream fis = null;
		 * 
		 * try { fis = new FileInputStream("a.txt");//�ּҰ� ������ ���� ������Ʈ �ؿ��� ã��
		 * 
		 * } catch (FileNotFoundException e) { e.printStackTrace(); return; } finally {
		 * if(fis != null) { try { fis.close(); }catch(IOException e) {
		 * e.printStackTrace(); } } System.out.println("finally"); }
		 * System.out.println("end");
		 */
		
		//�ڹ�7���ʹ� finally�� ����� �ʿ� ����,�Ӹ� �ƴ϶� �ڵ����� close()�� ��
		try(FileInputStream fis = new FileInputStream("a.txt")){
			System.out.println("read");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
}