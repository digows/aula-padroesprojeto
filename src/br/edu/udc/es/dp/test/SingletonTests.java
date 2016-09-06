package br.edu.udc.es.dp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import br.edu.udc.es.dp.singleton.Singleton;

public class SingletonTests {
	
	@Test
	public void garantirApenasUmaInstancia() {
		Singleton.getInstance().setDados( "Uma string" );

		Assert.assertEquals( Singleton.getInstance().getDados(), "Uma string");
	}
	
	@Test
	public void garantirApenasUmaInstancia2() {
		final long now = System.currentTimeMillis();
		
		final Singleton s1 = Singleton.getInstance();
		s1.setDados( now );
		
		final Singleton s2 = Singleton.getInstance();
		
		assertEquals(s1, s2);
		assertEquals(s1.getDados(), s2.getDados());
		assertEquals(s2.getDados(), now);
	}
}
