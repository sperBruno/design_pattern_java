package using_interfaces;

public class Soy implements CondimentDecorator{
	
	Beverage beverage;
	
	public Soy(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		
		return 0.15 + this.beverage.cost();
	}

}
