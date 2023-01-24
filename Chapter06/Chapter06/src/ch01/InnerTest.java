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
			
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass iNum = " +iNum + "(내부 클래스의 인스턴스 변수)");
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	static class InStackClass{
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {	
			System.out.println("InClass num = " +sInNum + "(내부 클래스의 스태틱 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass iNum = " +iNum + "(내부 클래스의 인스턴스 변수)");
		}
		
		static void sTest() {
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("OutClass sInNum = " +sInNum + "(내부 클래스의 스태틱 변수)");
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		
		/*
		 * OutClass outClass = new OutClass(); outClass.usingClass();
		 */
		
		//OutClass.InClass inner = OutClass.new InClass(); 만약 InClass가 private이 아닐 경우 이런식으로 생성
		
		OutClass.InStackClass sInClass = new OutClass.InStackClass();
		sInClass.inTest();
		
		System.out.println();
		
		OutClass.InStackClass.sTest();
	}
}
