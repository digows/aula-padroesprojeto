package br.edu.udc.es.dp.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractDAO<T extends IEntity<ID>, ID> implements IDAO<T, ID> {
	
	protected Map<ID, T> entidades = new HashMap<>();
	
	@Override
	public T insert(T entidade) {
		this.entidades.put(entidade.getID(), entidade);
		return entidade;
	}

	@Override
	public T update(T entidade) {
		this.entidades.put(entidade.getID(), entidade);
		return entidade;
	}

	@Override
	public void remove(ID id) {
		this.entidades.remove(id);
	}

	@Override
	public T findById(ID id) {
		return this.entidades.get(id);
	}

	@Override
	public Collection<T> listAll() {
		return this.entidades.values();
	}
}