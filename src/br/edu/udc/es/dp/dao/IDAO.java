package br.edu.udc.es.dp.dao;

import java.util.Collection;

public interface IDAO<T extends IEntity<ID>, ID> {
	public T insert( T entidade );
	public T update( T entidade );
	public void remove( ID id );
	public T findById( ID id );
	public Collection<T> listAll();
}
