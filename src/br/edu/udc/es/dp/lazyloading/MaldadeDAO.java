package br.edu.udc.es.dp.lazyloading;

import java.util.HashSet;
import java.util.Set;

public class MaldadeDAO {

	public static Set<Maldade> listarTodas() {
		final Set<Maldade> maldades = new HashSet<>();

		try {
			System.out.println("Carregando maldades...");
			maldades.add(new Maldade());
			maldades.add(new Maldade());
			maldades.add(new Maldade());
			maldades.add(new Maldade());
			maldades.add(new Maldade());
			maldades.add(new Maldade());
			
			Thread.sleep(1000);
			System.out.println("Maldades carregadas.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return maldades;
	}
}
