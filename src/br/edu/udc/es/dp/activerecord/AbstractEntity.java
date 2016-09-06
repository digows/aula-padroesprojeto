package br.edu.udc.es.dp.activerecord;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class AbstractEntity {

	private static Map<Long, AbstractEntity> entidades = new HashMap<>();
	
	private Long id;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public AbstractEntity save() {
		this.id = this.getId() == null ? new Random().nextLong() : this.getId();
		entidades.put(this.getId(), this);
		return this;
	}

	public void remove() {
		if ( this.getId() == null ) {
			throw new IllegalArgumentException("É necessário uma ID para excluir");
		}
		entidades.remove( this.getId() );
	}

	public static AbstractEntity findById(Long id) {
		if ( id == null ) {
			throw new IllegalArgumentException("É necessário uma ID");
		}
		return entidades.get(id);
	}
	
	public static Collection<AbstractEntity> all() {
		return entidades.values();
	}
	
	public static void clear() {
		entidades.clear();
	}
	
	public static WhereCondition where(String column, String value) {
		return new WhereCondition();
	}
	
	public static class WhereCondition {
		
		public WhereCondition and( String column, String value ) {
			return this;
		}
		public Collection<AbstractEntity> list() {
			return entidades.values();	
		}
	}
}
