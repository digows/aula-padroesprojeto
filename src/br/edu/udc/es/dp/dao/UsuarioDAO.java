package br.edu.udc.es.dp.dao;

import java.util.Collection;

public class UsuarioDAO extends AbstractDAO<Usuario, Long> {
	
	public Collection<Usuario> listByNome()
	{
		return this.entidades.values();
	}
}
