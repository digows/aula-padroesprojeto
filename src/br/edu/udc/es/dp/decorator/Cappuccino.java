package br.edu.udc.es.dp.decorator;

public class Cappuccino extends CoffeeWithMilk {
    public Cappuccino(Coffee c) {
        super(c);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }
    
    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Cream";
    }
}