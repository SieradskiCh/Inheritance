
public class Runner
	{

	public static void main(String[] args)
		{
		Offices target = new Store();
		target.work();
		target.sell();
		System.out.println("");
		
		Homes paradise = new Bungalow();
		paradise.chill();
		paradise.sell();
		System.out.println("");
		
		Offices trumpTower = new Skyscrapers();
		trumpTower.work();
		trumpTower.sell();
		System.out.println("");
		
		Homes penthouse = new Apartments();
		penthouse.chill();
		penthouse.sell();
		System.out.println("");
		
		Store walmart = new Store();
		walmart.work();
		System.out.println("Over " + walmart.customersServed + " customers served!");
		System.out.println("");
		
		Skyscrapers rockefeller = new Skyscrapers();
		rockefeller.work();
		rockefeller.sell();
		System.out.println("");
		
		Bungalow resort = new Bungalow();
		resort.chill();
		resort.sell();
		System.out.println("");
		
		Apartments home = new Apartments();
		home.chill();
		home.sell();
		System.out.println("");
		
		Offices theOffice = new Offices();
		theOffice.work();
		theOffice.sell();
		System.out.println("");
		
		Homes house = new Homes();
		house.chill();
		house.sell();
		System.out.println("");
		
		}

	}
