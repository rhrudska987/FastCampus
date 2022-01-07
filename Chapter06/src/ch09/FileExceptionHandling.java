package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {
		/*
		 * FileInputStream fis = null;
		 * 
		 * try { fis = new FileInputStream("a.txt");//주소가 없으면 먼저 프로젝트 밑에서 찾음
		 * 
		 * } catch (FileNotFoundException e) { e.printStackTrace(); return; } finally {
		 * if(fis != null) { try { fis.close(); }catch(IOException e) {
		 * e.printStackTrace(); } } System.out.println("finally"); }
		 * System.out.println("end");
		 */
		
		//자바7부터는 finally를 사용할 필요 없음,뿐만 아니라 자동으로 close()가 됨
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