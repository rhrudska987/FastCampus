package ch19;

public class Moca extends Decorator {

	public Moca(Coffee coffee) {
		super(coffee);
	}
	@Override
	public void brewing() {
		super.brewing();
		System.out.print(" Adding Moca");
	}
	
}
