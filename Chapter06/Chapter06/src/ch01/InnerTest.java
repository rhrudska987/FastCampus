package ch01;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass(){
		inClass = new InClass();
	}
	
	private class InClass{
		int iNum = 100;
		
		
		void inTest() {
			
			System.out.println("OutClass num = " + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass iNum = " +iNum + "(���� Ŭ������ �ν��Ͻ� ����)");
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	static class InStackClass{
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {	
			System.out.println("InClass num = " +sInNum + "(���� Ŭ������ ����ƽ ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass iNum = " +iNum + "(���� Ŭ������ �ν��Ͻ� ����)");
		}
		
		static void sTest() {
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("OutClass sInNum = " +sInNum + "(���� Ŭ������ ����ƽ ����)");
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		
		/*
		 * OutClass outClass = new OutClass(); outClass.usingClass();
		 */
		
		//OutClass.InClass inner = OutClass.new InClass(); ���� InClass�� private�� �ƴ� ��� �̷������� ����
		
		OutClass.InStackClass sInClass = new OutClass.InStackClass();
		sInClass.inTest();
		
		System.out.println();
		
		OutClass.InStackClass.sTest();
	}
}
