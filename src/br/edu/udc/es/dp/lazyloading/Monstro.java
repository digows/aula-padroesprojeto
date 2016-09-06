package br.edu.udc.es.dp.lazyloading;

import java.util.Set;

public class Monstro {
	
	private Set<Maldade> maldades;
	
	public Set<Maldade> getMaldades() {
		if ( this.maldades == null ) {
			this.maldades = MaldadeDAO.listarTodas();
		}
		return this.maldades;
	}
}
