package br.edu.udc.es.dp.dao;

public interface IEntity<ID> {
	public ID getID();
	public void setID( ID id );
}
