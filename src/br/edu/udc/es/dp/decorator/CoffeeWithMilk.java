package br.edu.udc.es.dp.decorator;

public class CoffeeWithMilk extends CoffeeDecorator {
	
	public CoffeeWithMilk(Coffee c) {
		super(c);
	}

	@Override
	public double getCost() {
		return super.getCost() + 0.5;
	}

	@Override
	public String getIngredients() {
		return super.getIngredients() + ", Milk";
	}
}