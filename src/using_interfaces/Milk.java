package using_interfaces;

public class Milk implements CondimentDecorator{
	Beverage beverage;
	
	public Milk(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public double cost() {
	
		return 0.10 + this.beverage.cost();
	}

	@Override
	public String getDescription() {
		
		return this.beverage.getDescription() + ", Milk";
	}
}
