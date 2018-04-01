package using_interfaces;

public class Espresso implements Beverage {
	String description;
	public Espresso() {
		description = "Espresso";
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
