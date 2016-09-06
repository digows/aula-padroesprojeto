package br.edu.udc.es.dp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.udc.es.dp.decorator.BlackCoffee;
import br.edu.udc.es.dp.decorator.Cappuccino;
import br.edu.udc.es.dp.decorator.CoffeeWithMilk;

public class DecoratorTests {
	
	@Test
	public void test() {
		final BlackCoffee coffee = new BlackCoffee();
		
		//decora a instancia de coffee com Milk
		final CoffeeWithMilk coffeeWithMilk = new CoffeeWithMilk(coffee);
		assertEquals(coffee.getCost()+0.5, coffeeWithMilk.getCost(), 0);
		
		//decora a instancia de coffee com Cappuccino
		final Cappuccino cappuccino = new Cappuccino(coffee);
		assertEquals(coffeeWithMilk.getCost()+2.0, cappuccino.getCost(), 0);
	}
}
