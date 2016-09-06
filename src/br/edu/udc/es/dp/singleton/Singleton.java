package br.edu.udc.es.dp.singleton;
public class Singleton {

	private static Singleton instancia;
	
	private Object dados;

	private Singleton() {
	}

	public static synchronized Singleton getInstance() {
		if (instancia == null)
			instancia = new Singleton();
		return instancia;
	}

	public Object getDados() {
		return dados;
	}
	public void setDados(Object dados) {
		this.dados = dados;
	}
}