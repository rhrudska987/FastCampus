package ch19;

public class CoffeeTest {

	
	public static void main(String[] args) {
		Coffee etiopiaCoffee = new EtiopiaAmericano();
		etiopiaCoffee.brewing();
		System.out.println();
		
		Coffee etiopiaLatte = new Latte(new EtiopiaAmericano());
		etiopiaLatte.brewing();
		System.out.println();
		
		Coffee etiopiaMoca = new Moca(new Latte(new EtiopiaAmericano()));
		etiopiaMoca.brewing();
		System.out.println();
		
		Coffee kenyaCoffee = new WippingCream(new Moca(new Latte(new KenyaAmericano())));
		kenyaCoffee.brewing(); 
	}
}
