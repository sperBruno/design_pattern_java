package using_interfaces;

public class Whip implements CondimentDecorator {
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return 0.10 + this.beverage.cost();
	}

}
