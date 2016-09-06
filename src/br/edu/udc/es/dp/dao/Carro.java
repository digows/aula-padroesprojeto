package br.edu.udc.es.dp.dao;

public class Carro implements IEntity<Long> {
	private Long id;
	@Override
	public Long getID() {
		return id;
	}

	@Override
	public void setID(Long id) {
		this.id = id;
	}

}
