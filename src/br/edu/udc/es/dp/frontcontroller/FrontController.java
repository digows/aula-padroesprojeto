package br.edu.udc.es.dp.frontcontroller;

public class FrontController {
	
	public void handleRequest(String request) {
		final AbstractTela tela = this.getTela(request);
		tela.exibir();
	}

	private AbstractTela getTela(String request) {
		try {
			final Class<?> telaClass = Class.forName("br.edu.udc.es.dp.frontcontroller." + request);
			return (AbstractTela) telaClass.newInstance();
		} catch (Exception e) {
			throw new IllegalArgumentException(e);
		}
	}
}
