package br.edu.udc.es.dp.decorator;

public final class BlackCoffee implements Coffee {
	
    @Override
    public final double getCost() {
        return 1;
    }
    @Override
    public final String getIngredients() {
        return "Coffee";
    }
}