import using_interfaces.Beverage;
import using_interfaces.DarkRoast;
import using_interfaces.Espresso;
import using_interfaces.HouseBlend;
import using_interfaces.Mocha;
import using_interfaces.Soy;
import using_interfaces.Whip;

/*import using_abstract.Beverage;
import using_abstract.DarkRoast;
import using_abstract.Espresso;
import using_abstract.HouseBlend;
import using_abstract.Mocha;
import using_abstract.Soy;
import using_abstract.Whip;*/

public class Main {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription()
		+ "$ " + beverage.cost());
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription()
		+ "$ "  + beverage2.cost());
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + ", " + beverage3.cost());

	}

}
