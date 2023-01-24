package ch19;

public class WippingCream extends Decorator {

	public WippingCream(Coffee coffee) {
		super(coffee);
	}
	@Override
	public void brewing() {
		super.brewing();
		System.out.println(" Adding Wipping Cream");
	}

}
