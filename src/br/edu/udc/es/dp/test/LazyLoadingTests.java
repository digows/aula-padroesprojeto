package br.edu.udc.es.dp.test;

import br.edu.udc.es.dp.lazyloading.Monstro;

public class LazyLoadingTests {
	
	public static void main(String[] args) {
		
		final Monstro monstro = new Monstro();
		System.out.println( monstro.getMaldades() );
		System.out.println( monstro.getMaldades() );
		System.out.println( monstro.getMaldades() );
		System.out.println( monstro.getMaldades() );
		System.out.println( monstro.getMaldades() );
		System.out.println( monstro.getMaldades() );
	}
}
