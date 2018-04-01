package using_interfaces;

public class DarkRoast implements Beverage {
	String description;

	public DarkRoast() {
		description = "Dark Roast";
	}

	@Override
	public double cost() {
		return 0.99;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

}
