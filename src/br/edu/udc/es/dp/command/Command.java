package br.edu.udc.es.dp.command;

public interface Command {
	public void execute();
	public void undo();
}