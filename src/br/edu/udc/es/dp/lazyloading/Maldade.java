package br.edu.udc.es.dp.lazyloading;

import java.math.BigInteger;
import java.security.SecureRandom;

public class Maldade {
	private String nome;
	
	public Maldade() {
		this.nome = new BigInteger(20, new SecureRandom()).toString(32).toUpperCase();
	}

	@Override
	public String toString() {
		return this.nome;
	}
}
