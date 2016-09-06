package br.edu.udc.es.dp.test;

import org.junit.Test;

import br.edu.udc.es.dp.frontcontroller.FrontController;

public class FrontControllerTests {
	
	@Test
	public void devePassar()
	{
		final FrontController controller = new FrontController();
		controller.handleRequest("TelaUm");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void deveFalhar()
	{
		final FrontController controller = new FrontController();
		controller.handleRequest("EssaTelaNaoExiste");
	}
}
