package using_interfaces;

public class Decaf implements Beverage {
	String description;

	public Decaf() {
		description = "Decaf";
	}

	@Override
	public double cost() {
		return 1.99;
	}

	@Override
	public String getDescription() {
		return description;
	}
}
