package using_interfaces;

public class HouseBlend implements Beverage {
	String description;
	public HouseBlend() {
		description = "House Blend Coffee";
	}

	@Override
	public double cost() {
		return 0.89;
	}

	@Override
	public String getDescription() {
		
		return description;
	}

}
